package ch06.ex06.case09;

public interface UI {
	static String in() {
		return "키보드로 입력한다.";
	}//상속되지 않는다.
	
	String out();
}