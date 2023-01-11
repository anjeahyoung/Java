package ch03.home.ex09;

import java.util.Scanner;

public class C01Tenary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		int x = 1;
		int y = -1;
		
		int absX = (x >= 0) ? x : -x;
		int absY = (y >= 0) ? y : -y;
		System.out.println(absX + ", " + absY);
		*/
		System.out.print("score: ");
		int score = sc.nextInt();
		System.out.print("danger: ");
		int danger = sc.nextInt();
		char grade = score >= 90 && danger < 3  ? 'A' : (score <= 40 || danger > 5 ? 'C' : 'B');
		System.out.print(grade);
		
		
		
	}
}