package forexample;

public class GugudanFull {

	public static void main(String[] args) {
		// 구구단 전체 출력
		/*for(int i=2; i<= 9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + " x "+ j + " = " + (i*j));
			}
			System.out.println();
		}
		//단보다 곱하는 수가 작거나 같은 경우까지만 출력
         /*
          * 2x1=2
          * 2x2=4
          * 
          * 3x1=3
          * 3x2=6
          * 3x3=9
          */
		for(int i=2; i<= 9; i++) {
			for(int j=1; j<=i; j++) {
				System.out.println(i + " x "+ j + " = " + (i*j));
			}
			System.out.println();
		}
	}

}
