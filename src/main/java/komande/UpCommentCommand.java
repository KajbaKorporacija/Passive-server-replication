package komande;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;



public class UpCommentCommand extends Command{
	final String comentText;
	
	
	public String getComentText() {
		return comentText;
	}
	public UpCommentCommand(String comentText) {
		
		this.comentText = comentText;
	}


	@Override
	public void serialize(DataOutputStream os) throws IOException {
		os.writeInt(Command.UpdateCommentType);
	      os.writeUTF(comentText);
	}
	
	
	@Override
	public String writeToString() {
		StringBuffer sb = new StringBuffer();
		sb.append(Command.UpdateCommentType).append(' ').append(comentText);
		
		return sb.toString();
	}
	
	public static UpCommentCommand deserialize(InputStream is) {
	      try {
	          DataInputStream dataInputStream = new DataInputStream(is);
	          return new UpCommentCommand(dataInputStream.readUTF());
	      } catch (IOException e) {
	          throw new RuntimeException(e);
	      }
	}

}
