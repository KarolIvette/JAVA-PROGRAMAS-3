package Practica_Examen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Mhilo_xml implements Runnable{
	private Thread xml; 
	
	public void run(){
		try{
			leer_xml("test.xml"); 
		}
		catch (Exception e){
			e.printStackTrace();
		}   
	}
	
	public void start(){
		if(xml == null){
			xml = new Thread (this);
		    xml.start();
		}
	}
	
	public void leer_xml(String nombre_xml) throws Exception{
		String informacion = "";
		BufferedReader br = new BufferedReader(new FileReader(nombre_xml));
		try{
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			
			while(line != null){
				sb.append(line);
				sb.append(System.lineSeparator());
			    line = br.readLine();
			}
			informacion = sb.toString();
		}
		catch(Exception e){
			System.out.println("ERROR EN LA LECTURA DEL XML");
		}
		finally{
			br.close();
		}
		
		XStream xstream = new XStream(new DomDriver());
		xstream.alias("Estudiante", Informacion.class);
		List lst_estudiante = new ArrayList();
		lst_estudiante = (List) xstream.fromXML(informacion);
		Informacion est = new Informacion();
		System.out.println("\n============================================ESMERALDAS============================================");
		for(int i=0;i<6;i++){
			est = (Informacion) lst_estudiante.get(i);
			if(est.getCiudad().equals("Esmeraldas"))
			System.out.println("Matricula: "+est.getMatricula()+" Nombre: "+est.getNombres()+" Direccion: "+est.getDireccion()+" Ciudad: "+est.getCiudad()+" Edad: "+est.getEdad());
		}
		System.out.println("=============================================ADULTOS==============================================");
		for(int i=0;i<6;i++){
			est = (Informacion) lst_estudiante.get(i);
			if(est.getEdad()>=18)
			System.out.println("Matricula: "+est.getMatricula()+" Nombre: "+est.getNombres()+" Direccion: "+est.getDireccion()+" Ciudad: "+est.getCiudad()+" Edad: "+est.getEdad());
		}
	}
	
}
