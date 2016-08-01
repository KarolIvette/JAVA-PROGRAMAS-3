package Programacion_Multihilos;

public class MyThread implements Runnable{
	
	Thread thrd;
	public String count;
	MyThread(String name) {
	thrd = new Thread(this, name);
	thrd.start(); // start the thread
	}
	
	public void run() {
		System.out.println(thrd.getName() + " starting.");
		try {
		for(int count=0; count < 5; count++) {
		Thread.sleep(400);
		System.out.println("In " + thrd.getName() +
		", count is " + count);
		}
		}
		catch(InterruptedException exc) {
		System.out.println(thrd.getName() + " interrupted.");
		}
		System.out.println(thrd.getName() + " terminating.");
		}
}



