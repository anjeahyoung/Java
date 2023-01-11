package ch07.ex05.case08;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Dove dove = new Dove();
		Duck duck = new Duck();
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		List<Creeper> pen = new ArrayList<>();
		pen.add(lion);
		pen.add(leopard);
//		pen.add(Dove); 타입이달라서 안됨
		
		List<Bird> cage = new ArrayList<> ();
		cage.add(dove);
		cage.add(duck);
		
		for(Creeper creeper: pen) creeper.walk();
		
		for(Bird bird: cage) bird.fly();
	}
}