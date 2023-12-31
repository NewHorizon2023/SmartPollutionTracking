// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Weather.proto

package base.weather;

/**
 * Protobuf type {@code Weather.WeatherForecastResponse}
 */
public  final class WeatherForecastResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Weather.WeatherForecastResponse)
    WeatherForecastResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use WeatherForecastResponse.newBuilder() to construct.
  private WeatherForecastResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private WeatherForecastResponse() {
    latitude_ = 0D;
    longitude_ = 0D;
    temperature_ = 0D;
    humidity_ = 0D;
    windSpeed_ = 0D;
    precipitation_ = 0D;
    timestamp_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private WeatherForecastResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 9: {

            latitude_ = input.readDouble();
            break;
          }
          case 17: {

            longitude_ = input.readDouble();
            break;
          }
          case 25: {

            temperature_ = input.readDouble();
            break;
          }
          case 33: {

            humidity_ = input.readDouble();
            break;
          }
          case 41: {

            windSpeed_ = input.readDouble();
            break;
          }
          case 49: {

            precipitation_ = input.readDouble();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            timestamp_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return base.weather.WeatherImpl.internal_static_Weather_WeatherForecastResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return base.weather.WeatherImpl.internal_static_Weather_WeatherForecastResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            base.weather.WeatherForecastResponse.class, base.weather.WeatherForecastResponse.Builder.class);
  }

  public static final int LATITUDE_FIELD_NUMBER = 1;
  private double latitude_;
  /**
   * <code>double latitude = 1;</code>
   */
  public double getLatitude() {
    return latitude_;
  }

  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private double longitude_;
  /**
   * <code>double longitude = 2;</code>
   */
  public double getLongitude() {
    return longitude_;
  }

  public static final int TEMPERATURE_FIELD_NUMBER = 3;
  private double temperature_;
  /**
   * <code>double temperature = 3;</code>
   */
  public double getTemperature() {
    return temperature_;
  }

  public static final int HUMIDITY_FIELD_NUMBER = 4;
  private double humidity_;
  /**
   * <code>double humidity = 4;</code>
   */
  public double getHumidity() {
    return humidity_;
  }

  public static final int WIND_SPEED_FIELD_NUMBER = 5;
  private double windSpeed_;
  /**
   * <code>double wind_speed = 5;</code>
   */
  public double getWindSpeed() {
    return windSpeed_;
  }

  public static final int PRECIPITATION_FIELD_NUMBER = 6;
  private double precipitation_;
  /**
   * <code>double precipitation = 6;</code>
   */
  public double getPrecipitation() {
    return precipitation_;
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 7;
  private volatile java.lang.Object timestamp_;
  /**
   * <code>string timestamp = 7;</code>
   */
  public java.lang.String getTimestamp() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timestamp_ = s;
      return s;
    }
  }
  /**
   * <code>string timestamp = 7;</code>
   */
  public com.google.protobuf.ByteString
      getTimestampBytes() {
    java.lang.Object ref = timestamp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      timestamp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (latitude_ != 0D) {
      output.writeDouble(1, latitude_);
    }
    if (longitude_ != 0D) {
      output.writeDouble(2, longitude_);
    }
    if (temperature_ != 0D) {
      output.writeDouble(3, temperature_);
    }
    if (humidity_ != 0D) {
      output.writeDouble(4, humidity_);
    }
    if (windSpeed_ != 0D) {
      output.writeDouble(5, windSpeed_);
    }
    if (precipitation_ != 0D) {
      output.writeDouble(6, precipitation_);
    }
    if (!getTimestampBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, timestamp_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (latitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(1, latitude_);
    }
    if (longitude_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, longitude_);
    }
    if (temperature_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, temperature_);
    }
    if (humidity_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, humidity_);
    }
    if (windSpeed_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, windSpeed_);
    }
    if (precipitation_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, precipitation_);
    }
    if (!getTimestampBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, timestamp_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof base.weather.WeatherForecastResponse)) {
      return super.equals(obj);
    }
    base.weather.WeatherForecastResponse other = (base.weather.WeatherForecastResponse) obj;

    boolean result = true;
    result = result && (
        java.lang.Double.doubleToLongBits(getLatitude())
        == java.lang.Double.doubleToLongBits(
            other.getLatitude()));
    result = result && (
        java.lang.Double.doubleToLongBits(getLongitude())
        == java.lang.Double.doubleToLongBits(
            other.getLongitude()));
    result = result && (
        java.lang.Double.doubleToLongBits(getTemperature())
        == java.lang.Double.doubleToLongBits(
            other.getTemperature()));
    result = result && (
        java.lang.Double.doubleToLongBits(getHumidity())
        == java.lang.Double.doubleToLongBits(
            other.getHumidity()));
    result = result && (
        java.lang.Double.doubleToLongBits(getWindSpeed())
        == java.lang.Double.doubleToLongBits(
            other.getWindSpeed()));
    result = result && (
        java.lang.Double.doubleToLongBits(getPrecipitation())
        == java.lang.Double.doubleToLongBits(
            other.getPrecipitation()));
    result = result && getTimestamp()
        .equals(other.getTimestamp());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + LATITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLatitude()));
    hash = (37 * hash) + LONGITUDE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLongitude()));
    hash = (37 * hash) + TEMPERATURE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTemperature()));
    hash = (37 * hash) + HUMIDITY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getHumidity()));
    hash = (37 * hash) + WIND_SPEED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getWindSpeed()));
    hash = (37 * hash) + PRECIPITATION_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrecipitation()));
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + getTimestamp().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static base.weather.WeatherForecastResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static base.weather.WeatherForecastResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static base.weather.WeatherForecastResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static base.weather.WeatherForecastResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static base.weather.WeatherForecastResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static base.weather.WeatherForecastResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static base.weather.WeatherForecastResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static base.weather.WeatherForecastResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static base.weather.WeatherForecastResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static base.weather.WeatherForecastResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static base.weather.WeatherForecastResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static base.weather.WeatherForecastResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(base.weather.WeatherForecastResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code Weather.WeatherForecastResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Weather.WeatherForecastResponse)
      base.weather.WeatherForecastResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return base.weather.WeatherImpl.internal_static_Weather_WeatherForecastResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return base.weather.WeatherImpl.internal_static_Weather_WeatherForecastResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              base.weather.WeatherForecastResponse.class, base.weather.WeatherForecastResponse.Builder.class);
    }

    // Construct using base.weather.WeatherForecastResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      latitude_ = 0D;

      longitude_ = 0D;

      temperature_ = 0D;

      humidity_ = 0D;

      windSpeed_ = 0D;

      precipitation_ = 0D;

      timestamp_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return base.weather.WeatherImpl.internal_static_Weather_WeatherForecastResponse_descriptor;
    }

    @java.lang.Override
    public base.weather.WeatherForecastResponse getDefaultInstanceForType() {
      return base.weather.WeatherForecastResponse.getDefaultInstance();
    }

    @java.lang.Override
    public base.weather.WeatherForecastResponse build() {
      base.weather.WeatherForecastResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public base.weather.WeatherForecastResponse buildPartial() {
      base.weather.WeatherForecastResponse result = new base.weather.WeatherForecastResponse(this);
      result.latitude_ = latitude_;
      result.longitude_ = longitude_;
      result.temperature_ = temperature_;
      result.humidity_ = humidity_;
      result.windSpeed_ = windSpeed_;
      result.precipitation_ = precipitation_;
      result.timestamp_ = timestamp_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof base.weather.WeatherForecastResponse) {
        return mergeFrom((base.weather.WeatherForecastResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(base.weather.WeatherForecastResponse other) {
      if (other == base.weather.WeatherForecastResponse.getDefaultInstance()) return this;
      if (other.getLatitude() != 0D) {
        setLatitude(other.getLatitude());
      }
      if (other.getLongitude() != 0D) {
        setLongitude(other.getLongitude());
      }
      if (other.getTemperature() != 0D) {
        setTemperature(other.getTemperature());
      }
      if (other.getHumidity() != 0D) {
        setHumidity(other.getHumidity());
      }
      if (other.getWindSpeed() != 0D) {
        setWindSpeed(other.getWindSpeed());
      }
      if (other.getPrecipitation() != 0D) {
        setPrecipitation(other.getPrecipitation());
      }
      if (!other.getTimestamp().isEmpty()) {
        timestamp_ = other.timestamp_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      base.weather.WeatherForecastResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (base.weather.WeatherForecastResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private double latitude_ ;
    /**
     * <code>double latitude = 1;</code>
     */
    public double getLatitude() {
      return latitude_;
    }
    /**
     * <code>double latitude = 1;</code>
     */
    public Builder setLatitude(double value) {
      
      latitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double latitude = 1;</code>
     */
    public Builder clearLatitude() {
      
      latitude_ = 0D;
      onChanged();
      return this;
    }

    private double longitude_ ;
    /**
     * <code>double longitude = 2;</code>
     */
    public double getLongitude() {
      return longitude_;
    }
    /**
     * <code>double longitude = 2;</code>
     */
    public Builder setLongitude(double value) {
      
      longitude_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double longitude = 2;</code>
     */
    public Builder clearLongitude() {
      
      longitude_ = 0D;
      onChanged();
      return this;
    }

    private double temperature_ ;
    /**
     * <code>double temperature = 3;</code>
     */
    public double getTemperature() {
      return temperature_;
    }
    /**
     * <code>double temperature = 3;</code>
     */
    public Builder setTemperature(double value) {
      
      temperature_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double temperature = 3;</code>
     */
    public Builder clearTemperature() {
      
      temperature_ = 0D;
      onChanged();
      return this;
    }

    private double humidity_ ;
    /**
     * <code>double humidity = 4;</code>
     */
    public double getHumidity() {
      return humidity_;
    }
    /**
     * <code>double humidity = 4;</code>
     */
    public Builder setHumidity(double value) {
      
      humidity_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double humidity = 4;</code>
     */
    public Builder clearHumidity() {
      
      humidity_ = 0D;
      onChanged();
      return this;
    }

    private double windSpeed_ ;
    /**
     * <code>double wind_speed = 5;</code>
     */
    public double getWindSpeed() {
      return windSpeed_;
    }
    /**
     * <code>double wind_speed = 5;</code>
     */
    public Builder setWindSpeed(double value) {
      
      windSpeed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double wind_speed = 5;</code>
     */
    public Builder clearWindSpeed() {
      
      windSpeed_ = 0D;
      onChanged();
      return this;
    }

    private double precipitation_ ;
    /**
     * <code>double precipitation = 6;</code>
     */
    public double getPrecipitation() {
      return precipitation_;
    }
    /**
     * <code>double precipitation = 6;</code>
     */
    public Builder setPrecipitation(double value) {
      
      precipitation_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double precipitation = 6;</code>
     */
    public Builder clearPrecipitation() {
      
      precipitation_ = 0D;
      onChanged();
      return this;
    }

    private java.lang.Object timestamp_ = "";
    /**
     * <code>string timestamp = 7;</code>
     */
    public java.lang.String getTimestamp() {
      java.lang.Object ref = timestamp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timestamp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string timestamp = 7;</code>
     */
    public com.google.protobuf.ByteString
        getTimestampBytes() {
      java.lang.Object ref = timestamp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        timestamp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string timestamp = 7;</code>
     */
    public Builder setTimestamp(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 7;</code>
     */
    public Builder clearTimestamp() {
      
      timestamp_ = getDefaultInstance().getTimestamp();
      onChanged();
      return this;
    }
    /**
     * <code>string timestamp = 7;</code>
     */
    public Builder setTimestampBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Weather.WeatherForecastResponse)
  }

  // @@protoc_insertion_point(class_scope:Weather.WeatherForecastResponse)
  private static final base.weather.WeatherForecastResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new base.weather.WeatherForecastResponse();
  }

  public static base.weather.WeatherForecastResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WeatherForecastResponse>
      PARSER = new com.google.protobuf.AbstractParser<WeatherForecastResponse>() {
    @java.lang.Override
    public WeatherForecastResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new WeatherForecastResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<WeatherForecastResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WeatherForecastResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public base.weather.WeatherForecastResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

