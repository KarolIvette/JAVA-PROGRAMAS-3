package App_Alumnos;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
int opcion=99;
		
		Informacion[] items = new Informacion[10];
		items[0] = new Informacion("0001", "KAROL CEDE�O  ", "FEMENINO ", 23, 17.5);
		items[1] = new Informacion("0002", "DIANA TAMAYO  ", "FEMENINO ", 27.8, 14);
		items[2] = new Informacion("0003", "KAREN ACHILIE ", "FEMENINO ", 19, 7.5);
		items[3] = new Informacion("0004", "TAMARA CHAVEZ ", "FEMENINO ", 23, 15.5);
		items[4] = new Informacion("0005", "XIMENA TORRES ", "FEMENINO ", 12, 6);
		items[5] = new Informacion("0006", "JAMIL ANGULO  ", "MASCULINO", 19, 6);
		items[6] = new Informacion("0007", "DYLAN CERVERA ", "MASCULINO", 17.5, 9);
		items[7] = new Informacion("0008", "ZAID MOREIRA  ", "MASCULINO", 22, 12.3);
		items[8] = new Informacion("0009", "ANDRES MEDINA ", "MASCULINO", 21.6, 7.9);
		items[9] = new Informacion("0010", "FERNANDO SOLER", "MASCULINO", 22, 8);
		
		while(!(opcion==11)){
			opcion = Integer.parseInt(JOptionPane.showInputDialog("1: LISTA ESTUDIANTES\n2: BUSCAR ESTUDIANTES POR MATRICULA O NOMBRES\n3: MODIFICAR NOTA PARCIAL DE UN ALUMNO\n4: MODIFICAR NOTA EXAMEN DE UN ALUMNO\n5: LISTA ASCENDENTE\n6: LISTA DESCENDENTE\n7: PROMEDIO GENERAL\n8: ALUMNOS QUE APRUEBAN\n9: MEJOR ALUMNO\n10: PEOR ALUMNO\n11: SALIR\n\nINGRESE SU OPCION:"));
		
		switch(opcion){
		case 1:
			    for(int i=0; i<items.length; i++){
			    	items[i].show_inf();
			    }
			    break;
		case 2: 
			    System.out.println("**********************************************************************************************************");
			    boolean bandera = false;
			    String dato = JOptionPane.showInputDialog("INGRESE MATRICULA O NOMBRES:");
			    for(int i=0; i<items.length; i++){
			    	if(dato.equals(items[i].getNumero_matricula())){
			    		items[i].show_inf();
			    	    bandera = true;
			    	}
			    	if(dato.equals(items[i].getNombre())){
			    		items[i].show_inf();
			    	    bandera = true;
			    	}
		        }
			    if(!bandera)
			    	JOptionPane.showMessageDialog(null, "NO EXISTE EL ALUMNO");
			    break;
		case 3: 
			
			    break;
		case 4:
			
			    break;
		case 5: 
		   
		    break;
		case 6: 
			
		    break;
		case 7: 
			System.out.println("**********************************************************************************************************");
		    double promedio = 0;
		    int n=0;
		    for(int i=0; i<items.length; i++){
		    	promedio = items[i].getNota_tparciales() + items[i].getNota_examen();
		    	n++;
	        }
		    System.out.print("PROMEDIO GENERAL DEL CURSO: "+promedio/n);
		    break;
		case 8: 
			System.out.println("**********************************************************************************************************");
		    System.out.println("ESTUDIANTES QUE APRUEBAN: ");
		    for(int i=0; i<items.length; i++){
		    	promedio = items[i].getNota_tparciales() + items[i].getNota_examen();
		    	if(promedio >= 30){
		    		items[i].show_inf();
		    	}
	        }
		    break;
		case 9:   
		    break;
		case 10: 
		    
		    break;
		case 11: 
		    JOptionPane.showMessageDialog(null, "SE VA A CERRAR");
		    break;
		}
		
	    }

	}

}
