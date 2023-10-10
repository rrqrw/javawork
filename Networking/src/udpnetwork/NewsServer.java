package udpnetwork;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;

public class NewsServer {
	
	//필드 
	private static DatagramSocket datagramSocket;
	
	public static void main(String[] args) {
		System.out.println("=========================================");
		System.out.println("서버를 종료하려면 q또는 Q를 입력하고 Enter를 누르세요.");
		System.out.println("=========================================");
		
		
		//UDP 서버 시작
				startServer();
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			String key = scanner.nextLine();
			if(key.toLowerCase().equals("q"))
				break;
			
			
			
		}
		
		
		
		scanner.close();
		
		//UDP  서버종료
		stopServer();
		
	
	}
	public static void startServer(){
		//작업 스레드 정의
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//통신 객체 생성 
					datagramSocket = new DatagramSocket(8100);
					System.out.println("[서버] 시작됨");
					
					//클라이언트가 보낸 뉴스 주제 받기
					while(true) {
						DatagramPacket receivePacket = 
								new DatagramPacket(new byte[1024], 1024);
							datagramSocket.receive(receivePacket);
					
					//받은 주제를 문자열 복원 
					String newskind = new String(receivePacket.getData(), 0,
							receivePacket.getLength(),"utf-8");
					
					//주제 관련 뉴스10개를 클라이언트로 전송 
					//클라이언트와 IP와 port를얻음
					SocketAddress socketAddress = receivePacket.getSocketAddress();
					for(int i=1; i<=10; i++) {
						String data = newskind + ": 뉴스" + i;
						byte[] bytes = data.getBytes("utf-8");
						DatagramPacket sendPacket = new DatagramPacket(bytes, 0,
								bytes.length, socketAddress	);
						datagramSocket.send(sendPacket);
						//1초 간격으로 보내기 
						Thread.sleep(1000);
					}
					
					
					}//while끝
				} catch (IOException e) {
					//e.printStackTrace();
					System.out.println("[서버]" +e.getMessage());
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		};
		thread.start();
		
	}
	public static void stopServer() {
	datagramSocket.close();
	System.out.println("[서버] 종료됨");
	}
}
