package ch08.ex04.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		try {
			int result = arr[10];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error.");
		}
		
		System.out.println("end.");
	}
}
//try 코드적 오류가 생겼을때 멈추지 않고 끝까지 실행하게끔 하는것이다.