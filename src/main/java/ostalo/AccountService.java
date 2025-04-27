package ostalo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Scanner;

import gRPCgenerisano.LogResponse;
import gRPCgenerisano.LogStatus;
import komande.AddCommentCommand;
import komande.AddTopicCommand;
import komande.Command;
import komande.DelCommentCommand;
import komande.GetCommentsCommand;
import komande.GetTopicsCommand;
import komande.ReplyCommand;
import komande.UpCommentCommand;

public class AccountService {
	ByteArrayInputStream bais;
	ByteArrayOutputStream baos = new ByteArrayOutputStream();

	DataInputStream dis = new DataInputStream(bais);
	DataOutputStream dos = new DataOutputStream(baos);

	boolean isLeader = false;

	ReplicatedLog log;

	public AccountService(ReplicatedLog log) {
		this.log = log;
	}

	public void appendCommandToLogAndReplicate(Command command) {
		try {
			// command.serialize(dos);
			// log.appendAndReplicate(baos.toByteArray());
			// baos.reset();

			log.appendAndReplicate(command.writeToString().getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void addComment(String value, boolean applyLog) {

		if (applyLog) {
			AddCommentCommand command = new AddCommentCommand(value + " AddComment");
			appendCommandToLogAndReplicate(command);
		}

	}

	public void addCommentToComment(String value, boolean applyLog) {

		if (applyLog) {
			ReplyCommand command = new ReplyCommand(value + " REPLY");
			appendCommandToLogAndReplicate(command);
		}

	}

	public void addTopic(String comentText, boolean applyLog) {
		if (applyLog) {
			AddTopicCommand command = new AddTopicCommand(comentText + " AddTopic");
			appendCommandToLogAndReplicate(command);
		}

	}

	public void delComment(String value, boolean applyLog) {

		if (applyLog) {
			DelCommentCommand command = new DelCommentCommand(value + " DeleteComment");
			appendCommandToLogAndReplicate(command);
		}

	}

	public void upComment(String value, boolean applyLog) {

		if (applyLog) {
			UpCommentCommand command = new UpCommentCommand(value + " UpdateComment");
			appendCommandToLogAndReplicate(command);
		}

	}

	public void getComments(String value, boolean applyLog) {

		if (applyLog) {
			GetCommentsCommand command = new GetCommentsCommand(value + " GetAllCommentsComment");
			appendCommandToLogAndReplicate(command);
		}

	}

	public void getTopics(String comentText, boolean applyLog) {
		if (applyLog) {
			GetTopicsCommand command = new GetTopicsCommand(comentText + " GetAllTopicsComment");
			appendCommandToLogAndReplicate(command);
		}

	}

	public LogResponse appendLog(Long entryIndex, byte[] data) throws IOException {
		if (log.getLastLogEntryIndex() < (entryIndex - 1)) {
			LogResponse response = LogResponse.newBuilder().setStatus(LogStatus.LOG_HASNT_LAST_ENTRY)
					.setLastEntryIndex(log.lastLogEntryIndex).setEntryAtIndex(entryIndex).build();
			return response;
		}

		log.appendToLocalLog(data);

		// DataInputStream ds = new DataInputStream(new ByteArrayInputStream(data));
		Scanner sc = new Scanner(new String(data));

		// int commandType = ds.readInt();
		int commandType = sc.nextInt();

		if (commandType == Command.AddCommentType) {
			// AddCommentCommand command = AddCommentCommand.deserialize(ds);
			AddCommentCommand command = new AddCommentCommand(sc.nextLine());
			addComment(command.getComentText(), false);

		} else if (commandType == Command.AddTopicType) {
			// AddTopicCommand command = AddTopicCommand.deserialize(ds);
			AddTopicCommand command = new AddTopicCommand(sc.nextLine());
			addTopic(command.getComentText(), false);
		} else if (commandType == Command.DeleteCommentType) {
			// DelCommentCommand command = DelCommentCommand.deserialize(ds);
			DelCommentCommand command = new DelCommentCommand(sc.nextLine());
			delComment(command.getComentText(), false);
		} else if (commandType == Command.UpdateCommentType) {
			// UpCommentCommand command = UpCommentCommand.deserialize(ds);
			UpCommentCommand command = new UpCommentCommand(sc.nextLine());
			upComment(command.getComentText(), false);
		} else if (commandType == Command.GetCommentsType) {
			// GetCommentsCommand command = GetCommentsCommand.deserialize(ds);
			GetCommentsCommand command = new GetCommentsCommand(sc.nextLine());
			getComments(command.getComentText(), false);
		} else if (commandType == Command.GetTopicsType) {
			// GetTopicsCommand command = GetTopicsCommand.deserialize(ds);
			GetTopicsCommand command = new GetTopicsCommand(sc.nextLine());
			getTopics(command.getComentText(), false);
		}

		LogResponse response = LogResponse.newBuilder().setStatus(LogStatus.LOG_OK).setEntryAtIndex(entryIndex).build();

		return response;
	}

	public void setServerState(boolean isLeader) {
		this.isLeader = isLeader;
	}
}
