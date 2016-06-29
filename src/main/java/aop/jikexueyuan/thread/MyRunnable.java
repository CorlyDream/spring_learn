package aop.jikexueyuan.thread;

public class MyRunnable implements Runnable {
	private String name;
	private Object state;
	
	public MyRunnable(String name,Object state) {
		this.state = state;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println(name+" before wait() !");
		synchronized (state) {
			try {
				state.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Thread.currentThread().resume();
		System.out.println(name + " after wait() !");
		
	}

	public static void main(String[] args) {
		Object state = new Object();
		MyRunnable mr = new MyRunnable("A",state);
		Thread t1 = new Thread(mr);
		ThreadDemo td = new ThreadDemo(state);
		Thread t2 = new Thread(td);
		t1.start();
		t2.start();
	}

}
