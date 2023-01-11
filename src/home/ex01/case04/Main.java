package home.ex01.case04;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		User user = new User();

		Scanner sc = new Scanner(System.in);
		String tmp = "";
		boolean isGood = false;
		
		do {
			isGood= false;
			System.out.println("이름: "); tmp = sc.nextLine();
			isGood = tmp.matches("[a-zA-z가-힣]+");
			if(isGood) user.setUserName(tmp);
		} while(!isGood);
		
		do {
			isGood= false;
			System.out.println("나이: "); tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+");
			if(isGood) user.setAge(Integer.parseInt(tmp));
		} while(!isGood);
		
		System.out.printf("이름: %s\n나이: %d\n", user.getUserName(), user.getAge());
		System.out.println("가입일:"+ user.getJoinDate());
	}
} 
/*
과제: 사용자를 생성하라.
user가 user의 이름, 나이를 입력한다.
app이 user의 가입일을 입력한다.
----

이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-12-27
*/