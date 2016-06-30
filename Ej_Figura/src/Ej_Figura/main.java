package Ej_Figura;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		int numero=0;
		Figura fig =  new Figura();
		
		do{
			numero= (Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN DIGITO DEL 1 AL 27:")));
		}while(numero<1 || numero >27);
		
		fig.figura(numero);
		
	}

}
