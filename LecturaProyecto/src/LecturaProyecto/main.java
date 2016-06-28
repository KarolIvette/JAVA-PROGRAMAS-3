package LecturaProyecto;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) throws IOException {
		
		try{
			
		String ruta = LecturaProyecto.main.class.getResource("fichero2.txt").toString();
		
		ruta = ruta.substring(6, ruta.length());
		System.out.println(ruta);
		BufferedReader br = new BufferedReader(new FileReader("D:\\PROGRAMAS_ECLIPSE\\JAVA-PROGRAMAS-3.git\\LecturaProyecto\\src\\LecturaProyecto\\fichero2.txt"));
		String LineaFichero;
		while((LineaFichero = br.readLine()) != null){
			System.out.println(LineaFichero);
		}
		
		}catch(FileNotFoundException e){
			//JOptionPane.showMessageDialog(null, "FICHERO NO ENCONTRADO");
			e.printStackTrace();
		}

	}

}
