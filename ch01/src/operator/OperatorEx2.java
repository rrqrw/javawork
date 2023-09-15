package operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 비교 연산자 true/false
		// 결과는 boolean 자료임 true/false
		// == 같다 , != 같지않다 
		System.out.println(4 <5 );// true
		System.out.println(4 >5 );// false
		System.out.println(4 == 5 );// false 같다 
		System.out.println(4 != 5 );// true 같지않다
		
		System.out.println("===============");
		
		// 변수를 사용하여 비교 연산하기
		int n1 = 4, n2 = 5; // 변수 2개를 연속하여 선언
		System.out.println(n1 > n2); // false 
		System.out.println(n1 < n2); // true 
		System.out.println(n1 != n2); // true 
		System.out.println(n1 == n2); // false
		
		
		System.out.println("===============");
		
		
		//손흥민 선수가 미혼
		// 결과가 "미혼입니다."
		 boolean isMerried = false;
		 System.out.println(isMerried);
		 
		 // 조건 연산자 : (비교값) ? 참인값 : 거짓인값
		 String result = (isMerried == true) ? "기혼입니다." : "미혼입니다";
		 System.out.println("손흥민 선수는 " + result);
		 
		 // 논리 연산자-&&(그리고),||(또는),!(아니다)

	
	}

}
