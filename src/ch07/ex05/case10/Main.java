package ch07.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<Autobot> corps = new ArrayList<>();
		
		corps.add(bumblebee);
		corps.add(prime);
		
		for(Autobot autobot: corps) {
			autobot.run();
			autobot.fight();
			//autobot.guard(); 타입이 Autobot이기 때문에 실행 안됨
			
			if(autobot instanceof Bumblebee bot) bot.guard();
			if(autobot instanceof Prime bot) bot.command();
		}
	}
}