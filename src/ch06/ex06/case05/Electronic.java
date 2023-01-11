package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLTAGE = 200;
	static final String MAKER_NAME = "LG";
	final int WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
}
//public static final 은 생략가능
//변하지 않는 값을 코드라고 부른다.
//코드 변수와 코드 값으로 부른다.
//코드는 바로 기본값을 대입해도 된다.