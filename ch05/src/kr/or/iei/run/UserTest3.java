package kr.or.iei.run;

import kr.or.iei.model.User1;

public class UserTest3 {

	public static void main(String[] args) {
		 User1 user1 = new User1();
		 
		 user1.setId("dsadf");
		 user1.setPwd("15973");
		 user1.setName("장유빈");
		 
		 
		 System.out.println(user1.getId());
		 System.out.println(user1.getpwd());
		 System.out.println(user1.getName());
		

	}

}
