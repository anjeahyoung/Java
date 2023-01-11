package ch05.ex06.case01;

public class Man {
	public static void say(String msg) {
		System.out.println(msg);
	}
	//static mathod 객체를 파괴한다.
	public void tell(String msg) {
		System.out.println(msg);
	}
}