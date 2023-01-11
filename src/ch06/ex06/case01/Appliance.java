package ch06.ex06.case01;

public abstract class Appliance {
	public void on() {}
	public abstract void off(); 
}
//abstract 추상 클래스를 알려준다.
//추상 메서드가 있다면 클래스도 추상 클래스가 되야 한다.
//추상 메서드로는 실행할 메서드가 없기 때문이다.