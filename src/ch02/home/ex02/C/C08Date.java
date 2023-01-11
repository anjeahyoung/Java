package ch02.home.ex02.C;

import java.time.LocalDate;

public class C08Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		
		date = date.plusDays(1);
		date = date.minusDays(1);
		
		System.out.println(date);
		
	}
}
