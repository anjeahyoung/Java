package ch06.ex02.case01;

public class A {
	private int a;
	int b; //기본값 패키지가 같은 것만 보임
	protected int c; //다른 패키지여도 자식이라면 보인다.
	public int d;
	
	private void m1() {}
	void m2() {}
	protected void m3() {}
	public void m4() {}
}