package home.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Pencil pencil = new Pencil();
		Eraser eraser = new Eraser();
		Bag<Stationery> bag = new Bag<>();
		
		bag.add(eraser);
		bag.add(pencil);
		
		for(Stationery s: bag) {
			if(s instanceof Pencil pen) pen.write();
			if(s instanceof Eraser rubber) rubber.erase();
		}
	}
}
/*
가방에 연필과 지우개를 담는다.
가방에서 물건을 꺼낸다.
꺼낸 물건이 연필이면 write, 지우개면 지운다.

디자인 
연필과 지우개를 문구류라는 추상명사를 만든다.
연필 지우개의 용도를 각각 적는다.

이야기 
연필 객체와 지우개 객체를 만든다.
문구류를 담는 가방 객체를 만든다.
add로 지우개와 연필을 가방에 담는다.
for문과 if문으로 문구류를 다 확인하면서 가정을 표현한다.
*/