package arrays;

public class FindMaxValue {

	public static void main(String[] args) {
		// 배열에서 최대값 찾기
		// 1.최대값(maxval) 설정 - 0번 인덱스 
		//2. 전체를 반복하면서 최대값과 비교해서 
		//   최대값보다 크면 그 값을 최대값으로 변경
		int[]arr= new int[] {1, 5 , 8 , 3 , 2} ;
		int maxval = arr[0];
		for(int i= 1; i < arr.length; i++) {
			if(arr[i]> maxval) {
				maxval = arr[i];
			}
				
			
		}
		/* 
		 * i=0       maxval =1
		 * i=1 5 > 1 maxval =5
		 * i=2 8 > 5 maxval =8
		 * i=3 3 > 8 maxval =8
		 * i=4 2 > 8 maxval =8
		 * 
		 */
		//최대값 출력 
		System.out.println("최대값 : " + maxval);
		
		

	}

}
