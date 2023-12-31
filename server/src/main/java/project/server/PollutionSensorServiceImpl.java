package project.server;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import base.pollutionSensor.PollutionHistoryResponse;
import base.pollutionSensor.PollutionReading;
import base.pollutionSensor.PollutionSensorGrpc.PollutionSensorImplBase;
import project.pojo.PollutionPojo;
import project.util.DataUtil;
import util.TimeUtil;

public class PollutionSensorServiceImpl extends PollutionSensorImplBase {

	/**
	 * Pollution history data.
	 */
	public static List<PollutionPojo> pollutionPojoList = new ArrayList<>();

	static {
		for (int i = 0; i < 3; i++) {
			PollutionPojo pojo = new PollutionPojo(53.349805, -6.26031, getPollutionLevel(), TimeUtil.getTimeNow());
			pollutionPojoList.add(pojo);
		}
	}

	/**
	 * <pre>
	 * RPC Method 1: GetPollutionLevel
	 * </pre>
	 */
	@Override
	public void getPollutionLevel(base.pollutionSensor.PollutionLocation request,
			io.grpc.stub.StreamObserver<base.pollutionSensor.PollutionReading> responseObserver) {

		double latitude = request.getLatitude();
		double longitude = request.getLongitude();

		for (int i = 0; i < 5; i++) {
			// Get pollution data.
			double level = getPollutionLevel();
			String timestamp = TimeUtil.getTimeNow();

			// Save pollution history data.
			PollutionPojo pojo = new PollutionPojo(latitude, longitude, level, timestamp);
			pollutionPojoList.add(pojo);

			// Build response data.
			PollutionReading.Builder builder = PollutionReading.newBuilder();
			builder.setPollutionLevel(level);
			builder.setTimestamp(timestamp);

			PollutionReading response = builder.build();
			responseObserver.onNext(response);

			try {
				// Give a 1 second gap to response
//				Thread.sleep(500);
			} catch (Exception e) {
				e.getStackTrace();
			}
		}
		// Response completed.
		responseObserver.onCompleted();
	}

	/**
	 * Get pollution history data by conditons.
	 * 
	 * <pre>
	 * RPC Method 2: GetPollutionHistory
	 * </pre>
	 */
	@Override
	public void getPollutionHistory(base.pollutionSensor.PollutionHistoryRequest request,
			io.grpc.stub.StreamObserver<base.pollutionSensor.PollutionHistoryResponse> responseObserver) {

		double latitude = request.getLatitude();
		double longitude = request.getLongitude();
		String startDate = request.getStartDate();
		String endDate = request.getEndDate();

		// Get pollution data by conditions.
		List<PollutionPojo> pojoList = queryPollutions(latitude, longitude, startDate, endDate);

		// Build response data.
		List<PollutionReading> pollutionReadingList = new ArrayList<>(pojoList.size());
		for (PollutionPojo pojo : pojoList) {
			pollutionReadingList.add(PollutionReading.newBuilder().setTimestamp(pojo.getTimestamp())
					.setPollutionLevel(pojo.getPollutionLevel()).build());
		}

		PollutionHistoryResponse response = PollutionHistoryResponse.newBuilder()
				.addAllPollutionReadings(pollutionReadingList).build();

		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	/**
	 * Simulate to obtain pollution level.
	 * 
	 * @return
	 */
	private static double getPollutionLevel() {
		return DataUtil.getRandomDoubleInRange(1, 5);
	}

	/**
	 * Filter the appropriate pollution data according to the conditions.
	 * 
	 * @param latitude
	 * @param longitude
	 * @param startDate
	 * @param endDate
	 * @return
	 */
	private static List<PollutionPojo> queryPollutions(double latitude, double longitude, String startDate,
			String endDate) {

		if (pollutionPojoList == null || pollutionPojoList.size() == 0) {
			return null;
		}

		// Fillter data by conditions and return.
		return pollutionPojoList.stream().filter(pojo -> pojo.getLatitude() == latitude)
				.filter(pojo -> pojo.getLongitude() == longitude)
				.filter(pojo -> pojo.getTimestamp().compareTo(startDate) >= 0
						&& pojo.getTimestamp().compareTo(endDate) <= 0)
				.collect(Collectors.toList());
	}

}
