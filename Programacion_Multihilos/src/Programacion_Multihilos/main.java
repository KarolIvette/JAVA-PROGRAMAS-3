package Programacion_Multihilos;

public class main {

	public static void main(String[] args) {
		System.out.println("Main thread starting.");
		for(int i=0; i < 20; i++) {
		System.out.print(".");
		try {
		Thread.sleep(100);
		}
		catch(InterruptedException exc) {
		System.out.println("Main thread interrupted.");
		}
		}
		System.out.println("\nMain thread ending.");
		
		Priority mt11 = new Priority("High Priority");
		Priority mt22 = new Priority("Low Priority");
		// set the priorities
		mt11.thrd.setPriority(Thread.NORM_PRIORITY);
		mt22.thrd.setPriority(Thread.MAX_PRIORITY);
		// start the threads
		mt11.thrd.start();
		mt22.thrd.start();
		try {
		mt11.thrd.join();
		mt22.thrd.join();
		}
		catch(InterruptedException exc) {
		System.out.println("Main thread interrupted.");
		}
		System.out.println("\nHigh priority thread counted to " +
		mt11.count);
		System.out.println("Low priority thread counted to " +
		mt22.count);

	}

}
