package protectedex.pack2;

import protectedex.pack1.A;

public class D extends A {
	// A를 D가 상속 받음
	// 패키지가 달라도 상속 관계는 protected 에 접근(사용)가능
	public D() {
		super();
		this.fleld = "yes";
		this.method();
	}
	

}
