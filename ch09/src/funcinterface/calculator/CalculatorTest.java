package funcinterface.calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		// Calculator 변수 선언  - add
		Calculator add , sub, mul , div	;
		int num1 =10 , num2 =5; 
		//calculate()를 구현 - 람다식 
		// 덧셈,뺄셈, 곱셈, 나눗셈
		// 덧셈
		add = (n1,n2)-> num1+num2;
		
		
		//calculate() 호출 덧셈
		System.out.println(add.calculate(num1, num2));
		
		//뺄셈
		sub = (n1,n2)-> num1-num2;
		// 호출
		System.out.println(sub.calculate(num1, num2));
		
		// 곱셈
		mul = (n1,n2) -> num1 * num2;
		//호출
		System.out.println(mul.calculate(num1, num2));
		//나눗셈
		div = (n1, n2) -> num1/num2;
		//호출
		System.out.println(div.calculate(num1, num2));
	}

}
