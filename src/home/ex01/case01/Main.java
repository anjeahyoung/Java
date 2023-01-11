package home.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Time time = new Time();
		time.hour = 12;
		time.minute = 36;
		time.second = 30;
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		Time time2 = new Time();
		time2.hour = 10;
		time2.minute = 35;
		time2.second = 54;
		System.out.printf("%d:%d:%d", time2.hour, time2.minute, time2.second);
	}
}
