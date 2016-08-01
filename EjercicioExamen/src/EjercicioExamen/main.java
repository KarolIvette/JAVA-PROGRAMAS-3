package EjercicioExamen;

public class main {
	public static void main(String[] args) {
		
		System.out.println("MAIN TRHEAD STARTING");
		for(int i=0; i < 20; i++) {
		System.out.print(".");
		try {
		Thread.sleep(100);
		}
		catch(InterruptedException exc) {
		System.out.println("MAIN TRHEAD INTERRUPTED");
		}
		}
		System.out.println("\nMAIN TRHEAD ENDING");
		
		Prioridad mt1 = new Prioridad("MULTI HILO 1");		
		Prioridad mt2 = new Prioridad("MULTI HILO 2");
		
		mt1.thrd.setPriority(Thread.NORM_PRIORITY);
		mt2.thrd.setPriority(Thread.NORM_PRIORITY);
		mt1.thrd.start();
		mt2.thrd.start();
		
		
		System.out.println(); 
		Hilo1_txt hilo1 = new Hilo1_txt(); 
		hilo1.start();
		
		System.out.println();
		Hilo2_xml hilo2 = new Hilo2_xml(); 
		hilo2.start();
		
		
		try{
			mt1.thrd.join();
		    mt2.thrd.join();
		}
		catch(InterruptedException exc){
			System.out.println("MAIN TRHEAD INTERRUPTED");
		}
		
		System.out.println("\n***************************************************");
		System.out.println("PRIORIDAD NORMAL CON: " + mt1.count +" MILISEGUNDOS");
		System.out.println("PRIORIDAD NORMAL CON: " + mt2.count +" MILISEGUNDOS");
		System.out.println("***************************************************");
		
	}
}
