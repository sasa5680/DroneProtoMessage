// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: R2A_GoodToGo.proto

package sasa5680.DroneProtoMessages;

public final class R2AGoodToGo {
  private R2AGoodToGo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface R2A_GoodtoGoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:R2A_GoodtoGo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool Result = 1;</code>
     */
    boolean getResult();
  }
  /**
   * Protobuf type {@code R2A_GoodtoGo}
   */
  public  static final class R2A_GoodtoGo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:R2A_GoodtoGo)
      R2A_GoodtoGoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use R2A_GoodtoGo.newBuilder() to construct.
    private R2A_GoodtoGo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private R2A_GoodtoGo() {
      result_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private R2A_GoodtoGo(
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

              result_ = input.readBool();
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
      return sasa5680.DroneProtoMessages.R2AGoodToGo.internal_static_R2A_GoodtoGo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sasa5680.DroneProtoMessages.R2AGoodToGo.internal_static_R2A_GoodtoGo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo.class, sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo.Builder.class);
    }

    public static final int RESULT_FIELD_NUMBER = 1;
    private boolean result_;
    /**
     * <code>bool Result = 1;</code>
     */
    public boolean getResult() {
      return result_;
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
      if (result_ != false) {
        output.writeBool(1, result_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (result_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, result_);
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
      if (!(obj instanceof sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo)) {
        return super.equals(obj);
      }
      sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo other = (sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo) obj;

      boolean result = true;
      result = result && (getResult()
          == other.getResult());
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
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getResult());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parseFrom(
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
    public static Builder newBuilder(sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo prototype) {
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
     * Protobuf type {@code R2A_GoodtoGo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:R2A_GoodtoGo)
        sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sasa5680.DroneProtoMessages.R2AGoodToGo.internal_static_R2A_GoodtoGo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sasa5680.DroneProtoMessages.R2AGoodToGo.internal_static_R2A_GoodtoGo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo.class, sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo.Builder.class);
      }

      // Construct using sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo.newBuilder()
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
        result_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sasa5680.DroneProtoMessages.R2AGoodToGo.internal_static_R2A_GoodtoGo_descriptor;
      }

      @java.lang.Override
      public sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo getDefaultInstanceForType() {
        return sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo.getDefaultInstance();
      }

      @java.lang.Override
      public sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo build() {
        sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo buildPartial() {
        sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo result = new sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo(this);
        result.result_ = result_;
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
        if (other instanceof sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo) {
          return mergeFrom((sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo other) {
        if (other == sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo.getDefaultInstance()) return this;
        if (other.getResult() != false) {
          setResult(other.getResult());
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
        sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean result_ ;
      /**
       * <code>bool Result = 1;</code>
       */
      public boolean getResult() {
        return result_;
      }
      /**
       * <code>bool Result = 1;</code>
       */
      public Builder setResult(boolean value) {
        
        result_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Result = 1;</code>
       */
      public Builder clearResult() {
        
        result_ = false;
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


      // @@protoc_insertion_point(builder_scope:R2A_GoodtoGo)
    }

    // @@protoc_insertion_point(class_scope:R2A_GoodtoGo)
    private static final sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo();
    }

    public static sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<R2A_GoodtoGo>
        PARSER = new com.google.protobuf.AbstractParser<R2A_GoodtoGo>() {
      @java.lang.Override
      public R2A_GoodtoGo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new R2A_GoodtoGo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<R2A_GoodtoGo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<R2A_GoodtoGo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sasa5680.DroneProtoMessages.R2AGoodToGo.R2A_GoodtoGo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_R2A_GoodtoGo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_R2A_GoodtoGo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022R2A_GoodToGo.proto\"\036\n\014R2A_GoodtoGo\022\016\n\006" +
      "Result\030\001 \001(\010B\035\n\033sasa5680.DroneProtoMessa" +
      "gesb\006proto3"
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
    internal_static_R2A_GoodtoGo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_R2A_GoodtoGo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_R2A_GoodtoGo_descriptor,
        new java.lang.String[] { "Result", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
