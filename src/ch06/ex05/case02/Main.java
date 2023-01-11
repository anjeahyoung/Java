package ch06.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(1);
		
		dog.shout();
		System.out.println(dog.getAge()); //Animal의 age가 호출되서 super()를 거쳐 출력된다.
	}
}