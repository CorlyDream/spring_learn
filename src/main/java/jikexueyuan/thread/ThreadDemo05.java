package jikexueyuan.thread;

public class ThreadDemo05 {

	public static void main(String[] args) {
		ThreadDemo m = new ThreadDemo(new Object());
		Thread t1 = new Thread(m);
		Thread t2 = new Thread(m);
		Thread t3 = new Thread(m);
		t1.start();
		t2.start();
		t3.start();
	}

}