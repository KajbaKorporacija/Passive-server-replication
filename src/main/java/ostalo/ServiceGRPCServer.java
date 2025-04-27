package ostalo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import gRPCgenerisano.AccountServiceGrpc.AccountServiceImplBase;
import gRPCgenerisano.Comment;
import gRPCgenerisano.LeaderInfo;
import gRPCgenerisano.LeaderRequest;
import gRPCgenerisano.LogEntry;
import gRPCgenerisano.LogResponse;
import gRPCgenerisano.LogStatus;
import gRPCgenerisano.Request;
import gRPCgenerisano.RequestStatus;
import gRPCgenerisano.Response;
import gRPCgenerisano.Topic;
import io.grpc.stub.StreamObserver;

public class ServiceGRPCServer extends AccountServiceImplBase {

	final AccountService service;
	final AppServer node;
	private Map<String, Topic> topicMap = new HashMap<>();
	private Map<Integer, Comment> commentMap = new HashMap<>();
	private AtomicInteger topicId = new AtomicInteger(0);
	private AtomicInteger commentId = new AtomicInteger(0);

	protected ServiceGRPCServer(AccountService service, AppServer node) {
		this.service = service;
		this.node = node;
	}

	public Topic createTopic(Request request) {
		Topic topic = Topic.newBuilder().setText(request.getTopic().getText()).setUser(request.getTopic().getUser())
				.setTopicId(topicId.getAndIncrement()).build();

		return topic;
	}

	public Comment createComment(Request request) {
		Comment comment = Comment.newBuilder().setParentCommentId(0).setCommentId(commentId.getAndIncrement())
				.setText(request.getComment().getText()).setTopicId(request.getTopic().getTopicId())
				.setUser(request.getComment().getUser()).setTimestamp(request.getComment().getTimestamp()).build();
		return comment;
	}

	public Comment createReplyComment(Request request) {
		Comment comment = Comment.newBuilder().setParentCommentId(request.getCommentParrent().getCommentId())
				.setCommentId(commentId.getAndIncrement()).setText(request.getComment().getText())
				.setTopicId(request.getTopic().getTopicId()).setUser(request.getComment().getUser())
				.setTimestamp(request.getComment().getTimestamp()).build();
		return comment;
	}

	public Comment createZamena(Request request) {
		Comment comment = Comment.newBuilder().setParentCommentId(request.getCommentParrent().getCommentId())
				.setCommentId(commentId.getAndIncrement()).setText(request.getZamena())
				.setTopicId(request.getTopic().getTopicId()).setUser(request.getComment().getUser())
				.setTimestamp(request.getComment().getTimestamp()).build();
		return comment;
	}

	@Override
	public void sendNewTopic(Request request, StreamObserver<Response> responseObserver) {
		Response response;

		if (!node.isLeader()) {
			response = Response.newBuilder().setRequestId(request.getRequestId())
					.setStatus(RequestStatus.UPDATE_REJECTED_NOT_LEADER).build();
		} else {

			Topic topic = createTopic(request);

			topicMap.put(topic.getText(), topic);
			response = Response.newBuilder().setRequestId(request.getRequestId()).setStatus(RequestStatus.STATUS_OK)
					.setMessage("Topic created successfully").build();
			service.addTopic(topic.getText(), true);

			responseObserver.onNext(response);
			responseObserver.onCompleted();

		}
	}

