package arrays;

public class FindMaxIdx {

	public static void main(String[] args) {
		// 최대값의 위치 찾기
		int[]arr= new int[] {10, 50 , 80 , 30 , 20} ;
		int maxIdx = 0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]> arr[maxIdx]) { // 값의 대소 비교 
				maxIdx = i; // 최대값 위치에 i를 저장
			
				
			//if문
		}
		
		}
		System.out.println("최대값의 위치는 : " + maxIdx);
	}

}
