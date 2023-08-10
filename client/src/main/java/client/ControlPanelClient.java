package client;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import base.controlPanel.ControlPanelGrpc;
import base.controlPanel.DeviceIdentifier;
import base.controlPanel.DeviceLog;
import base.controlPanel.DeviceStatusRequest;
import base.controlPanel.DeviceStatusResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class ControlPanelClient {

	private static final Logger logger = LoggerFactory.getLogger(ControlPanelClient.class);

	public static void setDeviceStatusInvoke() {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		try {
			ControlPanelGrpc.ControlPanelBlockingStub controlPanleService = ControlPanelGrpc.newBlockingStub(channel);
			DeviceStatusRequest.Builder builder = DeviceStatusRequest.newBuilder();
			builder.setDeviceId("0000");
			builder.setStatus(false);
			DeviceStatusRequest request = builder.build();
			DeviceStatusResponse response = controlPanleService.setDeviceStatus(request);
			String deviceId = response.getDeviceId();
			boolean status = response.getStatus();
			System.out.println(deviceId + ", " + status);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			channel.shutdown();
		}
	}

	public static void getDeviceStatusInvoke() {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		try {
			ControlPanelGrpc.ControlPanelStub controlPanelStub = ControlPanelGrpc.newStub(channel);
			StreamObserver<DeviceIdentifier> reqObserver = controlPanelStub
					.getDeviceStatus(new StreamObserver<DeviceStatusResponse>() {

						@Override
						public void onNext(DeviceStatusResponse value) {
							// TODO show device status on client
							System.out.println("method 2 gets a response...");

						}

						@Override
						public void onError(Throwable t) {
							logger.debug("Error happend on client!!!!");
							logger.debug("Error on client is: ", t);
						}

						@Override
						public void onCompleted() {
							logger.debug("Client recieves completed info from server.");
						}
					});
			// TODO set data through client here
			for (int i = 0; i < 10; i++) {
				DeviceIdentifier.Builder builder = DeviceIdentifier.newBuilder();
				// TODO set device id here
				builder.setDeviceId("003");
				DeviceIdentifier request = builder.build();
				reqObserver.onNext(request);
				Thread.sleep(2000);
			}

			reqObserver.onCompleted();
			// TODO for test
			channel.awaitTermination(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			channel.shutdown();
		}
	}

	public static void streamDeviceLogsInvoke() {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		try {
			ControlPanelGrpc.ControlPanelStub controlPanelStub = ControlPanelGrpc.newStub(channel);
			StreamObserver<DeviceIdentifier> requestObserver = controlPanelStub
					.streamDeviceLogs(new StreamObserver<DeviceLog>() {

						@Override
						public void onNext(DeviceLog value) {
							System.out.println("Client 1 value is: " + value);
						}

						@Override
						public void onError(Throwable t) {

						}

						@Override
						public void onCompleted() {
							System.out.println("Client 1 is complated");
						}
					});

			for (int i = 0; i < 10; i++) {
				DeviceIdentifier.Builder builder = DeviceIdentifier.newBuilder();
				builder.setDeviceId("0000-" + i);
				DeviceIdentifier request = builder.build();
				requestObserver.onNext(request);

				Thread.sleep(2000);
			}

			requestObserver.onCompleted();
			channel.awaitTermination(60, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.getStackTrace();
		} finally {
			channel.shutdown();
		}
	}

	public static void main(String[] args) {
//		setDeviceStatusInvoke();
		getDeviceStatusInvoke();
//		streamDeviceLogsInvoke();
	}

}
