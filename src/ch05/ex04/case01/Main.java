package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		
//		System.out.printf("%d, %d\n", Card.height, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
		//Card.kind;
		//Card.number;
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, card1.width, card1.height);
		System.out.printf("%s %d %d %d\n", card1.kind, card1.number, Card.width, Card.height); //static속성은 클래스명. 으로 기재
		System.out.printf("%s %d %d %d\n", card2.kind, card2.number, card2.width, card2.height);
	}
}

/*
	static 쓰지 않는 이유
	코드가 더러워진다.
	lock queue
*/
