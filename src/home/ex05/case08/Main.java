package home.ex05.case08;

public class Main {
	public static void main(String[] args) {
		Ball ball = new Ball();
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();

		player1.setPlayerName("최한석");
		player2.setPlayerName("한아름");
		player3.setPlayerName("양승일");
		
		player3.kick(player2.pass(player1.pass(ball)));
	}
}
/*
최한석, 한아름, 양승일이 축구를 한다.
한석이가 아름이한테 공을 패스한다.
아름이는 승일이한테 공을 패스한다.
승일이는 공을 찬다.

디자인
ball과 player를 만든다.
player에 패스와 슛 메서드를 만든다.

main
볼객체와 플레이어객체 3개를 준비한다.
플레이어 객체에 이름을 정해준다.
*/