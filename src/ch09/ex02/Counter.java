package ch09.ex02;

public class Counter implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start.");//vm에서 작동하는것을 알려준다.
		
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() +": " + c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000);
			} catch(InterruptedException e ) {
				System.out.println(Thread.currentThread().getName() + ": interrupted.");
			}
		}
		
		System.out.println(Thread.currentThread().getName() + ": end");
	}
}
