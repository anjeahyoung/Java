package ch04.home.ex01;

public class C03If {
	public static void main(String[] args) {
		int hour = 22;
		
		if(hour < 12) {
			System.out.println("Good Morning.");
		} else if(hour < 18) {
				System.out.println("Good Afternoon");
		} else if(hour < 21) {
			System.out.println("Goodevening");
		} else {
			System.out.println("Good night");
		}
		
		String bow = "";
		if(hour < 12) bow = "Good Moring.";
		else if(hour < 18) bow = "Good Afternoon";
		else if(hour < 21) bow = "Goodevening";
		else bow = "Good night";
		System.out.println(bow);
	}
}
