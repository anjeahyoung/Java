package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say.");
		human.say();
		human.sleep();
		Human.walk(); // static 메서드 이므로 데이터타입. 으로 사용한다.
		
		human = new Student();
		human.say();
		human.sleep();
	}
}
