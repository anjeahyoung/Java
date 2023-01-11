package ch02.ex02;

public class C02Char {
	public static void main(String[] args) {
		char c = 'A'; //A는 유니코드로 65이다. a는 97이다. 0은 48이다.
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = 65;
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = 0x0041;
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
		
		c = '\u0041';
		System.out.printf("%c %s\n", c, Integer.toBinaryString(c));
	}
}
