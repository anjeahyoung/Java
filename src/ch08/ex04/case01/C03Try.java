package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out = null;
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/DEV/a.txt"));
			for(int i: arr) out.println("arr[" + i + "]:" + arr[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("array error.");
		} catch(IOException e) {
			System.out.println("IO error.");
		} finally {
			if(out != null) out.close();//마무리하는 습관 종료되지 않으면 메모리를 잡아먹는다.
		}
		
		System.out.println("end.");
	}
}
//try catch 블록은 베타적이기 때문에 한가지만 실행된다.
//finally는 위 메서드의 성공 유무와 관계없이 실행된다.