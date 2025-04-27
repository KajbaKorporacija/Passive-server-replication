package gRPCgenerisano;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.54.0)",
    comments = "Source: f.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Response> getSendNewTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendNewTopic",
      requestType = gRPCgenerisano.Request.class,
      responseType = gRPCgenerisano.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Response> getSendNewTopicMethod() {
    io.grpc.MethodDescriptor<gRPCgenerisano.Request, gRPCgenerisano.Response> getSendNewTopicMethod;
    if ((getSendNewTopicMethod = AccountServiceGrpc.getSendNewTopicMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getSendNewTopicMethod = AccountServiceGrpc.getSendNewTopicMethod) == null) {
          AccountServiceGrpc.getSendNewTopicMethod = getSendNewTopicMethod =
              io.grpc.MethodDescriptor.<gRPCgenerisano.Request, gRPCgenerisano.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendNewTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("SendNewTopic"))
              .build();
        }
      }
    }
    return getSendNewTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Response> getSendNewCommentToTopicMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendNewCommentToTopic",
      requestType = gRPCgenerisano.Request.class,
      responseType = gRPCgenerisano.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Response> getSendNewCommentToTopicMethod() {
    io.grpc.MethodDescriptor<gRPCgenerisano.Request, gRPCgenerisano.Response> getSendNewCommentToTopicMethod;
    if ((getSendNewCommentToTopicMethod = AccountServiceGrpc.getSendNewCommentToTopicMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getSendNewCommentToTopicMethod = AccountServiceGrpc.getSendNewCommentToTopicMethod) == null) {
          AccountServiceGrpc.getSendNewCommentToTopicMethod = getSendNewCommentToTopicMethod =
              io.grpc.MethodDescriptor.<gRPCgenerisano.Request, gRPCgenerisano.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendNewCommentToTopic"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("SendNewCommentToTopic"))
              .build();
        }
      }
    }
    return getSendNewCommentToTopicMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Response> getReplyToCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReplyToComment",
      requestType = gRPCgenerisano.Request.class,
      responseType = gRPCgenerisano.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Response> getReplyToCommentMethod() {
    io.grpc.MethodDescriptor<gRPCgenerisano.Request, gRPCgenerisano.Response> getReplyToCommentMethod;
    if ((getReplyToCommentMethod = AccountServiceGrpc.getReplyToCommentMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getReplyToCommentMethod = AccountServiceGrpc.getReplyToCommentMethod) == null) {
          AccountServiceGrpc.getReplyToCommentMethod = getReplyToCommentMethod =
              io.grpc.MethodDescriptor.<gRPCgenerisano.Request, gRPCgenerisano.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReplyToComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("ReplyToComment"))
              .build();
        }
      }
    }
    return getReplyToCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Response> getUpdateMyCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMyComment",
      requestType = gRPCgenerisano.Request.class,
      responseType = gRPCgenerisano.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Response> getUpdateMyCommentMethod() {
    io.grpc.MethodDescriptor<gRPCgenerisano.Request, gRPCgenerisano.Response> getUpdateMyCommentMethod;
    if ((getUpdateMyCommentMethod = AccountServiceGrpc.getUpdateMyCommentMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getUpdateMyCommentMethod = AccountServiceGrpc.getUpdateMyCommentMethod) == null) {
          AccountServiceGrpc.getUpdateMyCommentMethod = getUpdateMyCommentMethod =
              io.grpc.MethodDescriptor.<gRPCgenerisano.Request, gRPCgenerisano.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMyComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("UpdateMyComment"))
              .build();
        }
      }
    }
    return getUpdateMyCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Response> getDeleteMyCommentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMyComment",
      requestType = gRPCgenerisano.Request.class,
      responseType = gRPCgenerisano.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Response> getDeleteMyCommentMethod() {
    io.grpc.MethodDescriptor<gRPCgenerisano.Request, gRPCgenerisano.Response> getDeleteMyCommentMethod;
    if ((getDeleteMyCommentMethod = AccountServiceGrpc.getDeleteMyCommentMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getDeleteMyCommentMethod = AccountServiceGrpc.getDeleteMyCommentMethod) == null) {
          AccountServiceGrpc.getDeleteMyCommentMethod = getDeleteMyCommentMethod =
              io.grpc.MethodDescriptor.<gRPCgenerisano.Request, gRPCgenerisano.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMyComment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Response.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("DeleteMyComment"))
              .build();
        }
      }
    }
    return getDeleteMyCommentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Topic> getGetTopicsListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTopicsList",
      requestType = gRPCgenerisano.Request.class,
      responseType = gRPCgenerisano.Topic.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Topic> getGetTopicsListMethod() {
    io.grpc.MethodDescriptor<gRPCgenerisano.Request, gRPCgenerisano.Topic> getGetTopicsListMethod;
    if ((getGetTopicsListMethod = AccountServiceGrpc.getGetTopicsListMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetTopicsListMethod = AccountServiceGrpc.getGetTopicsListMethod) == null) {
          AccountServiceGrpc.getGetTopicsListMethod = getGetTopicsListMethod =
              io.grpc.MethodDescriptor.<gRPCgenerisano.Request, gRPCgenerisano.Topic>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTopicsList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Topic.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetTopicsList"))
              .build();
        }
      }
    }
    return getGetTopicsListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Comment> getGetTopicCommentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTopicComments",
      requestType = gRPCgenerisano.Request.class,
      responseType = gRPCgenerisano.Comment.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<gRPCgenerisano.Request,
      gRPCgenerisano.Comment> getGetTopicCommentsMethod() {
    io.grpc.MethodDescriptor<gRPCgenerisano.Request, gRPCgenerisano.Comment> getGetTopicCommentsMethod;
    if ((getGetTopicCommentsMethod = AccountServiceGrpc.getGetTopicCommentsMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetTopicCommentsMethod = AccountServiceGrpc.getGetTopicCommentsMethod) == null) {
          AccountServiceGrpc.getGetTopicCommentsMethod = getGetTopicCommentsMethod =
              io.grpc.MethodDescriptor.<gRPCgenerisano.Request, gRPCgenerisano.Comment>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTopicComments"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.Comment.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetTopicComments"))
              .build();
        }
      }
    }
    return getGetTopicCommentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPCgenerisano.LogEntry,
      gRPCgenerisano.LogResponse> getAppendLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AppendLog",
      requestType = gRPCgenerisano.LogEntry.class,
      responseType = gRPCgenerisano.LogResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPCgenerisano.LogEntry,
      gRPCgenerisano.LogResponse> getAppendLogMethod() {
    io.grpc.MethodDescriptor<gRPCgenerisano.LogEntry, gRPCgenerisano.LogResponse> getAppendLogMethod;
    if ((getAppendLogMethod = AccountServiceGrpc.getAppendLogMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getAppendLogMethod = AccountServiceGrpc.getAppendLogMethod) == null) {
          AccountServiceGrpc.getAppendLogMethod = getAppendLogMethod =
              io.grpc.MethodDescriptor.<gRPCgenerisano.LogEntry, gRPCgenerisano.LogResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AppendLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.LogEntry.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.LogResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("AppendLog"))
              .build();
        }
      }
    }
    return getAppendLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gRPCgenerisano.LeaderRequest,
      gRPCgenerisano.LeaderInfo> getGetLeaderInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetLeaderInfo",
      requestType = gRPCgenerisano.LeaderRequest.class,
      responseType = gRPCgenerisano.LeaderInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gRPCgenerisano.LeaderRequest,
      gRPCgenerisano.LeaderInfo> getGetLeaderInfoMethod() {
    io.grpc.MethodDescriptor<gRPCgenerisano.LeaderRequest, gRPCgenerisano.LeaderInfo> getGetLeaderInfoMethod;
    if ((getGetLeaderInfoMethod = AccountServiceGrpc.getGetLeaderInfoMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getGetLeaderInfoMethod = AccountServiceGrpc.getGetLeaderInfoMethod) == null) {
          AccountServiceGrpc.getGetLeaderInfoMethod = getGetLeaderInfoMethod =
              io.grpc.MethodDescriptor.<gRPCgenerisano.LeaderRequest, gRPCgenerisano.LeaderInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetLeaderInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.LeaderRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gRPCgenerisano.LeaderInfo.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("GetLeaderInfo"))
              .build();
        }
      }
    }
    return getGetLeaderInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub>() {
        @java.lang.Override
        public AccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceStub(channel, callOptions);
        }
      };
    return AccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub>() {
        @java.lang.Override
        public AccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub>() {
        @java.lang.Override
        public AccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceFutureStub(channel, callOptions);
        }
      };
    return AccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void sendNewTopic(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendNewTopicMethod(), responseObserver);
    }

    /**
     */
    default void sendNewCommentToTopic(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendNewCommentToTopicMethod(), responseObserver);
    }

    /**
     */
    default void replyToComment(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReplyToCommentMethod(), responseObserver);
    }

    /**
     */
    default void updateMyComment(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMyCommentMethod(), responseObserver);
    }

    /**
     */
    default void deleteMyComment(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMyCommentMethod(), responseObserver);
    }

    /**
     */
    default void getTopicsList(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Topic> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTopicsListMethod(), responseObserver);
    }

    /**
     */
    default void getTopicComments(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Comment> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTopicCommentsMethod(), responseObserver);
    }

    /**
     */
    default void appendLog(gRPCgenerisano.LogEntry request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.LogResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAppendLogMethod(), responseObserver);
    }

    /**
     */
    default void getLeaderInfo(gRPCgenerisano.LeaderRequest request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.LeaderInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetLeaderInfoMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service AccountService.
   */
  public static abstract class AccountServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return AccountServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceStub
      extends io.grpc.stub.AbstractAsyncStub<AccountServiceStub> {
    private AccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void sendNewTopic(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendNewTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sendNewCommentToTopic(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendNewCommentToTopicMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void replyToComment(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReplyToCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMyComment(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMyCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMyComment(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMyCommentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTopicsList(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Topic> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetTopicsListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTopicComments(gRPCgenerisano.Request request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.Comment> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetTopicCommentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void appendLog(gRPCgenerisano.LogEntry request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.LogResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAppendLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getLeaderInfo(gRPCgenerisano.LeaderRequest request,
        io.grpc.stub.StreamObserver<gRPCgenerisano.LeaderInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetLeaderInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service AccountService.
   */
  public static final class AccountServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public gRPCgenerisano.Response sendNewTopic(gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendNewTopicMethod(), getCallOptions(), request);
    }

    /**
     */
    public gRPCgenerisano.Response sendNewCommentToTopic(gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendNewCommentToTopicMethod(), getCallOptions(), request);
    }

    /**
     */
    public gRPCgenerisano.Response replyToComment(gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReplyToCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public gRPCgenerisano.Response updateMyComment(gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMyCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public gRPCgenerisano.Response deleteMyComment(gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMyCommentMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<gRPCgenerisano.Topic> getTopicsList(
        gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetTopicsListMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<gRPCgenerisano.Comment> getTopicComments(
        gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetTopicCommentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public gRPCgenerisano.LogResponse appendLog(gRPCgenerisano.LogEntry request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAppendLogMethod(), getCallOptions(), request);
    }

    /**
     */
    public gRPCgenerisano.LeaderInfo getLeaderInfo(gRPCgenerisano.LeaderRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetLeaderInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service AccountService.
   */
  public static final class AccountServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPCgenerisano.Response> sendNewTopic(
        gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendNewTopicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPCgenerisano.Response> sendNewCommentToTopic(
        gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendNewCommentToTopicMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPCgenerisano.Response> replyToComment(
        gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReplyToCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPCgenerisano.Response> updateMyComment(
        gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMyCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPCgenerisano.Response> deleteMyComment(
        gRPCgenerisano.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMyCommentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPCgenerisano.LogResponse> appendLog(
        gRPCgenerisano.LogEntry request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAppendLogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gRPCgenerisano.LeaderInfo> getLeaderInfo(
        gRPCgenerisano.LeaderRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetLeaderInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_NEW_TOPIC = 0;
  private static final int METHODID_SEND_NEW_COMMENT_TO_TOPIC = 1;
  private static final int METHODID_REPLY_TO_COMMENT = 2;
  private static final int METHODID_UPDATE_MY_COMMENT = 3;
  private static final int METHODID_DELETE_MY_COMMENT = 4;
  private static final int METHODID_GET_TOPICS_LIST = 5;
  private static final int METHODID_GET_TOPIC_COMMENTS = 6;
  private static final int METHODID_APPEND_LOG = 7;
  private static final int METHODID_GET_LEADER_INFO = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_NEW_TOPIC:
          serviceImpl.sendNewTopic((gRPCgenerisano.Request) request,
              (io.grpc.stub.StreamObserver<gRPCgenerisano.Response>) responseObserver);
          break;
        case METHODID_SEND_NEW_COMMENT_TO_TOPIC:
          serviceImpl.sendNewCommentToTopic((gRPCgenerisano.Request) request,
              (io.grpc.stub.StreamObserver<gRPCgenerisano.Response>) responseObserver);
          break;
        case METHODID_REPLY_TO_COMMENT:
          serviceImpl.replyToComment((gRPCgenerisano.Request) request,
              (io.grpc.stub.StreamObserver<gRPCgenerisano.Response>) responseObserver);
          break;
        case METHODID_UPDATE_MY_COMMENT:
          serviceImpl.updateMyComment((gRPCgenerisano.Request) request,
              (io.grpc.stub.StreamObserver<gRPCgenerisano.Response>) responseObserver);
          break;
        case METHODID_DELETE_MY_COMMENT:
          serviceImpl.deleteMyComment((gRPCgenerisano.Request) request,
              (io.grpc.stub.StreamObserver<gRPCgenerisano.Response>) responseObserver);
          break;
        case METHODID_GET_TOPICS_LIST:
          serviceImpl.getTopicsList((gRPCgenerisano.Request) request,
              (io.grpc.stub.StreamObserver<gRPCgenerisano.Topic>) responseObserver);
          break;
        case METHODID_GET_TOPIC_COMMENTS:
          serviceImpl.getTopicComments((gRPCgenerisano.Request) request,
              (io.grpc.stub.StreamObserver<gRPCgenerisano.Comment>) responseObserver);
          break;
        case METHODID_APPEND_LOG:
          serviceImpl.appendLog((gRPCgenerisano.LogEntry) request,
              (io.grpc.stub.StreamObserver<gRPCgenerisano.LogResponse>) responseObserver);
          break;
        case METHODID_GET_LEADER_INFO:
          serviceImpl.getLeaderInfo((gRPCgenerisano.LeaderRequest) request,
              (io.grpc.stub.StreamObserver<gRPCgenerisano.LeaderInfo>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSendNewTopicMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gRPCgenerisano.Request,
              gRPCgenerisano.Response>(
                service, METHODID_SEND_NEW_TOPIC)))
        .addMethod(
          getSendNewCommentToTopicMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gRPCgenerisano.Request,
              gRPCgenerisano.Response>(
                service, METHODID_SEND_NEW_COMMENT_TO_TOPIC)))
        .addMethod(
          getReplyToCommentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gRPCgenerisano.Request,
              gRPCgenerisano.Response>(
                service, METHODID_REPLY_TO_COMMENT)))
        .addMethod(
          getUpdateMyCommentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gRPCgenerisano.Request,
              gRPCgenerisano.Response>(
                service, METHODID_UPDATE_MY_COMMENT)))
        .addMethod(
          getDeleteMyCommentMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gRPCgenerisano.Request,
              gRPCgenerisano.Response>(
                service, METHODID_DELETE_MY_COMMENT)))
        .addMethod(
          getGetTopicsListMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              gRPCgenerisano.Request,
              gRPCgenerisano.Topic>(
                service, METHODID_GET_TOPICS_LIST)))
        .addMethod(
          getGetTopicCommentsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              gRPCgenerisano.Request,
              gRPCgenerisano.Comment>(
                service, METHODID_GET_TOPIC_COMMENTS)))
        .addMethod(
          getAppendLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gRPCgenerisano.LogEntry,
              gRPCgenerisano.LogResponse>(
                service, METHODID_APPEND_LOG)))
        .addMethod(
          getGetLeaderInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              gRPCgenerisano.LeaderRequest,
              gRPCgenerisano.LeaderInfo>(
                service, METHODID_GET_LEADER_INFO)))
        .build();
  }

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gRPCgenerisano.F.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getSendNewTopicMethod())
              .addMethod(getSendNewCommentToTopicMethod())
              .addMethod(getReplyToCommentMethod())
              .addMethod(getUpdateMyCommentMethod())
              .addMethod(getDeleteMyCommentMethod())
              .addMethod(getGetTopicsListMethod())
              .addMethod(getGetTopicCommentsMethod())
              .addMethod(getAppendLogMethod())
              .addMethod(getGetLeaderInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
