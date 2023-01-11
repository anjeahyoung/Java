package ch02.ex01;

public class C05Scope {
	public static void main(String[] args) {
		int i = 0;
		//int i = 0; 하나의 공간 안에서 중복금지
		int j = 0;
		{
			//int i = 0;
			int x = 0;
			int y = 0;
		}
		int x = 0;
	}
}


//javaw.exe C05Scope loading 실행