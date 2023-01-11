package home.ex05.case04;

import java.time.LocalDate;

public class Man {
	private String manName;
	private int age;
	private LocalDate birthday;
	
	public void sing() {}
	public void eat() {}
	public void run() {}
	
	public final void setManName(String manName) {
		this.manName = manName;
	}
	
	public final void setAge(int age) {
		this.age = age;
	}
	
	public final void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
}