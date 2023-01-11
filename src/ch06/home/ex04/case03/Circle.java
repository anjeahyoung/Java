package ch06.home.ex04.case03;

public class Circle {
	private Point point;
	private int r;
	
	public Circle(Point point, int r) {
		this.point  = point;
		this.r = r;
	}
	//과제: 생성자를 기술하라.
	
	@Override
	public String toString() {
		return String.format("%s r = %d", this.point, this.r);
	}
}