package threads.synchronize;

public class User2Thread extends Thread{
	//Calctlator	참조
	private Calculator calculator;
	
	public User2Thread() {
		setName("User2Thread"); // 스레드 이름 설정 
	}
	
	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
	 @Override
	public void run() {
		 calculator.setMemory(50);
	}

}
