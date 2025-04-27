package komande;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class DelCommentCommand extends Command{
	final String comentText;
	
	public String getComentText() {
		return comentText;
	}
	public DelCommentCommand(String comentText) {
		super();
		this.comentText = comentText;
	}
	@Override
	public void serialize(DataOutputStream os) throws IOException {
		os.writeInt(Command.DeleteCommentType);
	      os.writeUTF(comentText);
	}
	@Override
	public String writeToString() {
		StringBuffer sb = new StringBuffer();
		sb.append(Command.DeleteCommentType).append(' ').append(comentText);
		
		return sb.toString();
	}
	public static DelCommentCommand deserialize(InputStream is) {
	      try {
	          DataInputStream dataInputStream = new DataInputStream(is);
	          return new DelCommentCommand(dataInputStream.readUTF());
	      } catch (IOException e) {
	          throw new RuntimeException(e);
	      }
	}
}
