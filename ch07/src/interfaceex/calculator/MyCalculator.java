package interfaceex.calculator;

public class MyCalculator implements Calculator{

	@Override
	public int add(int num1, int num2) {
		return num1 + num2 ;
	}
	@Override
	public int sub(int num1, int num2) {
		return num1 - num2 ;
	}
	@Override
	public int mul(int num1, int num2) {
		return num1 * num2 ;
	}
	@Override
	public int div(int num1, int num2) {
		if(num2 !=0) {
			
		
		return num1 / num2 ;
		}else {
			return Calculator.ERROR;    //오류처리를 상수로함
		}
	}

}
