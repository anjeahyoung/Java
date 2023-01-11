package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		int user = 0;
		int com = 0;
		String userChoice = "";
		String comChoice = "";
		String Result = "";
		
		System.out.print("1.가위, 2.바위, 3.보 \n>");
		user = sc.nextInt();
		
		switch (user) {
		case 1 ->  userChoice = "가위";
		case 2 ->  userChoice = "바위";
		case 3 ->  userChoice = "보";
		default -> userChoice = "잘못 입력하였습니다.";
		}
		
		com = (int)(Math.random() * 3) + 1; 
		switch(com) {
		case 1 -> comChoice = "가위";
		case 2 -> comChoice = "바위";
		case 3 -> comChoice = "보";
		}
		
		switch(user - com) {
		case -1, 2 -> Result = "you lose.";
		case 0  -> Result = "Fair";		
		case 1, -2  -> Result = "you win.";
		default -> Result = "Error";
		}
		
		System.out.printf("you: %s\nMe: %s\n\n",userChoice, comChoice);
		System.out.print(Result);
		*/
		
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.가위, 2.바위, 보\n>");
		playerChoice = sc.nextInt();
		appChoice =(int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			result = switch(playerChoice - appChoice) {
			case -2, 1 -> "You win.";
			case -1, 2 -> "You lose.";
			default -> "Fair";
			};
			
			choice = switch(playerChoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			default -> "보";
			};
			System.out.println("You: " + choice);
			
			choice = switch(appChoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			default -> "보";
			};
			System.out.println("app: " + choice);
		}else result = "ERROR] 1, 2, 3 중에서 입력하세요.";
		
		System.out.println("\n" + result);
	}
}

/*

과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라. 결과는 
you win.
you lose.
Fair.
중 하나이다.
--
 1.가위, 2.바위, 3.보
> 1
you: 가위
Me: 보

you win.
1< 2 < 3

*/