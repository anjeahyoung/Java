package ch02.home.ex02.C;

import java.time.LocalDate;
import java.time.LocalTime;

public class C07Date {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2025, 1, 1);
		LocalTime time = LocalTime.of(18, 7, 13);
		
		System.out.println(date);
		System.out.println(date.toString());
		System.out.println(time);
	}
}
