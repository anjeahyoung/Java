package ch07.ex05.case01;

public class Basket<E> {
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
/*
임의의 데이터 타입
*/