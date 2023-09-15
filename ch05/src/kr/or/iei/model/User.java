package kr.or.iei.model;

// 회원 클래스(자료형) 정의
public class User {
	//필드(속성)
	private String id;
	private String pwd;
	private String name;

	public User() {} // 생성자
	
	//매개 변수 있는 생성자   이거처럼쓸땐 생성자 만들어야댐
	public User(String id, String pwd, String name) {
		this.id= id;
		this.pwd= pwd;
		this.name= name;
	}
	//set+필드이름() - 입력  , get+ 필드이름()함수- 출력
	public void setId(String id) {
		this.id =id;
	}
	
	public String getId() {
		return id;
	}
	
	public void setPwd(String pwd) {
		this.pwd =pwd;
	}
	public String getPwd() {
		return pwd;
	}
	public void setName(String name) {
		this.name  = name;
	}
	public String getName() {
		return name;
	}

}
