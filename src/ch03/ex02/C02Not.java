package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false; //전원이 꺼져있다. flag variable 선택지가 두가지인것이다.
		power = !power;
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
		
	}
}
