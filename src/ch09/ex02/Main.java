package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName() + ": start");
		
		Thread counter = new Thread(new Counter());
		counter.start();
		
		int tries = 1;
		while(counter.isAlive()) {
			if(tries <= 2) {
				counter.join(1000);//join콜한 쓰래드를 대기시킨다.
				System.out.println(Thread.currentThread().getName() + ": wait" + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritate.");
				counter.interrupt();
				counter.join();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end");
	}
}
