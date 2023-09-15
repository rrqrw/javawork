package classes.methods;

public class Hello {
	
	// sayHello() 메서드 정의
	// 매서드 오버로딩(함수이름은 같고 매개변수가 다름)
	public void sayHello () {
		System.out.println("안녕~");
	}
	public void sayHello(String name) {
		System.out.println("안녕~"+ name);
	}
}
