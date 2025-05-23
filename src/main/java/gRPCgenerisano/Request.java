// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: f.proto

package gRPCgenerisano;

/**
 * Protobuf type {@code Request}
 */
public final class Request extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Request)
    RequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Request.newBuilder() to construct.
  private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Request() {
    opType_ = 0;
    zamena_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Request();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return gRPCgenerisano.F.internal_static_Request_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gRPCgenerisano.F.internal_static_Request_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gRPCgenerisano.Request.class, gRPCgenerisano.Request.Builder.class);
  }

  private int bitField0_;
  public static final int REQUEST_ID_FIELD_NUMBER = 1;
  private int requestId_ = 0;
  /**
   * <code>int32 request_id = 1;</code>
   * @return The requestId.
   */
  @java.lang.Override
  public int getRequestId() {
    return requestId_;
  }

  public static final int TOPIC_FIELD_NUMBER = 2;
  private gRPCgenerisano.Topic topic_;
  /**
   * <code>optional .Topic topic = 2;</code>
   * @return Whether the topic field is set.
   */
  @java.lang.Override
  public boolean hasTopic() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .Topic topic = 2;</code>
   * @return The topic.
   */
  @java.lang.Override
  public gRPCgenerisano.Topic getTopic() {
    return topic_ == null ? gRPCgenerisano.Topic.getDefaultInstance() : topic_;
  }
  /**
   * <code>optional .Topic topic = 2;</code>
   */
  @java.lang.Override
  public gRPCgenerisano.TopicOrBuilder getTopicOrBuilder() {
    return topic_ == null ? gRPCgenerisano.Topic.getDefaultInstance() : topic_;
  }

  public static final int COMMENT_FIELD_NUMBER = 3;
  private gRPCgenerisano.Comment comment_;
  /**
   * <code>optional .Comment comment = 3;</code>
   * @return Whether the comment field is set.
   */
  @java.lang.Override
  public boolean hasComment() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional .Comment comment = 3;</code>
   * @return The comment.
   */
  @java.lang.Override
  public gRPCgenerisano.Comment getComment() {
    return comment_ == null ? gRPCgenerisano.Comment.getDefaultInstance() : comment_;
  }
  /**
   * <code>optional .Comment comment = 3;</code>
   */
  @java.lang.Override
  public gRPCgenerisano.CommentOrBuilder getCommentOrBuilder() {
    return comment_ == null ? gRPCgenerisano.Comment.getDefaultInstance() : comment_;
  }

  public static final int COMMENTPARRENT_FIELD_NUMBER = 4;
  private gRPCgenerisano.Comment commentParrent_;
  /**
   * <code>optional .Comment commentParrent = 4;</code>
   * @return Whether the commentParrent field is set.
   */
  @java.lang.Override
  public boolean hasCommentParrent() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional .Comment commentParrent = 4;</code>
   * @return The commentParrent.
   */
  @java.lang.Override
  public gRPCgenerisano.Comment getCommentParrent() {
    return commentParrent_ == null ? gRPCgenerisano.Comment.getDefaultInstance() : commentParrent_;
  }
  /**
   * <code>optional .Comment commentParrent = 4;</code>
   */
  @java.lang.Override
  public gRPCgenerisano.CommentOrBuilder getCommentParrentOrBuilder() {
    return commentParrent_ == null ? gRPCgenerisano.Comment.getDefaultInstance() : commentParrent_;
  }

  public static final int OP_TYPE_FIELD_NUMBER = 5;
  private int opType_ = 0;
  /**
   * <code>.RequestType op_type = 5;</code>
   * @return The enum numeric value on the wire for opType.
   */
  @java.lang.Override public int getOpTypeValue() {
    return opType_;
  }
  /**
   * <code>.RequestType op_type = 5;</code>
   * @return The opType.
   */
  @java.lang.Override public gRPCgenerisano.RequestType getOpType() {
    gRPCgenerisano.RequestType result = gRPCgenerisano.RequestType.forNumber(opType_);
    return result == null ? gRPCgenerisano.RequestType.UNRECOGNIZED : result;
  }

  public static final int ZAMENA_FIELD_NUMBER = 6;
  @SuppressWarnings("serial")
  private volatile java.lang.Object zamena_ = "";
  /**
   * <code>optional string zamena = 6;</code>
   * @return Whether the zamena field is set.
   */
  @java.lang.Override
  public boolean hasZamena() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   * <code>optional string zamena = 6;</code>
   * @return The zamena.
   */
  @java.lang.Override
  public java.lang.String getZamena() {
    java.lang.Object ref = zamena_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zamena_ = s;
      return s;
    }
  }
  /**
   * <code>optional string zamena = 6;</code>
   * @return The bytes for zamena.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getZamenaBytes() {
    java.lang.Object ref = zamena_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      zamena_ = b;
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
    if (requestId_ != 0) {
      output.writeInt32(1, requestId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getTopic());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(3, getComment());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeMessage(4, getCommentParrent());
    }
    if (opType_ != gRPCgenerisano.RequestType.ADD_TOPIC.getNumber()) {
      output.writeEnum(5, opType_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, zamena_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (requestId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, requestId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getTopic());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getComment());
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCommentParrent());
    }
    if (opType_ != gRPCgenerisano.RequestType.ADD_TOPIC.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(5, opType_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, zamena_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof gRPCgenerisano.Request)) {
      return super.equals(obj);
    }
    gRPCgenerisano.Request other = (gRPCgenerisano.Request) obj;

    if (getRequestId()
        != other.getRequestId()) return false;
    if (hasTopic() != other.hasTopic()) return false;
    if (hasTopic()) {
      if (!getTopic()
          .equals(other.getTopic())) return false;
    }
    if (hasComment() != other.hasComment()) return false;
    if (hasComment()) {
      if (!getComment()
          .equals(other.getComment())) return false;
    }
    if (hasCommentParrent() != other.hasCommentParrent()) return false;
    if (hasCommentParrent()) {
      if (!getCommentParrent()
          .equals(other.getCommentParrent())) return false;
    }
    if (opType_ != other.opType_) return false;
    if (hasZamena() != other.hasZamena()) return false;
    if (hasZamena()) {
      if (!getZamena()
          .equals(other.getZamena())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + REQUEST_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestId();
    if (hasTopic()) {
      hash = (37 * hash) + TOPIC_FIELD_NUMBER;
      hash = (53 * hash) + getTopic().hashCode();
    }
    if (hasComment()) {
      hash = (37 * hash) + COMMENT_FIELD_NUMBER;
      hash = (53 * hash) + getComment().hashCode();
    }
    if (hasCommentParrent()) {
      hash = (37 * hash) + COMMENTPARRENT_FIELD_NUMBER;
      hash = (53 * hash) + getCommentParrent().hashCode();
    }
    hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + opType_;
    if (hasZamena()) {
      hash = (37 * hash) + ZAMENA_FIELD_NUMBER;
      hash = (53 * hash) + getZamena().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gRPCgenerisano.Request parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gRPCgenerisano.Request parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gRPCgenerisano.Request parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gRPCgenerisano.Request parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gRPCgenerisano.Request parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gRPCgenerisano.Request parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gRPCgenerisano.Request parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gRPCgenerisano.Request parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static gRPCgenerisano.Request parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static gRPCgenerisano.Request parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gRPCgenerisano.Request parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gRPCgenerisano.Request parseFrom(
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
  public static Builder newBuilder(gRPCgenerisano.Request prototype) {
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
   * Protobuf type {@code Request}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Request)
      gRPCgenerisano.RequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gRPCgenerisano.F.internal_static_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gRPCgenerisano.F.internal_static_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gRPCgenerisano.Request.class, gRPCgenerisano.Request.Builder.class);
    }

    // Construct using gRPCgenerisano.Request.newBuilder()
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
        getTopicFieldBuilder();
        getCommentFieldBuilder();
        getCommentParrentFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      requestId_ = 0;
      topic_ = null;
      if (topicBuilder_ != null) {
        topicBuilder_.dispose();
        topicBuilder_ = null;
      }
      comment_ = null;
      if (commentBuilder_ != null) {
        commentBuilder_.dispose();
        commentBuilder_ = null;
      }
      commentParrent_ = null;
      if (commentParrentBuilder_ != null) {
        commentParrentBuilder_.dispose();
        commentParrentBuilder_ = null;
      }
      opType_ = 0;
      zamena_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gRPCgenerisano.F.internal_static_Request_descriptor;
    }

    @java.lang.Override
    public gRPCgenerisano.Request getDefaultInstanceForType() {
      return gRPCgenerisano.Request.getDefaultInstance();
    }

    @java.lang.Override
    public gRPCgenerisano.Request build() {
      gRPCgenerisano.Request result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public gRPCgenerisano.Request buildPartial() {
      gRPCgenerisano.Request result = new gRPCgenerisano.Request(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(gRPCgenerisano.Request result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.requestId_ = requestId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.topic_ = topicBuilder_ == null
            ? topic_
            : topicBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.comment_ = commentBuilder_ == null
            ? comment_
            : commentBuilder_.build();
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.commentParrent_ = commentParrentBuilder_ == null
            ? commentParrent_
            : commentParrentBuilder_.build();
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.opType_ = opType_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.zamena_ = zamena_;
        to_bitField0_ |= 0x00000008;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof gRPCgenerisano.Request) {
        return mergeFrom((gRPCgenerisano.Request)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gRPCgenerisano.Request other) {
      if (other == gRPCgenerisano.Request.getDefaultInstance()) return this;
      if (other.getRequestId() != 0) {
        setRequestId(other.getRequestId());
      }
      if (other.hasTopic()) {
        mergeTopic(other.getTopic());
      }
      if (other.hasComment()) {
        mergeComment(other.getComment());
      }
      if (other.hasCommentParrent()) {
        mergeCommentParrent(other.getCommentParrent());
      }
      if (other.opType_ != 0) {
        setOpTypeValue(other.getOpTypeValue());
      }
      if (other.hasZamena()) {
        zamena_ = other.zamena_;
        bitField0_ |= 0x00000020;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              requestId_ = input.readInt32();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              input.readMessage(
                  getTopicFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getCommentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getCommentParrentFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            case 40: {
              opType_ = input.readEnum();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            case 50: {
              zamena_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000020;
              break;
            } // case 50
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private int requestId_ ;
    /**
     * <code>int32 request_id = 1;</code>
     * @return The requestId.
     */
    @java.lang.Override
    public int getRequestId() {
      return requestId_;
    }
    /**
     * <code>int32 request_id = 1;</code>
     * @param value The requestId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestId(int value) {

      requestId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int32 request_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      requestId_ = 0;
      onChanged();
      return this;
    }

    private gRPCgenerisano.Topic topic_;
    private com.google.protobuf.SingleFieldBuilderV3<
        gRPCgenerisano.Topic, gRPCgenerisano.Topic.Builder, gRPCgenerisano.TopicOrBuilder> topicBuilder_;
    /**
     * <code>optional .Topic topic = 2;</code>
     * @return Whether the topic field is set.
     */
    public boolean hasTopic() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional .Topic topic = 2;</code>
     * @return The topic.
     */
    public gRPCgenerisano.Topic getTopic() {
      if (topicBuilder_ == null) {
        return topic_ == null ? gRPCgenerisano.Topic.getDefaultInstance() : topic_;
      } else {
        return topicBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Topic topic = 2;</code>
     */
    public Builder setTopic(gRPCgenerisano.Topic value) {
      if (topicBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        topic_ = value;
      } else {
        topicBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Topic topic = 2;</code>
     */
    public Builder setTopic(
        gRPCgenerisano.Topic.Builder builderForValue) {
      if (topicBuilder_ == null) {
        topic_ = builderForValue.build();
      } else {
        topicBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Topic topic = 2;</code>
     */
    public Builder mergeTopic(gRPCgenerisano.Topic value) {
      if (topicBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          topic_ != null &&
          topic_ != gRPCgenerisano.Topic.getDefaultInstance()) {
          getTopicBuilder().mergeFrom(value);
        } else {
          topic_ = value;
        }
      } else {
        topicBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Topic topic = 2;</code>
     */
    public Builder clearTopic() {
      bitField0_ = (bitField0_ & ~0x00000002);
      topic_ = null;
      if (topicBuilder_ != null) {
        topicBuilder_.dispose();
        topicBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .Topic topic = 2;</code>
     */
    public gRPCgenerisano.Topic.Builder getTopicBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTopicFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Topic topic = 2;</code>
     */
    public gRPCgenerisano.TopicOrBuilder getTopicOrBuilder() {
      if (topicBuilder_ != null) {
        return topicBuilder_.getMessageOrBuilder();
      } else {
        return topic_ == null ?
            gRPCgenerisano.Topic.getDefaultInstance() : topic_;
      }
    }
    /**
     * <code>optional .Topic topic = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        gRPCgenerisano.Topic, gRPCgenerisano.Topic.Builder, gRPCgenerisano.TopicOrBuilder> 
        getTopicFieldBuilder() {
      if (topicBuilder_ == null) {
        topicBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            gRPCgenerisano.Topic, gRPCgenerisano.Topic.Builder, gRPCgenerisano.TopicOrBuilder>(
                getTopic(),
                getParentForChildren(),
                isClean());
        topic_ = null;
      }
      return topicBuilder_;
    }

    private gRPCgenerisano.Comment comment_;
    private com.google.protobuf.SingleFieldBuilderV3<
        gRPCgenerisano.Comment, gRPCgenerisano.Comment.Builder, gRPCgenerisano.CommentOrBuilder> commentBuilder_;
    /**
     * <code>optional .Comment comment = 3;</code>
     * @return Whether the comment field is set.
     */
    public boolean hasComment() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional .Comment comment = 3;</code>
     * @return The comment.
     */
    public gRPCgenerisano.Comment getComment() {
      if (commentBuilder_ == null) {
        return comment_ == null ? gRPCgenerisano.Comment.getDefaultInstance() : comment_;
      } else {
        return commentBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Comment comment = 3;</code>
     */
    public Builder setComment(gRPCgenerisano.Comment value) {
      if (commentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        comment_ = value;
      } else {
        commentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Comment comment = 3;</code>
     */
    public Builder setComment(
        gRPCgenerisano.Comment.Builder builderForValue) {
      if (commentBuilder_ == null) {
        comment_ = builderForValue.build();
      } else {
        commentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Comment comment = 3;</code>
     */
    public Builder mergeComment(gRPCgenerisano.Comment value) {
      if (commentBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          comment_ != null &&
          comment_ != gRPCgenerisano.Comment.getDefaultInstance()) {
          getCommentBuilder().mergeFrom(value);
        } else {
          comment_ = value;
        }
      } else {
        commentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Comment comment = 3;</code>
     */
    public Builder clearComment() {
      bitField0_ = (bitField0_ & ~0x00000004);
      comment_ = null;
      if (commentBuilder_ != null) {
        commentBuilder_.dispose();
        commentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .Comment comment = 3;</code>
     */
    public gRPCgenerisano.Comment.Builder getCommentBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getCommentFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Comment comment = 3;</code>
     */
    public gRPCgenerisano.CommentOrBuilder getCommentOrBuilder() {
      if (commentBuilder_ != null) {
        return commentBuilder_.getMessageOrBuilder();
      } else {
        return comment_ == null ?
            gRPCgenerisano.Comment.getDefaultInstance() : comment_;
      }
    }
    /**
     * <code>optional .Comment comment = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        gRPCgenerisano.Comment, gRPCgenerisano.Comment.Builder, gRPCgenerisano.CommentOrBuilder> 
        getCommentFieldBuilder() {
      if (commentBuilder_ == null) {
        commentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            gRPCgenerisano.Comment, gRPCgenerisano.Comment.Builder, gRPCgenerisano.CommentOrBuilder>(
                getComment(),
                getParentForChildren(),
                isClean());
        comment_ = null;
      }
      return commentBuilder_;
    }

    private gRPCgenerisano.Comment commentParrent_;
    private com.google.protobuf.SingleFieldBuilderV3<
        gRPCgenerisano.Comment, gRPCgenerisano.Comment.Builder, gRPCgenerisano.CommentOrBuilder> commentParrentBuilder_;
    /**
     * <code>optional .Comment commentParrent = 4;</code>
     * @return Whether the commentParrent field is set.
     */
    public boolean hasCommentParrent() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .Comment commentParrent = 4;</code>
     * @return The commentParrent.
     */
    public gRPCgenerisano.Comment getCommentParrent() {
      if (commentParrentBuilder_ == null) {
        return commentParrent_ == null ? gRPCgenerisano.Comment.getDefaultInstance() : commentParrent_;
      } else {
        return commentParrentBuilder_.getMessage();
      }
    }
    /**
     * <code>optional .Comment commentParrent = 4;</code>
     */
    public Builder setCommentParrent(gRPCgenerisano.Comment value) {
      if (commentParrentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        commentParrent_ = value;
      } else {
        commentParrentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Comment commentParrent = 4;</code>
     */
    public Builder setCommentParrent(
        gRPCgenerisano.Comment.Builder builderForValue) {
      if (commentParrentBuilder_ == null) {
        commentParrent_ = builderForValue.build();
      } else {
        commentParrentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Comment commentParrent = 4;</code>
     */
    public Builder mergeCommentParrent(gRPCgenerisano.Comment value) {
      if (commentParrentBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          commentParrent_ != null &&
          commentParrent_ != gRPCgenerisano.Comment.getDefaultInstance()) {
          getCommentParrentBuilder().mergeFrom(value);
        } else {
          commentParrent_ = value;
        }
      } else {
        commentParrentBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>optional .Comment commentParrent = 4;</code>
     */
    public Builder clearCommentParrent() {
      bitField0_ = (bitField0_ & ~0x00000008);
      commentParrent_ = null;
      if (commentParrentBuilder_ != null) {
        commentParrentBuilder_.dispose();
        commentParrentBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>optional .Comment commentParrent = 4;</code>
     */
    public gRPCgenerisano.Comment.Builder getCommentParrentBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getCommentParrentFieldBuilder().getBuilder();
    }
    /**
     * <code>optional .Comment commentParrent = 4;</code>
     */
    public gRPCgenerisano.CommentOrBuilder getCommentParrentOrBuilder() {
      if (commentParrentBuilder_ != null) {
        return commentParrentBuilder_.getMessageOrBuilder();
      } else {
        return commentParrent_ == null ?
            gRPCgenerisano.Comment.getDefaultInstance() : commentParrent_;
      }
    }
    /**
     * <code>optional .Comment commentParrent = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        gRPCgenerisano.Comment, gRPCgenerisano.Comment.Builder, gRPCgenerisano.CommentOrBuilder> 
        getCommentParrentFieldBuilder() {
      if (commentParrentBuilder_ == null) {
        commentParrentBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            gRPCgenerisano.Comment, gRPCgenerisano.Comment.Builder, gRPCgenerisano.CommentOrBuilder>(
                getCommentParrent(),
                getParentForChildren(),
                isClean());
        commentParrent_ = null;
      }
      return commentParrentBuilder_;
    }

    private int opType_ = 0;
    /**
     * <code>.RequestType op_type = 5;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.RequestType op_type = 5;</code>
     * @param value The enum numeric value on the wire for opType to set.
     * @return This builder for chaining.
     */
    public Builder setOpTypeValue(int value) {
      opType_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>.RequestType op_type = 5;</code>
     * @return The opType.
     */
    @java.lang.Override
    public gRPCgenerisano.RequestType getOpType() {
      gRPCgenerisano.RequestType result = gRPCgenerisano.RequestType.forNumber(opType_);
      return result == null ? gRPCgenerisano.RequestType.UNRECOGNIZED : result;
    }
    /**
     * <code>.RequestType op_type = 5;</code>
     * @param value The opType to set.
     * @return This builder for chaining.
     */
    public Builder setOpType(gRPCgenerisano.RequestType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      opType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.RequestType op_type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpType() {
      bitField0_ = (bitField0_ & ~0x00000010);
      opType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object zamena_ = "";
    /**
     * <code>optional string zamena = 6;</code>
     * @return Whether the zamena field is set.
     */
    public boolean hasZamena() {
      return ((bitField0_ & 0x00000020) != 0);
    }
    /**
     * <code>optional string zamena = 6;</code>
     * @return The zamena.
     */
    public java.lang.String getZamena() {
      java.lang.Object ref = zamena_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zamena_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string zamena = 6;</code>
     * @return The bytes for zamena.
     */
    public com.google.protobuf.ByteString
        getZamenaBytes() {
      java.lang.Object ref = zamena_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zamena_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string zamena = 6;</code>
     * @param value The zamena to set.
     * @return This builder for chaining.
     */
    public Builder setZamena(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      zamena_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <code>optional string zamena = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearZamena() {
      zamena_ = getDefaultInstance().getZamena();
      bitField0_ = (bitField0_ & ~0x00000020);
      onChanged();
      return this;
    }
    /**
     * <code>optional string zamena = 6;</code>
     * @param value The bytes for zamena to set.
     * @return This builder for chaining.
     */
    public Builder setZamenaBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      zamena_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:Request)
  }

  // @@protoc_insertion_point(class_scope:Request)
  private static final gRPCgenerisano.Request DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gRPCgenerisano.Request();
  }

  public static gRPCgenerisano.Request getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Request>
      PARSER = new com.google.protobuf.AbstractParser<Request>() {
    @java.lang.Override
    public Request parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<Request> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Request> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public gRPCgenerisano.Request getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

