package arrays;

public class ArrayTest4 {

	public static void main(String[] args) {
		// 실수형 배열의 연산
		// 크기가 5인 실수형 배열 data 선언
		//총점 변수 total
		
		double[] data = new double[5];
		double total = 0.0;
		double average;
		
		//저장
		data[0]= 10.0;
		data[1]= 20.0;
		data[2]= 30.0;
		//전체 조회
		for(int i=0; i < data.length; i++) {
			total+= data[i];
			System.out.println(data[i]);
			
		}
		//평균계산
		average = total / data.length;
		// 총점 출력
		
		System.out.println("총점:" + total);
		// 평균출력
		System.out.println("평균:" + average);
		

	}

}
