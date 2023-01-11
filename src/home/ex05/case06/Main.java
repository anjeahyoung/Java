package home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		Phone phone = new Phone();
		
		phone.setLogo("삼성");
		phone.setPrice(1_000_000);

		man.setManName("최한석");
		
		man.setPhone(phone);
		
		man.msg();
		man.call();
		man.game();
	}
}
/*
최한석은 삼성폰을 백만원 주고 샀습니다.
손에 든 폰을 보니 흐뭇합니다.

메세지를 보내봅니다.
답장이 없어 전화를 걸어보니, 연결이 안 됩니다.
잠시 뒤에 다시 연락해 보렵니다.
기다리는 동안 폰으로 게임을 합니다.

디자인 
사람과 핸드폰이 객체이다 
사람이 핸드폰을 통해 하는 행동이다.

사람의 이름은 최한석이다.
핸드폰로고가 삼성이다.
핸드폰값이 백만원이다.
사람이 한 행동은 메세지 보내기, 전화걸기, 게임하기 이다.
*/