package operator;

public class OpertorEx1 {

	public static void main(String[] args) {
		// 산술 연산자(상수) +,-,*,/,%
		System.out.println(4 + 8);
		System.out.println(4 - 8);
		System.out.println(4 * 8);
		System.out.println(4 / (double)8);// 형변환 Type conversion
		//나머지 연산자
		System.out.println(4 % 8);//4  4를 8로 나누고 남은값 =4 
		// 홀수,짝수 판별
		System.out.println(4 % 2);// 0(짝수)
		System.out.println(7 % 2);// 1(홀수)
		
		System.out.println("======================");
		//산술 연산자 (변수 사용) 나눳을때 실수가 나오면 더블 입력
		int a = 4;
		int b = 8;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / (double)b);
		
		//점수의 합계 , 평균
		int korScore = 95;  //국어점수90점( '='은 대입연산자)
		int mathScore = 80; // 영어점수 80점
		int sumScore;// 합계 변수선언
		double avgScore;//평균 = 총점 / 과목수
		
		sumScore = korScore + mathScore;// 합계 계산
		avgScore = (double)sumScore / 2;//  
		System.out.println("총점: " +sumScore);
		System.out.println("평균: " +avgScore);
		
		
		

	}

}
