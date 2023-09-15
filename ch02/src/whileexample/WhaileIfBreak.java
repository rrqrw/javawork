package whileexample;

public class WhaileIfBreak {

	public static void main(String[] args) {
		// 반복조건문(while ~if ~ 
		// 1부터 10까지 출력
		int i = 0;
		while(true) {// 무한반복
			i++;
			System.out.print(i);
			if(i == 10) //  중괄호 블럭은 실행문이 한줄일때 생략가능
			   break; //탈출
		}

	}

}
