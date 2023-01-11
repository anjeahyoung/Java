package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args)	{
		double d = 1.52;
		int i = (int)d;
		System.out.println(i);
		
		double f = Math.floor(d);// floor 내림
		double r = Math.round(d);// round 반올림
		System.out.printf("%.2f, %.2f\n", f, r);
		
		int f2 = (int)f;
		int r2 = (int)r;
		System.out.printf("%d, %d\n", f2, r2);
	}
}