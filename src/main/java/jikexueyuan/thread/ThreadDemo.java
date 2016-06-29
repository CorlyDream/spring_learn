package jikexueyuan.thread;

public class ThreadDemo implements Runnable {
	private int ticket = 5;
	private Object state;
	
	public ThreadDemo(Object state) {
		this.state = state;
	}
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			synchronized (this) {
					if (ticket > 0) {
						try {
							Thread.sleep(500);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						System.out.println("车票："+ticket--);
					}
			}
		}
		synchronized (state) {
			state.notify();
		}
	}

}
