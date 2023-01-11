package ch03.home.ex09;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int korean = 0;
		int English = 0;
		int math = 0;
		int sum = 0;
		double average = 0;
		char grade = 0;
		
		System.out.print("국어: ");
		korean = sc.nextInt();
		System.out.print("영어: ");
		English = sc.nextInt();
		System.out.print("수학: ");
		math = sc.nextInt();
		
		sum = korean + English + math;
//		average = (int)((double)sum / 3 * 10) / 10.0;
		average = sum / 3.0 ;
		grade = average >= 90 && average <= 100 ? 'A' : (average >= 80 && average <= 90 ? 'B' : 'C');
		/*
		System.out.println();
		System.out.println("총점: " + sum);
		System.out.println("평균: " + average);
		System.out.println("학점: " + grade);
		*/
		System.out.printf("\n총점: %d\n평균: %.1f\n학점: %c", sum, average, grade);
	}
}
/*
국어, 영어, 수학 점수를 입력한다.
총점, 평균, 학점을 출력한다.
평균점수는 소수점 이하 한자리까지만 출력한다.

90 <= mean <= 100 : A
80 <= mean <= 90 : B
mean <= 80 : C

--
국어 95
영어 100
수학 100

총점 295
평균 98.3
학점 A
*/