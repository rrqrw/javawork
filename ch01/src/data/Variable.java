package data;

public class Variable{

	public static void main(String[] args) {
		// 변수를 사용 
		// 변수 선언 방법 - 자료형 변수이름 
		int year = 2023;   //정수 자료형 변수  year를 선언함, 2023을 대입 
		System.out.println(year +"년");// 숫자와문자 더하기 연결하기 
		
		int month = 9;// 변수의 초기화(선언과 동시의값을 대입)
		System.out.println(month + "월");
		int day = 5;
		System.out.println(day + "일");
		
		// 손흥민은 3학년 2반입니다.
		// 변수 -이름(name) 학년 (grade) 반 (schoolClass)
		//문자열 자료형- string 한 문자 자료형 - char
		/*변수 이름명명시 문법 오류  
		  1. 예약어 (이미정해진 명령어는 사용할수 없음)
		  2. 변수이름에 공백(문자)을 사용할 수 없음
		  3. 숫자로 시작할 수 없음
		  
		 */
		String name = "손흥민";
		
		int grade =3;
		int schoolClass =2;// 예약어 (이미정해진 명령어는 사용할수 없음)
		System.out.println(name +  "은 " + grade + "학년 " + schoolClass + "반 입니다" );
		
	

	}

}
