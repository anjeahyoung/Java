package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();
		new Player(counter).start();
		new Player(counter).start();//run 메서드를 실행하는 메서드 start
	}
}