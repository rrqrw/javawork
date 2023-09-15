package inheritance.person;

// Enginner 가 Person 을 상속 받음 
public class Engineer extends Person{
	int companyId;
	// 매개변수 있는 생성자를 상속받을때 super() 사용
	public Engineer(String name, int age, int companyId) {
		super(name,age); // 부모 클래스 상속
		this.companyId = companyId; // 자식 클래스의 필드 초기화
		
	}
	public int getcompanyId() {
		return companyId;
	}
	

}
