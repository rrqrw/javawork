package collection.queue;

public class MyQueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		
		//자료저장
		queue.enQueue("수박");
		queue.enQueue("배");
		queue.enQueue("사과");

		
		//자료 삭제(출력)
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}

}
