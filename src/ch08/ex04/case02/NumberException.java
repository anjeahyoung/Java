package ch08.ex04.case02;

public class NumberException extends RuntimeException{
	public NumberException(String msg) {
		super(msg);
	}
}
//rentimeException 을 상속 받으면 try를 하지 않아도 된다.