package ch04.home.ex04;

import java.util.Scanner;

public class H01OneNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double d = 0.0;
		String str = "";
		boolean isGood = false;
		
		do {
			System.out.print("> ");
			isGood = sc.nextLine().matches("[1-9]");
			if(!isGood) System.out.println("한자리 자연수를 입력하세요.");
		} while(!isGood);

		System.out.println("끝");
	}
}
/*
과제: 한자리 자연수를 입력받아라. 1 2 3 4 5 6 7 8 9 
*/