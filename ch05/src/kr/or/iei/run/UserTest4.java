package kr.or.iei.run;

import kr.or.iei.model.User1;

public class UserTest4 {

	public static void main(String[] args) {
		User1 user1 = new User1("123s4", "11555", "장유빈"); // 생성자 없이 하는방법 여기서 셋팅

		System.out.println(user1.getId());

		User1[] users = new User1[3];

		User1 user2 = new User1("dddss1", "123124", "기믹미");
		User1 user3 = new User1("ddds4", "12313213", "기미");
		User1 user4 = new User1("dddss1", "123124", "기");

		users[0] = user2;
		users[1] = user3;
		users[2] = user4;

		System.out.println(user2.getId() + "," + user2.getpwd() + "," + user2.getName());

		for (int i = 0; i < users.length; i++) {
			System.out.println(users[i].getId() + users[i].getpwd() + users[i].getName());
		}

	}

}
