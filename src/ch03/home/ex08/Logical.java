package ch03.home.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		b = ( 2 > 1) &&( 2 > 1);
		b = 2 < 1 && 2 > 1;
		b = 2 < 1 || 2 > 1;
		b = 2 < 1 || 2 < 1;
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;
		
		System.out.printf("1. x: %d, y: %d, b: %b\n", x, y, b);
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0;
		System.out.printf("2. x: %d, y: %d, b: %b\n", x, y, b);
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y > 0;
		System.out.printf("3. x: %d, y: %d, b: %b\n", x, y, b);
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		System.out.printf("4. x: %d, y: %d, b: %b\n", x, y, b);
		
		x = 0;
		y = 0;
		b = ++x < 0 | ++y < 0;
		System.out.printf("5. x: %d, y: %d, b: %b\n", x, y, b);
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0;
		System.out.printf("6. x: %d, y: %d, b: %b\n", x, y, b);
		
	}
}
