package ch06.ex04.case02;

public class Circle {
	private int dotX;
	private int dotY;
	private int radius;
	
	public Circle(int dotX, int dotY, int radius) {
		  this.dotX = dotX;
		  this.dotY = dotY;
		  this.radius = radius;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d) r = %d", dotX, dotY, radius); 
	}
}

/*
 과제 팁
디자인하라 = 멤버변수를 찾아라
이야기가 나온다 = 메서드까지 
*/