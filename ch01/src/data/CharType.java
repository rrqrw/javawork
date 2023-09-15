package data;

public class CharType {

	public static void main(String[] args) {
		// 문자 자료형 - char , string
				// 복제 - 알트 + 컨트롤 아래바향키 
				// ASCII코드 
				char alpha = 'A';
				System.out.println(alpha);	
				System.out.println((int)alpha); //65 아스키 코드값, 형변환
				
				int alpha2 = 66;
				System.out.println(alpha2);//66
				System.out.println((char)alpha2); // B
				
		//유니코드 - 16bit =2Byte
				char uniCode1 = '한'; //한문자 홑따옴표
				System.out.println(uniCode1);
		
				char uniCode2 = '\uD55C'; // 16진수 표기 
				System.out.println(uniCode2);// '한'
				
				char uniCode3 = '\uAE00';
				System.out.println(uniCode3); // '글'
	}
	
}
