package ch02.home.ex01.C;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0;
		//int i = 0; 같은 이름 금지 
		int j = 0;
		{
			//int i = 0;
			int x = 0;
			int y = 0;
		}
		int x = 0;
	}
}
