package komande;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class GetTopicsCommand extends Command{
	final String topicText;
	
	
	public String getComentText() {
		return topicText;
	}
	public GetTopicsCommand(String topicText) {
		this.topicText = topicText;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void serialize(DataOutputStream os) throws IOException {
		os.writeInt(Command.GetTopicsType);
	      os.writeUTF(topicText);
	}
	
	@Override
	public String writeToString() {
		StringBuffer sb = new StringBuffer();
		sb.append(Command.GetTopicsType).append(' ').append(topicText);
		
		return sb.toString();
	}
	
	public static GetTopicsCommand deserialize(InputStream is) {
	      try {
	          DataInputStream dataInputStream = new DataInputStream(is);
	          return new GetTopicsCommand(dataInputStream.readUTF());
	      } catch (IOException e) {
	          throw new RuntimeException(e);
	      }
	}
	
}
