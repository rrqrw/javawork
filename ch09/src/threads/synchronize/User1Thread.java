package threads.synchronize;

public class User1Thread extends Thread{
	//Calctlator	참조
	private Calculator calculator;
	
	public User1Thread() {
		setName("User1Thread"); // 스레드 이름 설정 
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	 @Override
	public void run() {
		 calculator.setMemory(100);
	}

}
