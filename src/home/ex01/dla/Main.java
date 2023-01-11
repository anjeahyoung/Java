package home.ex01.dla;

import java.util.Scanner;

import home.ex01.case04.User;

public class Main {
	public static void main(String[] args) {
		String userName = "";
		int age = 0;
				
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		boolean isGood = false;
		
		do {
			System.out.println("이름: "); 
			userName = sc.nextLine();
			isGood = tmp.matches("[a-zA-Zㄱ-ㅣ가-힣]+");
			if(isGood) System.out.println("[ERROR]이름을 입력하세요.");
		} while(!isGood);
		
		do {
			isGood= false;
			System.out.println("나이: "); tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+");
			if(isGood) age = Integer.parseInt(tmp);
			else System.out.println("ERROR] 나이를 입력하세요.");
		} while(!isGood);
		
		
		User user = new User();
		user.setUserName(userName);
		user.setAge(age);
		
	}
}
