package xml_project;

import java.util.List;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class main {

	public static void main(String[] args)throws Exception  {
		// TODO Auto-generated method stub
		XStream xstream = new XStream(new DomDriver());
		List lst_estudiantes = new ArrayList();
		xstream.alias("Estudiante", Estudiante.class);
		Estudiante alumno_a = new Estudiante("4728","Armando Casas",20,10);
		Estudiante alumno_b = new Estudiante("4228","Maria Paredes",30,10);
		lst_estudiantes.add(alumno_a);
		lst_estudiantes.add(alumno_b);
		
		String xml = xstream.toXML(lst_estudiantes);
		//System.out.println(xml);
		
		Fichero file_xml = new Fichero("datos_xml.xml");
		//file_xml.escribir(xml);
		file_xml.leer_xml("datos_xml.xml");
	}

}
