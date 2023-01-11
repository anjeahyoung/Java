package ch07.ex04.case06;

public class Cat extends Object implements Animal{
	private String catname;
	
	public Cat(String catName) {
	this.catname = catName;
	}
	
	@Override
	public String toString() {
		return this.catname;
	}
}
