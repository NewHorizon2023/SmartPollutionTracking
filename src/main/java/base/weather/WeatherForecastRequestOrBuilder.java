// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Weather.proto

package base.weather;

public interface WeatherForecastRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Weather.WeatherForecastRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double latitude = 1;</code>
   */
  double getLatitude();

  /**
   * <code>double longitude = 2;</code>
   */
  double getLongitude();

  /**
   * <code>string start_date = 3;</code>
   */
  java.lang.String getStartDate();
  /**
   * <code>string start_date = 3;</code>
   */
  com.google.protobuf.ByteString
      getStartDateBytes();

  /**
   * <code>string end_date = 4;</code>
   */
  java.lang.String getEndDate();
  /**
   * <code>string end_date = 4;</code>
   */
  com.google.protobuf.ByteString
      getEndDateBytes();
}