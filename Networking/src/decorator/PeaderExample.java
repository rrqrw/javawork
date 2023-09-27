package decorator;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PeaderExample {

	public static void main(String[] args) {
		try {
			Reader reader =  new FileReader("message.txt");
			 int data;
			/*while(true) {
				data = reader.read();
				if(data==-1 )break;
				System.out.print((char)data);
			}*/
			 while((data= reader.read()) != -1){
				 System.out.print((char)data);
			 }
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
