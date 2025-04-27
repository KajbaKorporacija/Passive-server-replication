package komande;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReplyCommand extends Command{

final String comentText;
	
	
	public ReplyCommand(String comentText) {
		super();
		this.comentText = comentText;
	}



	public String getComentText() {
		return comentText;
	}



	@Override
	public void serialize(DataOutputStream os) throws IOException {
		os.writeInt(Command.AddCommentType);
	      os.writeUTF(comentText);
	}
	
	
	
	@Override
	public String writeToString() {
		StringBuffer sb = new StringBuffer();
		sb.append(Command.ReplyCommentType).append(' ').append(comentText);
		
		return sb.toString();
	}
	public static ReplyCommand deserialize(InputStream is) {
	      try {
	          DataInputStream dataInputStream = new DataInputStream(is);
	          return new ReplyCommand(dataInputStream.readUTF());
	      } catch (IOException e) {
	          throw new RuntimeException(e);
	      }
	}

}
