package data;

public class DataTypeEX {

	public static void main(String[] args) {
		// int, long 차이점
		// int형 크기 - 4Byte (32bit)  -21억~21억
		// long형 - 8Byte (64bit) -
		int num1 = 1234567890; // 12억
		long num2 = 12345678900L; //숫자뒤에 'L'이나 'l' 을 붙여야함
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
