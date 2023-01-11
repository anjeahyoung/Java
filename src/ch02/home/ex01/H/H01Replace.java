package ch02.home.ex01.H;

public class H01Replace {
	public static void main(String[] args) { 
		/*
		 * a = 1, b = 2에서 데이터를 교체하라.
		 */
		int a = 1;
		int b = 2;
		System.out.printf("%d, %d\n", a, b);
		
		int temp = 0;
		temp = a;
		a = b;
		b = temp;
		System.out.printf("%d, %d\n", a, b);
	}
}