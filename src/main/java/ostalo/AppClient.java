package ostalo;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;

import gRPCgenerisano.AccountServiceGrpc;
import gRPCgenerisano.AccountServiceGrpc.AccountServiceBlockingStub;
import gRPCgenerisano.Comment;
import gRPCgenerisano.Request;
import gRPCgenerisano.RequestStatus;
import gRPCgenerisano.RequestType;
import gRPCgenerisano.Response;
import gRPCgenerisano.Topic;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import zoo.SyncPrimitive;

public class AppClient extends SyncPrimitive {

	final String appRoot;
	String leaderNodeName = null;
	String leaderHostNamePort;
	String user;
	Scanner sc = new Scanner(System.in);
	ManagedChannel channel = null;
	AccountServiceGrpc.AccountServiceBlockingStub blockingStub = null;

	protected AppClient(String zkAddress, String appRoot) throws KeeperException, InterruptedException {
		super(zkAddress);
		this.appRoot = appRoot;
	}

	@Override
	public void process(WatchedEvent event) {
		try {
			checkLeader();
		} catch (KeeperException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public synchronized void checkLeader() throws KeeperException, InterruptedException {
		// Thread.sleep(100);
		List<String> list = zk.getChildren(appRoot, false);
		System.out.println("There are total:" + list.size() + " replicas for elections!");
		for (int i = 0; i < list.size(); i++)
			System.out.print("NODE:" + list.get(i) + ", ");
		System.out.println();

		if (list.size() == 0) {
			System.out.println("0 Elemenata ? ");
		} else {
			Integer minValue = Integer.parseInt(list.get(0).substring(AppServer.REPLICA_NODE_SEQUENCE_INDEX));
			String minNodeName = list.get(0);

			for (int i = 1; i < list.size(); i++) {
				Integer tempValue = Integer.parseInt(list.get(i).substring(AppServer.REPLICA_NODE_SEQUENCE_INDEX));
				if (minValue > tempValue) {
					minValue = tempValue;
					minNodeName = list.get(i);
				}
			}
			if (leaderNodeName == null || !minNodeName.equals(leaderNodeName)) {
				leaderNodeName = minNodeName;
				byte[] b = zk.getData(appRoot + "/" + leaderNodeName, true, null);
				leaderHostNamePort = new String(b);

				System.out.println("Leader je " + leaderNodeName);

				// if (channel != null)
				// channel.shutdown();

				blockingStub = getBlockingStub(leaderHostNamePort);
			}
		}
	}

	public AccountServiceBlockingStub getBlockingStub(String hostNamePort) {
		String[] splits = hostNamePort.split(":");
		channel = ManagedChannelBuilder.forAddress(splits[0], Integer.parseInt(splits[1])).usePlaintext().build();
		user = new String("User" + splits[1]);
		return AccountServiceGrpc.newBlockingStub(channel);
	}

	private void inviteServer() throws KeeperException, InterruptedException {
		for (int i = 0; i < 1; i++) {
			try {

				inviteServerFunctions(blockingStub);

				Thread.sleep(2000);

				System.out.println("Leader je " + leaderNodeName);

			} catch (RuntimeException e) {
				System.out.println("Server has crashed!");
				e.printStackTrace();
				// channel.shutdown();

				checkLeader();

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		channel.shutdown();
	}

	public static void ispisResponse(Response response, Request request) {
		if (response.getStatus() == RequestStatus.STATUS_OK) {
			System.out.println("STATUS OK! REQUEST = " + request.getOpType());
		} else if (response.getStatus() == RequestStatus.UPDATE_REJECTED_NOT_LEADER) {
			System.out.println("UPDATE_REJECTED_NOT_LEADER! " + request.getOpType().toString());
		} else if (response.getStatus() == RequestStatus.TEMA_NE_POSTOJI) {
			System.out.println(".TEMA_NE_POSTOJI! TEMA : " + request.getTopic().getText());
		} else if (response.getStatus() == RequestStatus.KOMENTAR_NE_POSTOJI) {
			System.out.println(". KOMENTAR_NE_POSTOJI: " + request.getComment().getText());
		} else if (response.getStatus() == RequestStatus.VREME_ZA_PROMENU_JE_PROSLO) {
			System.out.println(".VREME_ZA_PROMENU_JE_PROSLO TEMA : ");
		} else if (response.getStatus() == RequestStatus.KOMENTAR_NIJE_IZBRISAN) {
			System.out.println(".KOMENTAR_NIJE_IZBRISAN! TEMA : " + request.getComment().getText());
		}

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void inviteServerFunctions(AccountServiceBlockingStub blockingStub) {
		// Poziv AppServer-a preko gRPC-a
		AtomicInteger i = new AtomicInteger(1);
		boolean flag = false;
		System.out.println("1 poziv je ADD_TOPIC");
		System.out.println("2 poziv je ADD_COMMENT");
		System.out.println("3 poziv je Add_COMMENT_TO_COMMENT");
		System.out.println("4 poziv je DEL_COMMENT");
		System.out.println("5 poziv je UP_COMMENT");
		System.out.println("6 poziv je GET_TOPICS");
		System.out.println("7 poziv je GET_COMMENTS");
		System.out.println("8 je izlaz");
		while (true) {

			switch (i.get()) {
			case 1: {

				Topic topic = Topic.newBuilder().setText("Kako unaprediti produktivnost u radu na daljinu?")
						.setUser(user).build();

				Request request = Request.newBuilder().setRequestId(1).setOpType(RequestType.ADD_TOPIC).setTopic(topic)
						.build();

				Response response;

				synchronized (this) {
					response = blockingStub.sendNewTopic(request);
				}

				ispisResponse(response, request);
				System.out.println(i + " uspeo");
				break;
			}
			case 2: {

				Topic topic = Topic.newBuilder().setText("Kako unaprediti produktivnost u radu na daljinu?").build();

				Comment comment = Comment.newBuilder().setText("Odlican clanak! Korisno za sve koji rade od kuce.")
						.setTimestamp(System.currentTimeMillis()).setUser(user).setParentCommentId(0).build();

				Request request = Request.newBuilder().setRequestId(2).setOpType(RequestType.ADD_COMMENT)
						.setTopic(topic).build();

				Response response;

				synchronized (this) {
					response = blockingStub.sendNewCommentToTopic(request);
				}
				ispisResponse(response, request);
				System.out.println(i + " uspeo");
				break;
			}
			case 3: {

				Comment parremtComment = Comment.newBuilder()
						.setText("Odlican clanak! Korisno za sve koji rade od kuce.").build();

				Comment chieldComment = Comment.newBuilder().setText("Hvala! Drago mi je da vam je bilo korisno.")
						.setTimestamp(System.currentTimeMillis()).setUser(user).build();
				Request request = Request.newBuilder().setRequestId(3).setOpType(RequestType.Add_COMMENT_TO_COMMENT)
						.setComment(chieldComment).setCommentParrent(parremtComment).build();

				Response response;

				synchronized (this) {
					response = blockingStub.replyToComment(request);
				}
				ispisResponse(response, request);
				System.out.println(i + " uspeo");
				break;
			}
			case 4: {

				Comment comment = Comment.newBuilder().setText("Odlican clanak! Korisno za sve koji rade od kuce.")
						.build();
				Request request = Request.newBuilder().setRequestId(4).setOpType(RequestType.DEL_COMMENT)
						.setComment(comment)

						.build();

				Response response;

				synchronized (this) {
					response = blockingStub.deleteMyComment(request);
				}
				ispisResponse(response, request);
				System.out.println(i + " uspeo");
				break;
			}
			case 5: {

				Comment comment = Comment.newBuilder().setText("Hvala! Drago mi je da vam je bilo korisno.")

						.setTimestamp(System.currentTimeMillis()).setUser(user).setParentCommentId(0).build();
				Request request = Request.newBuilder().setRequestId(5).setZamena("ovaj komentar je zamenjen")
						.setOpType(RequestType.UP_COMMENT).setComment(comment)

						.build();

				Response response;

				synchronized (this) {
					response = blockingStub.updateMyComment(request);
				}
				ispisResponse(response, request);
				System.out.println(i + " uspeo");
				break;
			}
			case 6: {

				Request request = Request.newBuilder().setRequestId(6).setOpType(RequestType.GET_TOPICS)

						.build();

				Iterator<Topic> response;

				synchronized (this) {
					response = blockingStub.getTopicsList(request);
				}
				for (; response.hasNext();) {
					Topic t = response.next();
					ispisTema(t);
				}
				System.out.println(i + " uspeo");
				break;
			}
			case 7: {
				Topic topic = Topic.newBuilder().setText("Kako unaprediti produktivnost u radu na daljinu?").build();

				Request request = Request.newBuilder().setRequestId(7).setOpType(RequestType.GET_COMMENTS)
						.setTopic(topic)

						.build();

				Iterator<Comment> response;

				synchronized (this) {
					response = blockingStub.getTopicComments(request);
				}
				System.out.println(i + " uspeo");
				for (; response.hasNext();) {
					Comment comment = response.next();
					ispisTema(comment);
				}
				break;
			}
			case 8: {
				flag = true;

			}
			}
			if (flag)
				break;

			i.incrementAndGet();

		}
	}

	public void ispisTema(Comment comment) {
		System.out.println(comment.getText());

	}

	private void ispisTema(Topic topic) {
		// System.out.println("Topic ID: " + topic.getTopicId()); "Text: "
		System.out.println(topic.getText());
		// System.out.println("User: " + topic.getUser());

	}

	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println(
					"Usage java -cp PDS-FT1-1.0.jar;.;lib/* rs.raf.pds.faulttolerance.AppClient <zookeeper_server_host:port>");
			System.exit(1);
		}

		AppClient client;
		try {
			client = new AppClient(args[0], AppServer.APP_ROOT_NODE);
			client.checkLeader();
			client.inviteServer();

		} catch (KeeperException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
