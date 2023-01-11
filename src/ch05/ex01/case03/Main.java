package ch05.ex01.case03;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		User user2 = new User();
		//User.userName; private 효과로 사용불가
		
		user.setUserName("최한석");
		user.setAge(12);

		user2.setUserName("한아름");
		user2.setAge(45);
		
		System.out.printf("%s, %d\n", user.getUserName(), user.getAge());
		System.out.printf("%s, %d\n", user2.getUserName(), user2.getAge());
	}
}