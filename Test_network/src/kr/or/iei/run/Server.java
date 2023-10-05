package kr.or.iei.run;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

	//필드 
	private static ServerSocket serverSocket;
	
	
	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("서버를 종료하려면 q또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("=========================================");
		
		
		//TCP 서버 시작
				startServer();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q"))
				break;
			
			
			
		}
		
		
		
		scanner.close();
		
		//TCP  서버종료
		stopServer();
			
		
	}
	private static void startServer() {
		// 작업 스레드 생성
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					serverSocket = new ServerSocket(8000);
					System.out.println("[서버] 시작됨");
					
					while(true) {
						System.out.println("[서버] 연결 요청을 기다림");
						
						//서버가 연결 요청 수락함 
						Socket socket = serverSocket.accept(); // 클라이언트와 통신할 소켓 생성 
					
						// IP 주소 알아내기 
						InetSocketAddress isa = 
								(InetSocketAddress) socket.getRemoteSocketAddress();
						String clientIp =isa.getHostString();
						System.out.println("[서버]"+ clientIp + "의 연결 요청을 수락함");
						
						//데이터 받기 (수신)
						InputStream is = socket.getInputStream();
						DataInputStream dis = new DataInputStream(is); //기반스트림을 생성자의 매개변수로 연결 
						String message = dis.readUTF();
						System.out.println("[서버] 데이터를 받음: " + message);
						
						//데이터 보내기 (송신)
						String message2 = "서버가 글을 보냅니다.";
						//OutputStream os = socket.getOutputStream();
						DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
						dos.writeUTF(message2);
						dos.flush();
						System.out.println("[서버] 데이터를 보냄: " + message2);
						socket.close();
						System.out.println("[서버]"+ clientIp + "의 연결을 끊음");
					}
			
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("[서버]"+ e.toString());
				}
				
			}
		};
		thread.start();
		
	}//stapSever 끝
	
	private static void stopServer() {
		try {
			serverSocket.close();
			System.out.println("[서버] 종료됨");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}