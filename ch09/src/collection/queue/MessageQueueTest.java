package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class MessageQueueTest {

	public static void main(String[] args) {
		//Queue를 구현한 LinkedList를 자료구조로 사용 
		Queue<Message> msgQueue = new LinkedList<>();
		
		
		//Message 객체 생성 
		Message email = new Message("email","이순신");
		Message sms = new Message("sms","양만춘");
		Message katalk = new Message("katalk","을지문덕");
		
		
		//객체 저장 - offer()
		
		msgQueue.offer(email);
		msgQueue.offer(sms);
		msgQueue.offer(katalk);
		
		// 객체 꺼내기(삭제)- poll()
		//반복 - 확인(isEmpty())
		while(!msgQueue.isEmpty()) {
			Message message = msgQueue.poll(); // 1개씩 꺼냄 
			switch(message.command) {
			case "email":
					System.out.println(message.to+ "s님에게 이메일을 보냅니다.");
					break;
			case "sms":
				System.out.println(message.to+ "s님에게 SMS을 보냅니다.");
				break;
			case "katalk":
				System.out.println(message.to+ "s님에게 Katalk을 보냅니다.");
				break;			
			}
		}
		
		
	}

}
