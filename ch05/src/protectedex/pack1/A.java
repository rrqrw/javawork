package protectedex.pack1;

//protected - 다른 패키지는 접근 불가
//같은 패키지 내부나 다른 패키지여도 상속 관계는 접근(사용) 가능
public class A {
	protected String field;
	
	protected A(){}
	
	protected void method() {}
}
