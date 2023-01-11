package ch03.ex10;

public class C01Assign {
	public static void main(String[] args) {
		int i = 3;
		
		i = i + 2;
		System.out.println(i);
		i += 2;
		System.out.println(i);
		i -= 2;
		System.out.println(i);
		i *= 2;
		System.out.println(i);
		i /= 2;
		System.out.println(i);
		i %= 2;
		System.out.println(i);
	}
}
//(i+=2) i = i + 2 같은 표현