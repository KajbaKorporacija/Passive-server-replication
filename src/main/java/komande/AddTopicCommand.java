package komande;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;



public class AddTopicCommand extends Command{
	final String topicText;
	
	public String getComentText() {
		return topicText;
	}
	
	public AddTopicCommand(String topicText) {

		this.topicText = topicText;
	}


	@Override
	public void serialize(DataOutputStream os) throws IOException {
		os.writeInt(Command.AddTopicType);
	      os.writeUTF(topicText);
	}
	
	
	@Override
	public String writeToString() {
		StringBuffer sb = new StringBuffer();
		sb.append(Command.AddTopicType).append(' ').append(topicText);
		
		return sb.toString();
	}
	
	
	public static AddTopicCommand deserialize(InputStream is) {
	      try {
	          DataInputStream dataInputStream = new DataInputStream(is);
	          return new AddTopicCommand(dataInputStream.readUTF());
	      } catch (IOException e) {
	          throw new RuntimeException(e);
	      }
	}
	
	
}
