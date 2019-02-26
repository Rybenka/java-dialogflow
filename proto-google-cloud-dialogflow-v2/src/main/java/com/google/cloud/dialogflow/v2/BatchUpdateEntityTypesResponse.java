// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2/entity_type.proto

package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The response message for
 * [EntityTypes.BatchUpdateEntityTypes][google.cloud.dialogflow.v2.EntityTypes.BatchUpdateEntityTypes].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse}
 */
public final class BatchUpdateEntityTypesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse)
    BatchUpdateEntityTypesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchUpdateEntityTypesResponse.newBuilder() to construct.
  private BatchUpdateEntityTypesResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchUpdateEntityTypesResponse() {
    entityTypes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private BatchUpdateEntityTypesResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                entityTypes_ = new java.util.ArrayList<com.google.cloud.dialogflow.v2.EntityType>();
                mutable_bitField0_ |= 0x00000001;
              }
              entityTypes_.add(
                  input.readMessage(
                      com.google.cloud.dialogflow.v2.EntityType.parser(), extensionRegistry));
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        entityTypes_ = java.util.Collections.unmodifiableList(entityTypes_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.EntityTypeProto
        .internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.class,
            com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.Builder.class);
  }

  public static final int ENTITY_TYPES_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.dialogflow.v2.EntityType> entityTypes_;
  /**
   *
   *
   * <pre>
   * The collection of updated or created entity types.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
   */
  public java.util.List<com.google.cloud.dialogflow.v2.EntityType> getEntityTypesList() {
    return entityTypes_;
  }
  /**
   *
   *
   * <pre>
   * The collection of updated or created entity types.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.dialogflow.v2.EntityTypeOrBuilder>
      getEntityTypesOrBuilderList() {
    return entityTypes_;
  }
  /**
   *
   *
   * <pre>
   * The collection of updated or created entity types.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
   */
  public int getEntityTypesCount() {
    return entityTypes_.size();
  }
  /**
   *
   *
   * <pre>
   * The collection of updated or created entity types.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
   */
  public com.google.cloud.dialogflow.v2.EntityType getEntityTypes(int index) {
    return entityTypes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The collection of updated or created entity types.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
   */
  public com.google.cloud.dialogflow.v2.EntityTypeOrBuilder getEntityTypesOrBuilder(int index) {
    return entityTypes_.get(index);
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < entityTypes_.size(); i++) {
      output.writeMessage(1, entityTypes_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < entityTypes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, entityTypes_.get(i));
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse other =
        (com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse) obj;

    boolean result = true;
    result = result && getEntityTypesList().equals(other.getEntityTypesList());
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
    if (getEntityTypesCount() > 0) {
      hash = (37 * hash) + ENTITY_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getEntityTypesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response message for
   * [EntityTypes.BatchUpdateEntityTypes][google.cloud.dialogflow.v2.EntityTypes.BatchUpdateEntityTypes].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse)
      com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.class,
              com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEntityTypesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (entityTypesBuilder_ == null) {
        entityTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        entityTypesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.EntityTypeProto
          .internal_static_google_cloud_dialogflow_v2_BatchUpdateEntityTypesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse build() {
      com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse buildPartial() {
      com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse result =
          new com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse(this);
      int from_bitField0_ = bitField0_;
      if (entityTypesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          entityTypes_ = java.util.Collections.unmodifiableList(entityTypes_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.entityTypes_ = entityTypes_;
      } else {
        result.entityTypes_ = entityTypesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse) {
        return mergeFrom((com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse other) {
      if (other
          == com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse.getDefaultInstance())
        return this;
      if (entityTypesBuilder_ == null) {
        if (!other.entityTypes_.isEmpty()) {
          if (entityTypes_.isEmpty()) {
            entityTypes_ = other.entityTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEntityTypesIsMutable();
            entityTypes_.addAll(other.entityTypes_);
          }
          onChanged();
        }
      } else {
        if (!other.entityTypes_.isEmpty()) {
          if (entityTypesBuilder_.isEmpty()) {
            entityTypesBuilder_.dispose();
            entityTypesBuilder_ = null;
            entityTypes_ = other.entityTypes_;
            bitField0_ = (bitField0_ & ~0x00000001);
            entityTypesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getEntityTypesFieldBuilder()
                    : null;
          } else {
            entityTypesBuilder_.addAllMessages(other.entityTypes_);
          }
        }
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
      com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.dialogflow.v2.EntityType> entityTypes_ =
        java.util.Collections.emptyList();

    private void ensureEntityTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        entityTypes_ =
            new java.util.ArrayList<com.google.cloud.dialogflow.v2.EntityType>(entityTypes_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.EntityType,
            com.google.cloud.dialogflow.v2.EntityType.Builder,
            com.google.cloud.dialogflow.v2.EntityTypeOrBuilder>
        entityTypesBuilder_;

    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.EntityType> getEntityTypesList() {
      if (entityTypesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(entityTypes_);
      } else {
        return entityTypesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public int getEntityTypesCount() {
      if (entityTypesBuilder_ == null) {
        return entityTypes_.size();
      } else {
        return entityTypesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EntityType getEntityTypes(int index) {
      if (entityTypesBuilder_ == null) {
        return entityTypes_.get(index);
      } else {
        return entityTypesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder setEntityTypes(int index, com.google.cloud.dialogflow.v2.EntityType value) {
      if (entityTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntityTypesIsMutable();
        entityTypes_.set(index, value);
        onChanged();
      } else {
        entityTypesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder setEntityTypes(
        int index, com.google.cloud.dialogflow.v2.EntityType.Builder builderForValue) {
      if (entityTypesBuilder_ == null) {
        ensureEntityTypesIsMutable();
        entityTypes_.set(index, builderForValue.build());
        onChanged();
      } else {
        entityTypesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder addEntityTypes(com.google.cloud.dialogflow.v2.EntityType value) {
      if (entityTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntityTypesIsMutable();
        entityTypes_.add(value);
        onChanged();
      } else {
        entityTypesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder addEntityTypes(int index, com.google.cloud.dialogflow.v2.EntityType value) {
      if (entityTypesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEntityTypesIsMutable();
        entityTypes_.add(index, value);
        onChanged();
      } else {
        entityTypesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder addEntityTypes(
        com.google.cloud.dialogflow.v2.EntityType.Builder builderForValue) {
      if (entityTypesBuilder_ == null) {
        ensureEntityTypesIsMutable();
        entityTypes_.add(builderForValue.build());
        onChanged();
      } else {
        entityTypesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder addEntityTypes(
        int index, com.google.cloud.dialogflow.v2.EntityType.Builder builderForValue) {
      if (entityTypesBuilder_ == null) {
        ensureEntityTypesIsMutable();
        entityTypes_.add(index, builderForValue.build());
        onChanged();
      } else {
        entityTypesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder addAllEntityTypes(
        java.lang.Iterable<? extends com.google.cloud.dialogflow.v2.EntityType> values) {
      if (entityTypesBuilder_ == null) {
        ensureEntityTypesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, entityTypes_);
        onChanged();
      } else {
        entityTypesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder clearEntityTypes() {
      if (entityTypesBuilder_ == null) {
        entityTypes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        entityTypesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public Builder removeEntityTypes(int index) {
      if (entityTypesBuilder_ == null) {
        ensureEntityTypesIsMutable();
        entityTypes_.remove(index);
        onChanged();
      } else {
        entityTypesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EntityType.Builder getEntityTypesBuilder(int index) {
      return getEntityTypesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EntityTypeOrBuilder getEntityTypesOrBuilder(int index) {
      if (entityTypesBuilder_ == null) {
        return entityTypes_.get(index);
      } else {
        return entityTypesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.dialogflow.v2.EntityTypeOrBuilder>
        getEntityTypesOrBuilderList() {
      if (entityTypesBuilder_ != null) {
        return entityTypesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(entityTypes_);
      }
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EntityType.Builder addEntityTypesBuilder() {
      return getEntityTypesFieldBuilder()
          .addBuilder(com.google.cloud.dialogflow.v2.EntityType.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public com.google.cloud.dialogflow.v2.EntityType.Builder addEntityTypesBuilder(int index) {
      return getEntityTypesFieldBuilder()
          .addBuilder(index, com.google.cloud.dialogflow.v2.EntityType.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The collection of updated or created entity types.
     * </pre>
     *
     * <code>repeated .google.cloud.dialogflow.v2.EntityType entity_types = 1;</code>
     */
    public java.util.List<com.google.cloud.dialogflow.v2.EntityType.Builder>
        getEntityTypesBuilderList() {
      return getEntityTypesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.dialogflow.v2.EntityType,
            com.google.cloud.dialogflow.v2.EntityType.Builder,
            com.google.cloud.dialogflow.v2.EntityTypeOrBuilder>
        getEntityTypesFieldBuilder() {
      if (entityTypesBuilder_ == null) {
        entityTypesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.dialogflow.v2.EntityType,
                com.google.cloud.dialogflow.v2.EntityType.Builder,
                com.google.cloud.dialogflow.v2.EntityTypeOrBuilder>(
                entityTypes_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        entityTypes_ = null;
      }
      return entityTypesBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse)
  private static final com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse();
  }

  public static com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchUpdateEntityTypesResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchUpdateEntityTypesResponse>() {
        @java.lang.Override
        public BatchUpdateEntityTypesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new BatchUpdateEntityTypesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<BatchUpdateEntityTypesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchUpdateEntityTypesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.BatchUpdateEntityTypesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
