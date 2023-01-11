package ch05.ex08.case02;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate regDate;
	
	public User()	{}

	public User(String userName, int age, LocalDate regDate ) {
		this.userName = userName;
		this.age = age;
		this.regDate = regDate;
	}
	
	final void setUserName(String userName) {
		this.userName = userName;
	}
	
	final void setAge(int age) {
		this.age = age;
	}
	
	final void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}
}