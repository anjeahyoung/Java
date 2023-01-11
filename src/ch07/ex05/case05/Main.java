package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>(); 
		
		cats.add(new Cat("금동이"));
		cats.add(new Cat("은동이"));
		cats.add(new Cat("동동이"));
		
		System.out.println(cats);
		
		for(Cat cat: cats) cat.eat();
	}
}
