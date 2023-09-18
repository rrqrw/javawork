package array2d;

public class ArrayAlphabet1 {

	public static void main(String[] args) {
		// 대문자 26자를 배열에 저장
		//for문 출력 
		/*char c = 'A';
		System.out.println(c);
		System.out.println((int)c );
		char c2 = 66;
		System.out.println(c2);*/
		
	System.out.println("===일반 for문을 사용 알파벳 출력===");
		char c;
		for( c = 65; c<=90; c++) { //ch  코드값
			System.out.print(c+ " ");
		}
		System.out.println(" \n변수의 마지막 값" +(char)(c-1)); //z
		System.out.println("\n== 알파벳을 배열에 저장하고 출력==");
		char[] alphabets = new char[26];
		char ch ='A';
		
		//alphabets[0]= ch;
		//System.out.println(alphabets[0]);//A
		//ch++;
		//alphabets[1] = ch; // 자바 덧셈연산하면 int형으로 바뀜
		//System.out.println(alphabets[1]);//
		for(int i=0; i<alphabets.length; i++) {
			alphabets[i] =ch;
			ch++;
		}
		// 알파벳출력
		for(int i=0; i<alphabets.length; i++) {
			System.out.print(alphabets[i]+ " ");
		}
	}

}
