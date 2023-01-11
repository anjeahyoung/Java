package ch03.home.ex04;

public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		double shortPi = (int)(pi * 10) / 10.0;
		System.out.println(shortPi);
		
		shortPi = (int)(pi * 10000) / 10000.0;
		shortPi = Math.floor(shortPi);
		System.out.println(shortPi);
	}
}
