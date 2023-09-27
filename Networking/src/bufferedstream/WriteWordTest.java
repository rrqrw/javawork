package bufferedstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteWordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Writer writer = new FileWriter("word.txt");
			
			String word =("ant bear chicken cow eagle elephant" +
								"horse monkey penguin tiger");
			writer.write(word);
			writer.flush();
			writer.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
