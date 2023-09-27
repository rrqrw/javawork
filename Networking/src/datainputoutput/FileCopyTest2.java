package datainputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopyTest2 {

	public static void main(String[] args) {
		//close() 사용하지 않는 방법 : try - with ~ resource 문
		//바이트 단위로 읽어서 쓰기(복사)- 이미지
		String originFile = "C:/File/havest-1.jpg";//원본 파일
		String copyFile  = "C:/File/havest-3.jpg" ; // 사본 파일 
		long start , end;
		try(InputStream is = new FileInputStream(originFile);  
				OutputStream os = new FileOutputStream(copyFile)) {
			start = System.currentTimeMillis(); //복사전 시간
			
			while(true) {
				int data = is.read();	//읽은 데이터  
				if(data ==-1)break;
				os.write(data); //파일에 쓰기
				
			}
			/*byte[] data = new byte[1024];	
			
			while(true) {
				int readBytes = is.read(data);// 데이터를 읽은 바이트 수 
				if(readBytes== -1)break;
				for(int i=0; i<readBytes; i++) {
					os.write(data[i]);
				}
			}*/
			
			
			
			os.flush();// 버퍼 지우기
			
			end = System.currentTimeMillis(); // 복사후 시간 
			System.out.println("복사 소요 시간 : " + (end -start) + "ms");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
