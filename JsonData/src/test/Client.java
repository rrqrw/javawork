package test;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("localhost",8000);
			System.out.println("[클라이언트]연결 성공");
			
			//데이터 보내기 
			String sendMessage = "자바 네트워크 프로그래밍!";
			OutputStream os= socket.getOutputStream();
			DataOutputStream dos = new DataOutputStream(os);
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터를 보냄: " + sendMessage);
			
			//데이터 받기
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터를 받음: " + receiveMessage);
			
			socket.close();
			System.out.println("[클라이언트]연결 끊음");
		} catch (UnknownHostException e) { //host 컴퓨터 이름이 잘못될 경우 
			e.printStackTrace();
		} catch (IOException e) { // port번호 
			e.printStackTrace();
		}

	}

}
