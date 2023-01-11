package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		int hour = 22;
		
		if(hour < 12) {
			System.out.println("Good Morning.");
		} else if (hour < 18) {
			System.out.println("Good Afternoon.");
		} else if(hour < 21) {
			System.out.println("Good evening.");
		} else {
			System.out.println("Good night.");
		}
		
//			중복코드사용으로 나쁜코드
//		code 7 ~15 line 을 개선하라.
//		과제: ~println() 을 한번만 사용하라. 
		
		String bow = "";
		if(hour < 12) bow = "Good Moring.";
		else if(hour < 18) bow = "Good Afternoon.";
		else if(hour < 21) bow = "Good evening.";
		else bow = "Good night.";
		System.out.println(bow);
		}
	}