package datainputoutput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteExample2 {

	public static void main(String[] args) {
		
		
			OutputStream os;
			try {
				os = new FileOutputStream("C:/File/test2.db");
			
			// 배열로 데이터 생성
			byte[] array = {10,20,30,40,50};
			
			// 배열의 모든 바이트를 쓰기 
			os.write(array);
			
			os.flush();
			os.close();} 
			
			catch (IOException e) {
				
				e.printStackTrace();
			}
	

	}

}
