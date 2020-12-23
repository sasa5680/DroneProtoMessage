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
     * <code>bool Fitch = 1;</code>
     */
    boolean getFitch();

    /**
     * <code>bool Roll = 2;</code>
     */
    boolean getRoll();

    /**
     * <code>bool Yaw = 3;</code>
     */
    boolean getYaw();

    /**
     * <code>bool Throttle = 4;</code>
     */
    boolean getThrottle();
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
      fitch_ = false;
      roll_ = false;
      yaw_ = false;
      throttle_ = false;
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

              fitch_ = input.readBool();
              break;
            }
            case 16: {

              roll_ = input.readBool();
              break;
            }
            case 24: {

              yaw_ = input.readBool();
              break;
            }
            case 32: {

              throttle_ = input.readBool();
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

    public static final int FITCH_FIELD_NUMBER = 1;
    private boolean fitch_;
    /**
     * <code>bool Fitch = 1;</code>
     */
    public boolean getFitch() {
      return fitch_;
    }

    public static final int ROLL_FIELD_NUMBER = 2;
    private boolean roll_;
    /**
     * <code>bool Roll = 2;</code>
     */
    public boolean getRoll() {
      return roll_;
    }

    public static final int YAW_FIELD_NUMBER = 3;
    private boolean yaw_;
    /**
     * <code>bool Yaw = 3;</code>
     */
    public boolean getYaw() {
      return yaw_;
    }

    public static final int THROTTLE_FIELD_NUMBER = 4;
    private boolean throttle_;
    /**
     * <code>bool Throttle = 4;</code>
     */
    public boolean getThrottle() {
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
      if (fitch_ != false) {
        output.writeBool(1, fitch_);
      }
      if (roll_ != false) {
        output.writeBool(2, roll_);
      }
      if (yaw_ != false) {
        output.writeBool(3, yaw_);
      }
      if (throttle_ != false) {
        output.writeBool(4, throttle_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (fitch_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, fitch_);
      }
      if (roll_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, roll_);
      }
      if (yaw_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, yaw_);
      }
      if (throttle_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(4, throttle_);
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
      result = result && (getFitch()
          == other.getFitch());
      result = result && (getRoll()
          == other.getRoll());
      result = result && (getYaw()
          == other.getYaw());
      result = result && (getThrottle()
          == other.getThrottle());
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
      hash = (37 * hash) + FITCH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getFitch());
      hash = (37 * hash) + ROLL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRoll());
      hash = (37 * hash) + YAW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getYaw());
      hash = (37 * hash) + THROTTLE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
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
        fitch_ = false;

        roll_ = false;

        yaw_ = false;

        throttle_ = false;

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
        result.fitch_ = fitch_;
        result.roll_ = roll_;
        result.yaw_ = yaw_;
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
        if (other.getFitch() != false) {
          setFitch(other.getFitch());
        }
        if (other.getRoll() != false) {
          setRoll(other.getRoll());
        }
        if (other.getYaw() != false) {
          setYaw(other.getYaw());
        }
        if (other.getThrottle() != false) {
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

      private boolean fitch_ ;
      /**
       * <code>bool Fitch = 1;</code>
       */
      public boolean getFitch() {
        return fitch_;
      }
      /**
       * <code>bool Fitch = 1;</code>
       */
      public Builder setFitch(boolean value) {
        
        fitch_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Fitch = 1;</code>
       */
      public Builder clearFitch() {
        
        fitch_ = false;
        onChanged();
        return this;
      }

      private boolean roll_ ;
      /**
       * <code>bool Roll = 2;</code>
       */
      public boolean getRoll() {
        return roll_;
      }
      /**
       * <code>bool Roll = 2;</code>
       */
      public Builder setRoll(boolean value) {
        
        roll_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Roll = 2;</code>
       */
      public Builder clearRoll() {
        
        roll_ = false;
        onChanged();
        return this;
      }

      private boolean yaw_ ;
      /**
       * <code>bool Yaw = 3;</code>
       */
      public boolean getYaw() {
        return yaw_;
      }
      /**
       * <code>bool Yaw = 3;</code>
       */
      public Builder setYaw(boolean value) {
        
        yaw_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Yaw = 3;</code>
       */
      public Builder clearYaw() {
        
        yaw_ = false;
        onChanged();
        return this;
      }

      private boolean throttle_ ;
      /**
       * <code>bool Throttle = 4;</code>
       */
      public boolean getThrottle() {
        return throttle_;
      }
      /**
       * <code>bool Throttle = 4;</code>
       */
      public Builder setThrottle(boolean value) {
        
        throttle_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Throttle = 4;</code>
       */
      public Builder clearThrottle() {
        
        throttle_ = false;
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
      "\n\021A2R_Control.proto\"I\n\013A2R_Control\022\r\n\005Fi" +
      "tch\030\001 \001(\010\022\014\n\004Roll\030\002 \001(\010\022\013\n\003Yaw\030\003 \001(\010\022\020\n\010" +
      "Throttle\030\004 \001(\010B\035\n\033sasa5680.DroneProtoMes" +
      "sagesb\006proto3"
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
        new java.lang.String[] { "Fitch", "Roll", "Yaw", "Throttle", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}