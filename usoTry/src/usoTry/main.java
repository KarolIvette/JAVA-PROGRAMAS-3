package usoTry;
import javax.swing.*;

public class main {

	public static void main(String[] args) {
		
		try{
		int dato = Integer.parseInt(JOptionPane.showInputDialog("INGRESE UN NUMERO"));
		JOptionPane.showMessageDialog(null, "APLICACION TERMINADA CORRECTAMENTE");
		
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "ERROR EN EL INGRESO");
		}
		

	}

}
