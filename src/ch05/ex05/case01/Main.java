package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(8, 46);
		
		result = calculator.add(1, 4, 6);
		System.out.print(result);
	}
}
// overloading 1개의 클라스 내에서 같은 이름 다른 파라미터를 말한다.