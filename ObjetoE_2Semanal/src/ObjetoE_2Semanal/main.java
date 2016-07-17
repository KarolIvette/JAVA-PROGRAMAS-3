package ObjetoE_2Semanal;
import java.io.IOException;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) throws IOException {
		int opcion=99;
		
		Estudiante items = new Estudiante();
		
		while(!(opcion==8)){
			opcion = Integer.parseInt(JOptionPane.showInputDialog("1: INGRESAR ESTUDIANTE"
					+ "\n2: LISTAR ESTUDIANTES"
					+ "\n3: BUSCAR ESTUDIANTE POR MATRICULA"
					+ "\n4: EDITAR INFORMACION DE ESTUDIANTE"
					+ "\n5: MOSTRAR ESTUDIATES QUE APRUEBAN"
					+ "\n6: GUARDAR INFORMACION"
					+ "\n7: EXPORTAR INFORMACION A XML"
					+ "\n8: SALIR\n\nINGRESE SU OPCION:"));
		
		switch(opcion){
		case 1:
			    items.ingresar();
			    break;
		case 2: 
			    items.listar();
			    break;
		case 3: 
			    items.listar_x_matricula();
			    break;
		case 4:
		case 5:
			    items.aprueban();
			    break;
		case 6:
			    items.guardar();
			    break;
		case 7:
			    items.xml();
			    break;
		case 8: 
			    JOptionPane.showMessageDialog(null, "SE VA A CERRAR");
			    break;
		}
		
	    }
	}
}
