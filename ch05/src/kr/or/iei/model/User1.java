package kr.or.iei.model;

public class User1 {
	private String id;
	private String pwd;
	private String name;

	public User1() {
	}

	// 따로 set안쓰고 세팅하는방법
	public User1(String id, String pwd, String name) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getpwd() {
		return pwd;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}