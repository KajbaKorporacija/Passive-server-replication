// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: f.proto

package gRPCgenerisano;

public interface CommentOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Comment)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 comment_id = 1;</code>
   * @return The commentId.
   */
  int getCommentId();

  /**
   * <code>int32 parentCommentId = 2;</code>
   * @return The parentCommentId.
   */
  int getParentCommentId();

  /**
   * <code>string text = 3;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <code>string text = 3;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <code>int32 topic_id = 4;</code>
   * @return The topicId.
   */
  int getTopicId();

  /**
   * <code>string user = 5;</code>
   * @return The user.
   */
  java.lang.String getUser();
  /**
   * <code>string user = 5;</code>
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <code>int64 timestamp = 6;</code>
   * @return The timestamp.
   */
  long getTimestamp();
}
