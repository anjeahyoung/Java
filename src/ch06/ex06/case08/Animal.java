package ch06.ex06.case08;

public interface Animal {
	void move();
	
	default void eat() {}
}
//interface 내에서 알고리즘을 안다면 default로 만든다.