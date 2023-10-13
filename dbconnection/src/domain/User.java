package domain;

import java.io.Serializable;

//dto 클래스 (자료 전달 객체), vo
public class User implements Serializable{
	private String userId;
	private String userName;
	private String userPassword;
	private int userAge;
	private String userEmail;
	
	private static final long serialVersionUid = 1112L;
	//기본 생성자 생략
	public User()	{}	;
	
	//메서드 (getter/setter)
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userAge="
				+ userAge + ", userEmail=" + userEmail + "]";
	}
	
	
	
	
	
}
