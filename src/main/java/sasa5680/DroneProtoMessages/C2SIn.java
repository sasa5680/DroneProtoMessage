// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: C2S_In.proto

package sasa5680.DroneProtoMessages;

public final class C2SIn {
  private C2SIn() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface C2S_InOrBuilder extends
      // @@protoc_insertion_point(interface_extends:C2S_In)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string IP = 1;</code>
     */
    java.lang.String getIP();
    /**
     * <code>string IP = 1;</code>
     */
    com.google.protobuf.ByteString
        getIPBytes();

    /**
     * <code>string Type = 2;</code>
     */
    java.lang.String getType();
    /**
     * <code>string Type = 2;</code>
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <code>bool Recon = 3;</code>
     */
    boolean getRecon();
  }
  /**
   * Protobuf type {@code C2S_In}
   */
  public  static final class C2S_In extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:C2S_In)
      C2S_InOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use C2S_In.newBuilder() to construct.
    private C2S_In(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private C2S_In() {
      iP_ = "";
      type_ = "";
      recon_ = false;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private C2S_In(
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              iP_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              type_ = s;
              break;
            }
            case 24: {

              recon_ = input.readBool();
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
      return sasa5680.DroneProtoMessages.C2SIn.internal_static_C2S_In_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return sasa5680.DroneProtoMessages.C2SIn.internal_static_C2S_In_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              sasa5680.DroneProtoMessages.C2SIn.C2S_In.class, sasa5680.DroneProtoMessages.C2SIn.C2S_In.Builder.class);
    }

    public static final int IP_FIELD_NUMBER = 1;
    private volatile java.lang.Object iP_;
    /**
     * <code>string IP = 1;</code>
     */
    public java.lang.String getIP() {
      java.lang.Object ref = iP_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        iP_ = s;
        return s;
      }
    }
    /**
     * <code>string IP = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIPBytes() {
      java.lang.Object ref = iP_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        iP_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private volatile java.lang.Object type_;
    /**
     * <code>string Type = 2;</code>
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <code>string Type = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int RECON_FIELD_NUMBER = 3;
    private boolean recon_;
    /**
     * <code>bool Recon = 3;</code>
     */
    public boolean getRecon() {
      return recon_;
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
      if (!getIPBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, iP_);
      }
      if (!getTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
      }
      if (recon_ != false) {
        output.writeBool(3, recon_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getIPBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, iP_);
      }
      if (!getTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
      }
      if (recon_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, recon_);
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
      if (!(obj instanceof sasa5680.DroneProtoMessages.C2SIn.C2S_In)) {
        return super.equals(obj);
      }
      sasa5680.DroneProtoMessages.C2SIn.C2S_In other = (sasa5680.DroneProtoMessages.C2SIn.C2S_In) obj;

      boolean result = true;
      result = result && getIP()
          .equals(other.getIP());
      result = result && getType()
          .equals(other.getType());
      result = result && (getRecon()
          == other.getRecon());
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
      hash = (37 * hash) + IP_FIELD_NUMBER;
      hash = (53 * hash) + getIP().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
      hash = (37 * hash) + RECON_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getRecon());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In parseFrom(
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
    public static Builder newBuilder(sasa5680.DroneProtoMessages.C2SIn.C2S_In prototype) {
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
     * Protobuf type {@code C2S_In}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:C2S_In)
        sasa5680.DroneProtoMessages.C2SIn.C2S_InOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return sasa5680.DroneProtoMessages.C2SIn.internal_static_C2S_In_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return sasa5680.DroneProtoMessages.C2SIn.internal_static_C2S_In_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                sasa5680.DroneProtoMessages.C2SIn.C2S_In.class, sasa5680.DroneProtoMessages.C2SIn.C2S_In.Builder.class);
      }

      // Construct using sasa5680.DroneProtoMessages.C2SIn.C2S_In.newBuilder()
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
        iP_ = "";

        type_ = "";

        recon_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return sasa5680.DroneProtoMessages.C2SIn.internal_static_C2S_In_descriptor;
      }

      @java.lang.Override
      public sasa5680.DroneProtoMessages.C2SIn.C2S_In getDefaultInstanceForType() {
        return sasa5680.DroneProtoMessages.C2SIn.C2S_In.getDefaultInstance();
      }

      @java.lang.Override
      public sasa5680.DroneProtoMessages.C2SIn.C2S_In build() {
        sasa5680.DroneProtoMessages.C2SIn.C2S_In result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public sasa5680.DroneProtoMessages.C2SIn.C2S_In buildPartial() {
        sasa5680.DroneProtoMessages.C2SIn.C2S_In result = new sasa5680.DroneProtoMessages.C2SIn.C2S_In(this);
        result.iP_ = iP_;
        result.type_ = type_;
        result.recon_ = recon_;
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
        if (other instanceof sasa5680.DroneProtoMessages.C2SIn.C2S_In) {
          return mergeFrom((sasa5680.DroneProtoMessages.C2SIn.C2S_In)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(sasa5680.DroneProtoMessages.C2SIn.C2S_In other) {
        if (other == sasa5680.DroneProtoMessages.C2SIn.C2S_In.getDefaultInstance()) return this;
        if (!other.getIP().isEmpty()) {
          iP_ = other.iP_;
          onChanged();
        }
        if (!other.getType().isEmpty()) {
          type_ = other.type_;
          onChanged();
        }
        if (other.getRecon() != false) {
          setRecon(other.getRecon());
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
        sasa5680.DroneProtoMessages.C2SIn.C2S_In parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (sasa5680.DroneProtoMessages.C2SIn.C2S_In) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object iP_ = "";
      /**
       * <code>string IP = 1;</code>
       */
      public java.lang.String getIP() {
        java.lang.Object ref = iP_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          iP_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string IP = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIPBytes() {
        java.lang.Object ref = iP_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          iP_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string IP = 1;</code>
       */
      public Builder setIP(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        iP_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string IP = 1;</code>
       */
      public Builder clearIP() {
        
        iP_ = getDefaultInstance().getIP();
        onChanged();
        return this;
      }
      /**
       * <code>string IP = 1;</code>
       */
      public Builder setIPBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        iP_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object type_ = "";
      /**
       * <code>string Type = 2;</code>
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string Type = 2;</code>
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string Type = 2;</code>
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string Type = 2;</code>
       */
      public Builder clearType() {
        
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <code>string Type = 2;</code>
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        type_ = value;
        onChanged();
        return this;
      }

      private boolean recon_ ;
      /**
       * <code>bool Recon = 3;</code>
       */
      public boolean getRecon() {
        return recon_;
      }
      /**
       * <code>bool Recon = 3;</code>
       */
      public Builder setRecon(boolean value) {
        
        recon_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool Recon = 3;</code>
       */
      public Builder clearRecon() {
        
        recon_ = false;
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


      // @@protoc_insertion_point(builder_scope:C2S_In)
    }

    // @@protoc_insertion_point(class_scope:C2S_In)
    private static final sasa5680.DroneProtoMessages.C2SIn.C2S_In DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new sasa5680.DroneProtoMessages.C2SIn.C2S_In();
    }

    public static sasa5680.DroneProtoMessages.C2SIn.C2S_In getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<C2S_In>
        PARSER = new com.google.protobuf.AbstractParser<C2S_In>() {
      @java.lang.Override
      public C2S_In parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new C2S_In(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<C2S_In> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<C2S_In> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public sasa5680.DroneProtoMessages.C2SIn.C2S_In getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_C2S_In_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_C2S_In_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014C2S_In.proto\"1\n\006C2S_In\022\n\n\002IP\030\001 \001(\t\022\014\n\004" +
      "Type\030\002 \001(\t\022\r\n\005Recon\030\003 \001(\010B\035\n\033sasa5680.Dr" +
      "oneProtoMessagesb\006proto3"
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
    internal_static_C2S_In_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_C2S_In_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_C2S_In_descriptor,
        new java.lang.String[] { "IP", "Type", "Recon", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
