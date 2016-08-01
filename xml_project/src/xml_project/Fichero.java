package xml_project;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Fichero {
	
	private String nombre_fichero;
	
	public Fichero(String nombre){
		this.nombre_fichero = nombre;
	}

	public void escribir(String dato){
		Writer writer = null;
		try {
		    writer = new BufferedWriter(new OutputStreamWriter(
		          new FileOutputStream(this.nombre_fichero), "utf-8"));
		    writer.write(dato);
		} catch (IOException ex) {
		  System.out.println("Error al escribir el fichero");
		} finally {
		   try {writer.close();} catch (Exception ex) {/*ignore*/}
		}
	}
	
	public void leer_xml(String nombre_xml) throws Exception{
		
		 String contenido_xml = "";
			BufferedReader br = new BufferedReader(new FileReader(nombre_xml));
			try {
			    StringBuilder sb = new StringBuilder();
			    String line = br.readLine();

			    while (line != null) {
			        sb.append(line);
			        sb.append(System.lineSeparator());
			        line = br.readLine();
			    }
			
			    contenido_xml = sb.toString();
			}
			catch(Exception e){
				 System.out.println("Error al leer el fichero");
			 }finally {
			    br.close();
			}
			
			XStream xstream = new XStream(new DomDriver());
			xstream.alias("Estudiante", Estudiante.class);
			List lst_estudiante = new ArrayList();
			lst_estudiante = (List) xstream.fromXML(contenido_xml);
			Estudiante a = new Estudiante();
			Estudiante b = new Estudiante();
			a = (Estudiante) lst_estudiante.get(0);
			b = (Estudiante) lst_estudiante.get(1);
			System.out.println(a.getMatricula());
			System.out.println(b.getNombres());
	}
	
	
	
}
