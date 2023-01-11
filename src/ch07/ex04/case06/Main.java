package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];
		
		animals[0] = new Cat("루비");
		animals[1] = new Dog("초코");
		animals[2] = new Dog("바다");
		
		for(Animal animal: animals)
			System.out.println(animal);
		
		Object[] objs = new Object[3];
		objs[0] = new Cat("쿨쿨이");
		objs[1] = new Dog("왈왈이");
		objs[2] = new Dog("ruru");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
