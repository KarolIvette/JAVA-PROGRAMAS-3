package EjercicioExamen;

public class Prioridad implements Runnable{
	
	int count;
	Thread thrd;
	static boolean stop = false;
	static String currentName;
	 
	Prioridad(String name){
		thrd = new Thread(this, name);
		count = 0;
		currentName = name;
	} 
	public void run(){
		do{
			count++;
			if(currentName.compareTo(thrd.getName()) != 0) {
				currentName = thrd.getName();
			}
		}while(stop == false && count < 10000);
		stop = true;
	}
	
}
