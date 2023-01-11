package home.ex06.case02;

import java.util.Scanner;

import ch06.home.ex03.case03.User;

public class Console {
	private static Scanner sc;

	static {
		sc = new Scanner(System.in);
	}

	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}

	public static String inStr(String msg) {
		/*
		boolean isGood = false;
		do {
			isGood = false;
			Console.inMsg(msg);
			String tmp = sc.nextLine();
			isGood = tmp.matches("[a-zA-Zㄱ-ㅣ가-힣]+");
			if(isGood) {return tmp;
			} else Console.Err("문자가 아닙니다.");
		} while(!isGood);
		return null;
		*/
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣]+");
			if(!isGood)Console.Err("문자가 아닙니다.");
		}while(!isGood);

		return input;
	}

	public static int inNum(String msg) {
		/*
		boolean isGood = false;
		do {
			isGood = false;
			Console.inMsg(msg);
			String tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+") && !tmp.matches("[0]");
			if(isGood) {return Integer.parseInt(tmp);
			}else Console.Err("자연수가 아닙니다.");
		}while(!isGood);
		return 0;
		*/
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*");
			if(!isGood) Console.Err("자연수가 아닙니다.");
		}while(!isGood);
		
		return Integer.parseInt(input);
	}

	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void info(User user) {
		System.out.print(user);
	}

	public static void Err(String msg) {
		System.out.println("ERROR]" + msg);
	}
}