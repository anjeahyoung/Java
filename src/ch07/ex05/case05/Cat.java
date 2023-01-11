package ch07.ex05.case05;

public class Cat extends Floor {
	private String catName;
	
	public Cat(String catName) {
		this.catName = catName;
	}
	
	public void eat() {
		System.out.println(this.catName + "가 먹다.");
	}
	
	@Override
	public String toString() {
		return this.catName;
	}
}
