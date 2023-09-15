package arrays;

public class ArrayTest3 {

	public static void main(String[] args) {
		// 크기가 4인 정수형 배열선언
		 int[] number = new int[4];
		 int total =0;// 합계
		 double average;// 변수- 평균 선언 평균=(합계/개수)
		 
		 
		 //입력
		 number[0] = 10;
		 number[1] = 20;
		 number[2] = 30;
		 // 직접 초기화
		 //int[] number = {10,20,30,0};
		 //2번 인덱스 값 출력
		 //합계와 평균
		 System.out.println(number[2]);
		 for(int i=0; i<number.length; i++) {
			 total+= number[i];// total = total + number[i];
			 System.out.println(number[i]);
			 
		 }
		 average = total / number.length;//평균 = 합계/ 개수
		 System.out.println("평균:" + average);
		 
		 
		 System.out.println("합계:" + total);

	}

}