	@Override
	public void sendNewCommentToTopic(Request request, StreamObserver<Response> responseObserver) {
		Response response;
		Topic topic = topicMap.get(request.getTopic().getText());
		if (!node.isLeader()) {
			response = Response.newBuilder().setRequestId(request.getRequestId())
					.setStatus(RequestStatus.UPDATE_REJECTED_NOT_LEADER).build();
		} else {
			if (topic == null) {

				response = Response.newBuilder().setStatus(RequestStatus.TEMA_NE_POSTOJI).setMessage(":(").build();

				responseObserver.onNext(response);
				responseObserver.onCompleted();
				return;
			}

			Comment comment = createComment(request);
			System.out.println(comment.getText() + "  ovo pise ");
			commentMap.put(comment.getCommentId(), comment);

			response = Response.newBuilder().setStatus(RequestStatus.STATUS_OK).setMessage("Komentar napravljen")
					.build();
			service.addComment(comment.getText(), true);
			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
	}

	@Override
	public void replyToComment(Request request, StreamObserver<Response> responseObserver) {
		Response response;
		if (!node.isLeader()) {
			response = Response.newBuilder().setRequestId(request.getRequestId())
					.setStatus(RequestStatus.UPDATE_REJECTED_NOT_LEADER).build();
		} else {
			Comment parrentCom = commentMap.get(request.getCommentParrent().getCommentId());
			if (parrentCom == null) {
				response = Response.newBuilder().setStatus(RequestStatus.KOMENTAR_NE_POSTOJI).setMessage(":(").build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
				return;

			}
			Comment childCom = createReplyComment(request);

			commentMap.put(childCom.getCommentId(), childCom);

			response = Response.newBuilder().setStatus(RequestStatus.STATUS_OK)
					.setMessage("Komentar napravljen u drugom komentaru").build();
			service.addCommentToComment(childCom.getText(), true);
			responseObserver.onNext(response);
			responseObserver.onCompleted();

		}
	}

	@Override
	public void updateMyComment(Request request, StreamObserver<Response> responseObserver) {
		Response response;
		if (!node.isLeader()) {
			response = Response.newBuilder().setRequestId(request.getRequestId())
					.setStatus(RequestStatus.UPDATE_REJECTED_NOT_LEADER).build();
		} else {

			long currentTime = System.currentTimeMillis();
			long commentTime = request.getComment().getTimestamp();
			long oneMinuteInMillis = 60 * 1000;
			if ((currentTime - commentTime) > oneMinuteInMillis) {
				response = Response.newBuilder().setStatus(RequestStatus.VREME_ZA_PROMENU_JE_PROSLO)
						.setMessage("Proslo je vise od 1 minuta").build();
				responseObserver.onNext(response);
				responseObserver.onCompleted();
				return;
			}
			Comment comment = createZamena(request);

			commentMap.put(comment.getCommentId(), comment);
			response = Response.newBuilder().setStatus(RequestStatus.STATUS_OK).setMessage("Komentar je izmenjen")
					.build();
			service.upComment(comment.getText(), true);

			responseObserver.onNext(response);
			responseObserver.onCompleted();
		}
	}

	@Override
	public void deleteMyComment(Request request, StreamObserver<Response> responseObserver) {
		Response response;
		if (!node.isLeader()) {
			response = Response.newBuilder().setRequestId(request.getRequestId())
					.setStatus(RequestStatus.UPDATE_REJECTED_NOT_LEADER).build();

		} else {
			Comment comment = commentMap.get(request.getComment().getCommentId());
			System.out.println((comment == null) + " je od deleMyCommENT");
			boolean flag = true;
			for (Map.Entry<Integer, Comment> entry : commentMap.entrySet()) {
				if (entry.getValue().getParentCommentId() == comment.getCommentId()) {
					flag = false;
					break;
				}

			}

			if (flag) {
				commentMap.remove(comment.getCommentId());
				response = Response.newBuilder().setStatus(RequestStatus.STATUS_OK).setMessage("Komentar je izbrisan")
						.build();

			} else {
				response = Response.newBuilder().setStatus(RequestStatus.KOMENTAR_NIJE_IZBRISAN).setMessage(":(")
						.build();

			}
			service.delComment(comment.getText(), true);
		}
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void getTopicsList(Request request, StreamObserver<Topic> responseObserver) {
		Response response;
		if (!node.isLeader()) {
			response = Response.newBuilder().setRequestId(request.getRequestId())
					.setStatus(RequestStatus.UPDATE_REJECTED_NOT_LEADER).build();
		} else {

			for (Map.Entry<String, Topic> entry : topicMap.entrySet())
				responseObserver.onNext(entry.getValue());

			service.getTopics("sve teme su uzete", true);
			responseObserver.onCompleted();
		}
	}

	@Override
	public void getTopicComments(Request request, StreamObserver<Comment> responseObserver) {
		Response response;
		if (!node.isLeader()) {
			response = Response.newBuilder().setRequestId(request.getRequestId())
					.setStatus(RequestStatus.UPDATE_REJECTED_NOT_LEADER).build();
		} else {
			Topic topic = request.getTopic();

			for (Map.Entry<Integer, Comment> entry : commentMap.entrySet()) {
				if (topic.getTopicId() == entry.getValue().getTopicId())
					responseObserver.onNext(entry.getValue());
			}
			service.getComments(topic.getText() + " od ove teme su svi komentari uzeti", true);

			responseObserver.onCompleted();
		}
	}

	@Override
	public void appendLog(LogEntry request, StreamObserver<LogResponse> responseObserver) {
		byte[] data = request.getLogEntryData().toByteArray();
		LogResponse response;

		try {
			response = service.appendLog(request.getEntryAtIndex(), data);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			response = LogResponse.newBuilder().setStatus(LogStatus.IO_ERROR).setEntryAtIndex(request.getEntryAtIndex())
					.build();
		}
		responseObserver.onNext(response);
		responseObserver.onCompleted();
	}

	@Override
	public void getLeaderInfo(LeaderRequest req, StreamObserver<LeaderInfo> response) {
		LeaderInfo leader = null;
		if (node.isLeader()) {
			leader = LeaderInfo.newBuilder().setImLeader(true).setHostnamePort(node.getMyGRPCAddress()).build();
		} else {
			leader = LeaderInfo.newBuilder().setImLeader(false).setHostnamePort(node.getLeaaderGRPCAddress()).build();
		}
		response.onNext(leader);
		response.onCompleted();
	}
}
