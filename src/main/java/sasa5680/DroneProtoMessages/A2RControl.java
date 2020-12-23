// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: A2R_Control.proto

package sasa5680.DroneProtoMessages;

public final class A2RControl {
  private A2RControl() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface A2R_ControlOrBuilder extends
      // @@protoc_insertion_point(interface_extends:A2R_Control)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Fitch_F = 1;</code>
     */
    boolean getFitchF();

    /**
     * <code>bool Fitch_B = 2;</code>
     */
    boolean getFitchB();

    /**
     * <code>bool Roll_L = 3;</code>
     */
    boolean getRollL();

    /**
     * <code>bool Roll_R = 4;</code>
     */
    boolean getRollR();

    /**
     * <code>bool Yaw_C = 5;</code>
     */
    boolean getYawC();

    /**
     * <code>bool Yaw_CC = 6;</code>
     */
    boolean getYawCC();

    /**
     * <code>float Throttle = 7;</code>
     */
    float getThrottle();
  }
  /**
   * Protobuf type {@code A2R_Control}
   */
  public  static final class A2R_Control extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:A2R_Control)
      A2R_ControlOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use A2R_Control.newBuilder() to construct.
    private A2R_Control(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private A2R_Control() {
      fitchF_ = false;
      fitchB_ = false;
      rollL_ = false;
      rollR_ = false;
      yawC_ = false;
      yawCC_ = false;
      throttle_ = 0F;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private A2R_Control(
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
            case 8: {

              fitchF_ = input.readBool();
              break;
            }
            case 16: {

              fitchB_ = input.readBool();
              break;
            }
            case 24: {

              rollL_ = input.readBool();
              break;
            }
            case 32: {

              rollR_ = input.readBool();
              break;
            }
            case 40: {

              yawC_ = input.readBool();
              break;
            }
            case 48: {

              yawCC_ = input.readBool();
              break;
            }
            case 61: {

              throttle_ = input.readFloat();
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
      return sasa5680.DroneProtoMessages.A2RControl.internal_static_A2R_Control_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sasa5680.DroneProtoMessages.A2RControl.internal_static_A2R_Control_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sasa5680.DroneProtoMessages.A2RControl.A2R_Control.class, sasa5680.DroneProtoMessages.A2RControl.A2R_Control.Builder.class);
    }

    public static final int FITCH_F_FIELD_NUMBER = 1;
    private boolean fitchF_;
    /**
     * <code>bool Fitch_F = 1;</code>
     */
    public boolean getFitchF() {
      return fitchF_;
    }

    public static final int FITCH_B_FIELD_NUMBER = 2;
    private boolean fitchB_;
    /**
     * <code>bool Fitch_B = 2;</code>
     */
    public boolean getFitchB() {
      return fitchB_;
    }

    public static final int ROLL_L_FIELD_NUMBER = 3;
    private boolean rollL_;
    /**
     * <code>bool Roll_L = 3;</code>
     */
    public boolean getRollL() {
      return rollL_;
    }

    public static final int ROLL_R_FIELD_NUMBER = 4;
    private boolean rollR_;
    /**
     * <code>bool Roll_R = 4;</code>
     */
    public boolean getRollR() {
      return rollR_;
    }

    public static final int YAW_C_FIELD_NUMBER = 5;
    private boolean yawC_;
    /**
     * <code>bool Yaw_C = 5;</code>
     */
    public boolean getYawC() {
      return yawC_;
    }

    public static final int YAW_CC_FIELD_NUMBER = 6;
    private boolean yawCC_;
    /**
     * <code>bool Yaw_CC = 6;</code>
     */
    public boolean getYawCC() {
      return yawCC_;
    }

    public static final int THROTTLE_FIELD_NUMBER = 7;
    private float throttle_;
    /**
     * <code>float Throttle = 7;</code>
     */
    public float getThrottle() {
      return throttle_;
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
      if (fitchF_ != false) {
        output.writeBool(1, fitchF_);
      }
      if (fitchB_ != false) {
        output.writeBool(2, fitchB_);
      }
      if (rollL_ != false) {
        output.writeBool(3, rollL_);
      }
      if (rollR_ != false) {
        output.writeBool(4, rollR_);
      }
      if (yawC_ != false) {
        output.writeBool(5, yawC_);
      }
      if (yawCC_ != false) {
        output.writeBool(6, yawCC_);
      }
      if (throttle_ != 0F) {
        output.writeFloat(7, throttle_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fitchF_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, fitchF_);
      }
      if (fitchB_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, fitchB_);
      }
      if (rollL_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, rollL_);
      }
      if (rollR_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, rollR_);
      }
      if (yawC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(5, yawC_);
      }
      if (yawCC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(6, yawCC_);
      }
      if (throttle_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, throttle_);
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
      if (!(obj instanceof sasa5680.DroneProtoMessages.A2RControl.A2R_Control)) {
        return super.equals(obj);
      }
      sasa5680.DroneProtoMessages.A2RControl.A2R_Control other = (sasa5680.DroneProtoMessages.A2RControl.A2R_Control) obj;

      boolean result = true;
      result = result && (getFitchF()
          == other.getFitchF());
      result = result && (getFitchB()
          == other.getFitchB());
      result = result && (getRollL()
          == other.getRollL());
      result = result && (getRollR()
          == other.getRollR());
      result = result && (getYawC()
          == other.getYawC());
      result = result && (getYawCC()
          == other.getYawCC());
      result = result && (
          java.lang.Float.floatToIntBits(getThrottle())
          == java.lang.Float.floatToIntBits(
              other.getThrottle()));
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
      hash = (37 * hash) + FITCH_F_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFitchF());
      hash = (37 * hash) + FITCH_B_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFitchB());
      hash = (37 * hash) + ROLL_L_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRollL());
      hash = (37 * hash) + ROLL_R_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRollR());
      hash = (37 * hash) + YAW_C_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getYawC());
      hash = (37 * hash) + YAW_CC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getYawCC());
      hash = (37 * hash) + THROTTLE_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getThrottle());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control parseFrom(
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
    public static Builder newBuilder(sasa5680.DroneProtoMessages.A2RControl.A2R_Control prototype) {
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
     * Protobuf type {@code A2R_Control}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:A2R_Control)
        sasa5680.DroneProtoMessages.A2RControl.A2R_ControlOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sasa5680.DroneProtoMessages.A2RControl.internal_static_A2R_Control_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sasa5680.DroneProtoMessages.A2RControl.internal_static_A2R_Control_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sasa5680.DroneProtoMessages.A2RControl.A2R_Control.class, sasa5680.DroneProtoMessages.A2RControl.A2R_Control.Builder.class);
      }

      // Construct using sasa5680.DroneProtoMessages.A2RControl.A2R_Control.newBuilder()
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
        fitchF_ = false;

        fitchB_ = false;

        rollL_ = false;

        rollR_ = false;

        yawC_ = false;

        yawCC_ = false;

        throttle_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sasa5680.DroneProtoMessages.A2RControl.internal_static_A2R_Control_descriptor;
      }

      @java.lang.Override
      public sasa5680.DroneProtoMessages.A2RControl.A2R_Control getDefaultInstanceForType() {
        return sasa5680.DroneProtoMessages.A2RControl.A2R_Control.getDefaultInstance();
      }

      @java.lang.Override
      public sasa5680.DroneProtoMessages.A2RControl.A2R_Control build() {
        sasa5680.DroneProtoMessages.A2RControl.A2R_Control result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sasa5680.DroneProtoMessages.A2RControl.A2R_Control buildPartial() {
        sasa5680.DroneProtoMessages.A2RControl.A2R_Control result = new sasa5680.DroneProtoMessages.A2RControl.A2R_Control(this);
        result.fitchF_ = fitchF_;
        result.fitchB_ = fitchB_;
        result.rollL_ = rollL_;
        result.rollR_ = rollR_;
        result.yawC_ = yawC_;
        result.yawCC_ = yawCC_;
        result.throttle_ = throttle_;
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
        if (other instanceof sasa5680.DroneProtoMessages.A2RControl.A2R_Control) {
          return mergeFrom((sasa5680.DroneProtoMessages.A2RControl.A2R_Control)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sasa5680.DroneProtoMessages.A2RControl.A2R_Control other) {
        if (other == sasa5680.DroneProtoMessages.A2RControl.A2R_Control.getDefaultInstance()) return this;
        if (other.getFitchF() != false) {
          setFitchF(other.getFitchF());
        }
        if (other.getFitchB() != false) {
          setFitchB(other.getFitchB());
        }
        if (other.getRollL() != false) {
          setRollL(other.getRollL());
        }
        if (other.getRollR() != false) {
          setRollR(other.getRollR());
        }
        if (other.getYawC() != false) {
          setYawC(other.getYawC());
        }
        if (other.getYawCC() != false) {
          setYawCC(other.getYawCC());
        }
        if (other.getThrottle() != 0F) {
          setThrottle(other.getThrottle());
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
        sasa5680.DroneProtoMessages.A2RControl.A2R_Control parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sasa5680.DroneProtoMessages.A2RControl.A2R_Control) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean fitchF_ ;
      /**
       * <code>bool Fitch_F = 1;</code>
       */
      public boolean getFitchF() {
        return fitchF_;
      }
      /**
       * <code>bool Fitch_F = 1;</code>
       */
      public Builder setFitchF(boolean value) {
        
        fitchF_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Fitch_F = 1;</code>
       */
      public Builder clearFitchF() {
        
        fitchF_ = false;
        onChanged();
        return this;
      }

      private boolean fitchB_ ;
      /**
       * <code>bool Fitch_B = 2;</code>
       */
      public boolean getFitchB() {
        return fitchB_;
      }
      /**
       * <code>bool Fitch_B = 2;</code>
       */
      public Builder setFitchB(boolean value) {
        
        fitchB_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Fitch_B = 2;</code>
       */
      public Builder clearFitchB() {
        
        fitchB_ = false;
        onChanged();
        return this;
      }

      private boolean rollL_ ;
      /**
       * <code>bool Roll_L = 3;</code>
       */
      public boolean getRollL() {
        return rollL_;
      }
      /**
       * <code>bool Roll_L = 3;</code>
       */
      public Builder setRollL(boolean value) {
        
        rollL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Roll_L = 3;</code>
       */
      public Builder clearRollL() {
        
        rollL_ = false;
        onChanged();
        return this;
      }

      private boolean rollR_ ;
      /**
       * <code>bool Roll_R = 4;</code>
       */
      public boolean getRollR() {
        return rollR_;
      }
      /**
       * <code>bool Roll_R = 4;</code>
       */
      public Builder setRollR(boolean value) {
        
        rollR_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Roll_R = 4;</code>
       */
      public Builder clearRollR() {
        
        rollR_ = false;
        onChanged();
        return this;
      }

      private boolean yawC_ ;
      /**
       * <code>bool Yaw_C = 5;</code>
       */
      public boolean getYawC() {
        return yawC_;
      }
      /**
       * <code>bool Yaw_C = 5;</code>
       */
      public Builder setYawC(boolean value) {
        
        yawC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Yaw_C = 5;</code>
       */
      public Builder clearYawC() {
        
        yawC_ = false;
        onChanged();
        return this;
      }

      private boolean yawCC_ ;
      /**
       * <code>bool Yaw_CC = 6;</code>
       */
      public boolean getYawCC() {
        return yawCC_;
      }
      /**
       * <code>bool Yaw_CC = 6;</code>
       */
      public Builder setYawCC(boolean value) {
        
        yawCC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Yaw_CC = 6;</code>
       */
      public Builder clearYawCC() {
        
        yawCC_ = false;
        onChanged();
        return this;
      }

      private float throttle_ ;
      /**
       * <code>float Throttle = 7;</code>
       */
      public float getThrottle() {
        return throttle_;
      }
      /**
       * <code>float Throttle = 7;</code>
       */
      public Builder setThrottle(float value) {
        
        throttle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>float Throttle = 7;</code>
       */
      public Builder clearThrottle() {
        
        throttle_ = 0F;
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


      // @@protoc_insertion_point(builder_scope:A2R_Control)
    }

    // @@protoc_insertion_point(class_scope:A2R_Control)
    private static final sasa5680.DroneProtoMessages.A2RControl.A2R_Control DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sasa5680.DroneProtoMessages.A2RControl.A2R_Control();
    }

    public static sasa5680.DroneProtoMessages.A2RControl.A2R_Control getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<A2R_Control>
        PARSER = new com.google.protobuf.AbstractParser<A2R_Control>() {
      @java.lang.Override
      public A2R_Control parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new A2R_Control(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<A2R_Control> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<A2R_Control> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sasa5680.DroneProtoMessages.A2RControl.A2R_Control getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_A2R_Control_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_A2R_Control_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021A2R_Control.proto\"\200\001\n\013A2R_Control\022\017\n\007F" +
      "itch_F\030\001 \001(\010\022\017\n\007Fitch_B\030\002 \001(\010\022\016\n\006Roll_L\030" +
      "\003 \001(\010\022\016\n\006Roll_R\030\004 \001(\010\022\r\n\005Yaw_C\030\005 \001(\010\022\016\n\006" +
      "Yaw_CC\030\006 \001(\010\022\020\n\010Throttle\030\007 \001(\002B\035\n\033sasa56" +
      "80.DroneProtoMessagesb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_A2R_Control_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_A2R_Control_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_A2R_Control_descriptor,
        new java.lang.String[] { "FitchF", "FitchB", "RollL", "RollR", "YawC", "YawCC", "Throttle", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
