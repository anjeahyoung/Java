package ch06.ex03.case02;

public class Dog extends Animal {
	@Override //컴파일러가 부모객체에 멤버변수와 다르면 오류라고 알려준다. 
	public void shout() {
		System.out.println("멍멍");
	}
}