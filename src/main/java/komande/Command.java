package komande;

import java.io.DataOutputStream;
import java.io.IOException;

public abstract class Command {

	public static int AddTopicType = 1;
	public static int AddCommentType = 2;
	public static int ReplyCommentType = 3;
	public static int DeleteCommentType = 4;
	public static int UpdateCommentType = 5;
	public static int GetTopicsType = 6;
	public static int GetCommentsType = 7;
	

	public void serialize(DataOutputStream os) throws IOException {

	}

	public abstract String writeToString();

}
