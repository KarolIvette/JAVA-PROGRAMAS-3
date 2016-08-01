package Practica_Examen;

public class main {
	public static void main(String[] args){
		Prioridad mt1 = new Prioridad("MULTI HILO 1");		
		Prioridad mt2 = new Prioridad("MULTI HILO 2");
		
		mt1.thrd.setPriority(Thread.MAX_PRIORITY);
		mt2.thrd.setPriority(Thread.NORM_PRIORITY);
		mt1.thrd.start();
		mt2.thrd.start();
		
		System.out.println("PRIORIDAD ALTA CON: " + mt1.count);
		System.out.println("PRIORIDAD BAJA CON: " + mt2.count);
		System.out.println();
		
		try{
			mt1.thrd.join();
		    mt2.thrd.join();
		}
		catch(InterruptedException exc){
			System.out.println("MAIN TRHEAD INTERRUPTED");
		}
		
		
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
		
		System.out.println(); 
		Mhilo_txt hilo = new Mhilo_txt(); 
		hilo.start();
		
		System.out.println();
		Mhilo_xml hilo2 = new Mhilo_xml(); 
		hilo2.start();
		
		
	}

}
