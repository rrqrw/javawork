package stringmethod;

public class StringBuilderTest {

	public static void main(String[] args) {
		
		String javaStr = new String("java");
		//System.out.println("처음 문자열 주소값: " +System.identityHashCode(javaStr));
		
		StringBuilder buffer = new StringBuilder(javaStr);
		System.out.println(buffer);
		System.out.println("연산전 buffer 메모리 주소  : " +System.identityHashCode(buffer));
		// 문자열 추가, 연결 
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!");
		
		
		System.out.println(buffer);
		System.out.println("연산후 buffer 메모리 주소  : " +System.identityHashCode(buffer));
		
		
	}

}
