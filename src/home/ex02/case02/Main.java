package home.ex02.case02;

import java.util.Scanner;

import ch05.ex06.case02.Console;

public class Main {
	public static void main(String[] args) {
		/*
		Paper paper = new Paper();
		String msg = "";
		String writerName = "";
		
		Scanner sc = new Scanner(System.in);
		boolean isGood = false;
		
		do {
			System.out.println("메세지: ");
			msg = sc.nextLine();
			isGood = msg.matches("[a-zA-Zㄱ-ㅣ가-힣]+");
			if(isGood) paper.setMsg(msg);
			else System.out.println("ERROR] 다시 입력하세요.");
		} while(!isGood);
		
		do {
			isGood = false;
			System.out.println("작성자명: ");
			writerName = sc.nextLine();
			isGood = writerName.matches("[a-zA-Zㄱ-ㅣ가-힣]+");
			if(isGood) paper.setWriterName(writerName);
			else System.out.print("ERROR]다시 입력하세요\n");
		} while(!isGood);
		
		System.out.printf("%s from %s", paper.getMsg(), paper.getWriterName());
		*/
		Console.inStr("메세지: ");
		Console.inStr("작성자명: ");
		
		Console.info("끝");
	}
}
/*
과제: 종이에 메세지와 작성자명을 기록하라.
------

메세지: hello
작성자명: terry

hello from terry.
*/