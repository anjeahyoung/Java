package ch06.ex03.case02;

public class Cat extends Animal {
	@Override
	public void shout() {
		System.out.println("야옹야옹");
	}
}
// 재정의를 위해서는 선언구가 같아야 한다.