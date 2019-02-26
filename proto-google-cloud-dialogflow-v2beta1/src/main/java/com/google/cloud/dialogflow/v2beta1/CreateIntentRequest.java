// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/intent.proto

package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * The request message for
 * [Intents.CreateIntent][google.cloud.dialogflow.v2beta1.Intents.CreateIntent].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateIntentRequest}
 */
public final class CreateIntentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.CreateIntentRequest)
    CreateIntentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateIntentRequest.newBuilder() to construct.
  private CreateIntentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateIntentRequest() {
    parent_ = "";
    languageCode_ = "";
    intentView_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateIntentRequest(
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              com.google.cloud.dialogflow.v2beta1.Intent.Builder subBuilder = null;
              if (intent_ != null) {
                subBuilder = intent_.toBuilder();
              }
              intent_ =
                  input.readMessage(
                      com.google.cloud.dialogflow.v2beta1.Intent.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(intent_);
                intent_ = subBuilder.buildPartial();
              }

              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              languageCode_ = s;
              break;
            }
          case 32:
            {
              int rawValue = input.readEnum();

              intentView_ = rawValue;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.IntentProto
        .internal_static_google_cloud_dialogflow_v2beta1_CreateIntentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.IntentProto
        .internal_static_google_cloud_dialogflow_v2beta1_CreateIntentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.CreateIntentRequest.class,
            com.google.cloud.dialogflow.v2beta1.CreateIntentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The agent to create a intent for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The agent to create a intent for.
   * Format: `projects/&lt;Project ID&gt;/agent`.
   * </pre>
   *
   * <code>string parent = 1;</code>
   */
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTENT_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2beta1.Intent intent_;
  /**
   *
   *
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
   */
  public boolean hasIntent() {
    return intent_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.Intent getIntent() {
    return intent_ == null
        ? com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance()
        : intent_;
  }
  /**
   *
   *
   * <pre>
   * Required. The intent to create.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentOrBuilder() {
    return getIntent();
  }

  public static final int LANGUAGE_CODE_FIELD_NUMBER = 3;
  private volatile java.lang.Object languageCode_;
  /**
   *
   *
   * <pre>
   * Optional. The language of training phrases, parameters and rich messages
   * defined in `intent`. If not specified, the agent's default language is
   * used. [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported.
   * Note: languages must be enabled in the agent, before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  public java.lang.String getLanguageCode() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      languageCode_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The language of training phrases, parameters and rich messages
   * defined in `intent`. If not specified, the agent's default language is
   * used. [More than a dozen
   * languages](https://dialogflow.com/docs/reference/language) are supported.
   * Note: languages must be enabled in the agent, before they can be used.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  public com.google.protobuf.ByteString getLanguageCodeBytes() {
    java.lang.Object ref = languageCode_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      languageCode_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INTENT_VIEW_FIELD_NUMBER = 4;
  private int intentView_;
  /**
   *
   *
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
   */
  public int getIntentViewValue() {
    return intentView_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The resource view to apply to the returned intent.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
   */
  public com.google.cloud.dialogflow.v2beta1.IntentView getIntentView() {
    @SuppressWarnings("deprecation")
    com.google.cloud.dialogflow.v2beta1.IntentView result =
        com.google.cloud.dialogflow.v2beta1.IntentView.valueOf(intentView_);
    return result == null ? com.google.cloud.dialogflow.v2beta1.IntentView.UNRECOGNIZED : result;
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
    if (!getParentBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (intent_ != null) {
      output.writeMessage(2, getIntent());
    }
    if (!getLanguageCodeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, languageCode_);
    }
    if (intentView_
        != com.google.cloud.dialogflow.v2beta1.IntentView.INTENT_VIEW_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, intentView_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getParentBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (intent_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getIntent());
    }
    if (!getLanguageCodeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, languageCode_);
    }
    if (intentView_
        != com.google.cloud.dialogflow.v2beta1.IntentView.INTENT_VIEW_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, intentView_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.CreateIntentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.CreateIntentRequest other =
        (com.google.cloud.dialogflow.v2beta1.CreateIntentRequest) obj;

    boolean result = true;
    result = result && getParent().equals(other.getParent());
    result = result && (hasIntent() == other.hasIntent());
    if (hasIntent()) {
      result = result && getIntent().equals(other.getIntent());
    }
    result = result && getLanguageCode().equals(other.getLanguageCode());
    result = result && intentView_ == other.intentView_;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasIntent()) {
      hash = (37 * hash) + INTENT_FIELD_NUMBER;
      hash = (53 * hash) + getIntent().hashCode();
    }
    hash = (37 * hash) + LANGUAGE_CODE_FIELD_NUMBER;
    hash = (53 * hash) + getLanguageCode().hashCode();
    hash = (37 * hash) + INTENT_VIEW_FIELD_NUMBER;
    hash = (53 * hash) + intentView_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parseFrom(
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
      com.google.cloud.dialogflow.v2beta1.CreateIntentRequest prototype) {
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
   * The request message for
   * [Intents.CreateIntent][google.cloud.dialogflow.v2beta1.Intents.CreateIntent].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateIntentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.CreateIntentRequest)
      com.google.cloud.dialogflow.v2beta1.CreateIntentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto
          .internal_static_google_cloud_dialogflow_v2beta1_CreateIntentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto
          .internal_static_google_cloud_dialogflow_v2beta1_CreateIntentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.CreateIntentRequest.class,
              com.google.cloud.dialogflow.v2beta1.CreateIntentRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.CreateIntentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      if (intentBuilder_ == null) {
        intent_ = null;
      } else {
        intent_ = null;
        intentBuilder_ = null;
      }
      languageCode_ = "";

      intentView_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.IntentProto
          .internal_static_google_cloud_dialogflow_v2beta1_CreateIntentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CreateIntentRequest getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.CreateIntentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CreateIntentRequest build() {
      com.google.cloud.dialogflow.v2beta1.CreateIntentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CreateIntentRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.CreateIntentRequest result =
          new com.google.cloud.dialogflow.v2beta1.CreateIntentRequest(this);
      result.parent_ = parent_;
      if (intentBuilder_ == null) {
        result.intent_ = intent_;
      } else {
        result.intent_ = intentBuilder_.build();
      }
      result.languageCode_ = languageCode_;
      result.intentView_ = intentView_;
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.CreateIntentRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.CreateIntentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.CreateIntentRequest other) {
      if (other == com.google.cloud.dialogflow.v2beta1.CreateIntentRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (other.hasIntent()) {
        mergeIntent(other.getIntent());
      }
      if (!other.getLanguageCode().isEmpty()) {
        languageCode_ = other.languageCode_;
        onChanged();
      }
      if (other.intentView_ != 0) {
        setIntentViewValue(other.getIntentViewValue());
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
      com.google.cloud.dialogflow.v2beta1.CreateIntentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.dialogflow.v2beta1.CreateIntentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The agent to create a intent for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create a intent for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create a intent for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create a intent for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The agent to create a intent for.
     * Format: `projects/&lt;Project ID&gt;/agent`.
     * </pre>
     *
     * <code>string parent = 1;</code>
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2beta1.Intent intent_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Intent,
            com.google.cloud.dialogflow.v2beta1.Intent.Builder,
            com.google.cloud.dialogflow.v2beta1.IntentOrBuilder>
        intentBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The intent to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
     */
    public boolean hasIntent() {
      return intentBuilder_ != null || intent_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent getIntent() {
      if (intentBuilder_ == null) {
        return intent_ == null
            ? com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance()
            : intent_;
      } else {
        return intentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
     */
    public Builder setIntent(com.google.cloud.dialogflow.v2beta1.Intent value) {
      if (intentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        intent_ = value;
        onChanged();
      } else {
        intentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
     */
    public Builder setIntent(com.google.cloud.dialogflow.v2beta1.Intent.Builder builderForValue) {
      if (intentBuilder_ == null) {
        intent_ = builderForValue.build();
        onChanged();
      } else {
        intentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
     */
    public Builder mergeIntent(com.google.cloud.dialogflow.v2beta1.Intent value) {
      if (intentBuilder_ == null) {
        if (intent_ != null) {
          intent_ =
              com.google.cloud.dialogflow.v2beta1.Intent.newBuilder(intent_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          intent_ = value;
        }
        onChanged();
      } else {
        intentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
     */
    public Builder clearIntent() {
      if (intentBuilder_ == null) {
        intent_ = null;
        onChanged();
      } else {
        intent_ = null;
        intentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.Intent.Builder getIntentBuilder() {

      onChanged();
      return getIntentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.IntentOrBuilder getIntentOrBuilder() {
      if (intentBuilder_ != null) {
        return intentBuilder_.getMessageOrBuilder();
      } else {
        return intent_ == null
            ? com.google.cloud.dialogflow.v2beta1.Intent.getDefaultInstance()
            : intent_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The intent to create.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.Intent intent = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.Intent,
            com.google.cloud.dialogflow.v2beta1.Intent.Builder,
            com.google.cloud.dialogflow.v2beta1.IntentOrBuilder>
        getIntentFieldBuilder() {
      if (intentBuilder_ == null) {
        intentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2beta1.Intent,
                com.google.cloud.dialogflow.v2beta1.Intent.Builder,
                com.google.cloud.dialogflow.v2beta1.IntentOrBuilder>(
                getIntent(), getParentForChildren(), isClean());
        intent_ = null;
      }
      return intentBuilder_;
    }

    private java.lang.Object languageCode_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The language of training phrases, parameters and rich messages
     * defined in `intent`. If not specified, the agent's default language is
     * used. [More than a dozen
     * languages](https://dialogflow.com/docs/reference/language) are supported.
     * Note: languages must be enabled in the agent, before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public java.lang.String getLanguageCode() {
      java.lang.Object ref = languageCode_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        languageCode_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The language of training phrases, parameters and rich messages
     * defined in `intent`. If not specified, the agent's default language is
     * used. [More than a dozen
     * languages](https://dialogflow.com/docs/reference/language) are supported.
     * Note: languages must be enabled in the agent, before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public com.google.protobuf.ByteString getLanguageCodeBytes() {
      java.lang.Object ref = languageCode_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        languageCode_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The language of training phrases, parameters and rich messages
     * defined in `intent`. If not specified, the agent's default language is
     * used. [More than a dozen
     * languages](https://dialogflow.com/docs/reference/language) are supported.
     * Note: languages must be enabled in the agent, before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder setLanguageCode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      languageCode_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The language of training phrases, parameters and rich messages
     * defined in `intent`. If not specified, the agent's default language is
     * used. [More than a dozen
     * languages](https://dialogflow.com/docs/reference/language) are supported.
     * Note: languages must be enabled in the agent, before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder clearLanguageCode() {

      languageCode_ = getDefaultInstance().getLanguageCode();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The language of training phrases, parameters and rich messages
     * defined in `intent`. If not specified, the agent's default language is
     * used. [More than a dozen
     * languages](https://dialogflow.com/docs/reference/language) are supported.
     * Note: languages must be enabled in the agent, before they can be used.
     * </pre>
     *
     * <code>string language_code = 3;</code>
     */
    public Builder setLanguageCodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      languageCode_ = value;
      onChanged();
      return this;
    }

    private int intentView_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. The resource view to apply to the returned intent.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
     */
    public int getIntentViewValue() {
      return intentView_;
    }
    /**
     *
     *
     * <pre>
     * Optional. The resource view to apply to the returned intent.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
     */
    public Builder setIntentViewValue(int value) {
      intentView_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The resource view to apply to the returned intent.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
     */
    public com.google.cloud.dialogflow.v2beta1.IntentView getIntentView() {
      @SuppressWarnings("deprecation")
      com.google.cloud.dialogflow.v2beta1.IntentView result =
          com.google.cloud.dialogflow.v2beta1.IntentView.valueOf(intentView_);
      return result == null ? com.google.cloud.dialogflow.v2beta1.IntentView.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. The resource view to apply to the returned intent.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
     */
    public Builder setIntentView(com.google.cloud.dialogflow.v2beta1.IntentView value) {
      if (value == null) {
        throw new NullPointerException();
      }

      intentView_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The resource view to apply to the returned intent.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.v2beta1.IntentView intent_view = 4;</code>
     */
    public Builder clearIntentView() {

      intentView_ = 0;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.CreateIntentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.CreateIntentRequest)
  private static final com.google.cloud.dialogflow.v2beta1.CreateIntentRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.CreateIntentRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateIntentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateIntentRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateIntentRequest>() {
        @java.lang.Override
        public CreateIntentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateIntentRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateIntentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateIntentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.CreateIntentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
