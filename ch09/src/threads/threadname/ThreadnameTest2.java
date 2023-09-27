package threads.threadname;

public abstract class ThreadnameTest2 {

	public static void main(String[] args) {
		// 스레드 생성 - 익명 객체로 구현
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName());
		
		for(int i=0; i<2; i++) {
			// Thread (작업 스레드)의 객체 생성
			Thread threadA = new Thread() {

				@Override
				public void run() {
					System.out.println(getName() + " 실행");
					
				}
			};
			threadA.start();
		}
			for(int i=0; i<2; i++) {
				// Thread (작업 스레드)의 객체 생성
				Thread threadB = new Thread() {

					@Override
					public void run() {
						System.out.println(getName() + " 실행");
						
					}
				};
				threadB.setName("chat-Thread");
				threadB.start();
			
			
			}
		
	}
}

