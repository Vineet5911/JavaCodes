package Multithreading;
class RunnableThread1 implements Runnable{
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("Hi I am thread 1");
		}
	}
}
class RunnableThread2 implements Runnable{
	public void run() {
		for(int i = 0; i < 1000; i++){
			System.out.println("thread 2 is running");
		}
	}
}
public class multithreadingCode {
	public static void main(String[] args) {
		RunnableThread1 bullet1 = new RunnableThread1();
		Thread gun1 = new Thread(bullet1);
        RunnableThread2 bullet2 = new RunnableThread2();
        Thread gun2 = new Thread(bullet2);
        gun1.start();
        gun2.start();
	}
}