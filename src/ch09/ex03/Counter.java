package ch09.ex03;

public class Counter {
	private int val;
	
	public synchronized void increase() {
		val++;
	}
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}
//synchronized = lock 쓰레드의 사용을 막는다.