package methods;

public class OneUpTest2 {
	static int x = 1;
	
	
	public static int oneUp() {
		x+=1;
		return x;
		
	}

	public static void main(String[] args) {
		System.out.println(oneUp());
		System.out.println(oneUp());
		System.out.println(oneUp());
		

		
		System.out.println("x="+ x);
	}

}
