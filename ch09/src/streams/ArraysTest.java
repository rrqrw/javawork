package streams;

import java.util.Arrays;
import java.util.Collections;

public class ArraysTest {

	public static void main(String[] args) {
		//Stream 인터페이스 - 배열을 쉽고 효율적으로 처리하는 기능 
		Integer[] num1 = {3, 1, 2, 4, 5};
		//int[] num1= {3, 1, 2, 4, 5};
		
		
		
		// 오름차순 정렬 - Arrays.sort()	\
		Arrays.sort(num1);
		System.out.println(Arrays.toString(num1));
		
		// 오름차순 정렬된 배열을 뒤집기
		Collections.reverse(Arrays.asList(num1));
		System.out.println(Arrays.toString(num1));
		
		
		// Arrays.toString() - 객체 그대로 (리스트형) 출력
		System.out.println(Arrays.toString(num1));

		//num1 의 요소 중 3개 복사 - Arrays.copyOf()
		Integer[] num2 = Arrays.copyOf(num1, 3); // num1 의 3개 복사 
		System.out.println(Arrays.toString(num2));
		
	
	}

}
