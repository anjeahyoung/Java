package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String op = "";
		int result = 0;
		
		String tmp = "";
		boolean isGood = false;
		String errMsg = "input 0 or natural number.";
		
		do {
			do {
				isGood = false;
				System.out.print("a: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) a = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			}while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: "); op = sc.nextLine();
				isGood = op.matches("[+-/\\*]"); //regular expression *의미있는 문자이기 때문에 백슬래쉬로따로 구분
				if(!isGood) System.out.println("input one of them(+, -, *, /).");
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) b = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			}while(!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
			System.out.println("continue(y/n)?");
		}while(sc.nextLine().equalsIgnoreCase("y"));
		
		System.out.println("end");
		/*
		do {
			do {
			System.out.println("a: 0이상의 정수를 입력하세요. ");
			str = sc.nextLine();
			abl = str.matches("[0-]");
			if(!abl) System.out.println("a: 0이상의 정수를 입력하세요.");
			else  {a = Integer.parseInt(str);}
			}while(!abl);
			sc.nextLine();
			
			do {
			System.out.println("op: +, -, *, / 중 하나를 입력하세요.");
			str = sc.nextLine();
			opbl = str.matches("[+,-,*,/]");
			if(!opbl) System.out.println("op: +, -, *, / 중 하나를 입력하세요.");
			
			}while(!opbl);
			
			do {
				System.out.println("a: 0이상의 정수를 입력하세요. ");
				str = sc.nextLine();
				abl = str.matches("[0-]");
				if(!abl) System.out.println("a: 0이상의 정수를 입력하세요.");
				b = Integer.parseInt(str);
			}while(!bbl);
			
			int result = switch() {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			case "/" -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\ncontinue(y/n)?", a, str, b, result);
			
			sc.nextLine();
			str = sc.nextLine();
			bl = str.equalsIgnoreCase("y");
		} while(bl);
	
		System.out.println("end.");
		*/
		}
	}
/*
과제: 계산기를 만들어라.
연산자는 + , - , * , / 이다.
/는 몫만을 구한다.
 * 
 * continue(y/n)? 에서 y또는 y를 입력하면 계산 작업을 재수행한다.
 * y 또는 y외를 입력하면 앱을 종료한다.
--
int i = Integer.parseInt(sumStr);
a: 1 
op: + 
b: 2
1 + 2 = 3
continue(y/n)? y
a: 2
op *
b: 2
2 * 2= 4
continue(y/n)? n
end.

**입력값은 0포함 자연수
*/ 