package ch05.ex01.case04;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		user.setName("최한석");
		
		User user2 = new User();
		user2.setName("한아름");
		
		System.out.println(user.getUserName());
		System.out.println(user2.getUserName());
	}
}

//integrity