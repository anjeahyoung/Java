package ch06.ex04.case03;

public class Circle extends Point {
	private int r;
	
	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}
	//과제: 생성자를 기술하라.
	
	@Override
	public String toString() {
		return String.format("(%d, %d) r = %d", this.getX(), this.getY(), r );
	}
}