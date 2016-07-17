package ObjetoE_2Semanal;
import javax.swing.JOptionPane;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.io.FileReader;
import java.io.BufferedReader;

public class Estudiante implements Informacion{
	
	Estudiante usuario[] = new Estudiante[5];
	int contUser = 0;
	
	private String matricula, nombres, materia;
	private double nota_parciales, nota_examen;
	
	public Estudiante(){
		
	}
	
	public Estudiante(String matricula, String nombres, String materia, double nota_parciales, double nota_examen){
		this.matricula = matricula;
    	this.nombres = nombres;
    	this.materia = materia;
    	this.nota_parciales = nota_parciales;
    	this.nota_examen = nota_examen;
	}

	@Override
	public String getMatricula() {
		return matricula;
	}

	@Override
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	@Override
	public String getNombres() {
		return nombres;
	}

	@Override
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Override
	public String getMateria() {
		return materia;
	}

	@Override
	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public double getNota_parciales() {
		return nota_parciales;
	}

	@Override
	public void setNota_parciales(double nota_parciales) {
		this.nota_parciales = nota_parciales;
	}

	@Override
	public double getNota_examen() {
		return nota_examen;
	}

	@Override
	public void setNota_examen(double nota_examen) {
		this.nota_examen = nota_examen;
	}
	
	public void ingresar(){
		
		System.out.println("\n");
        setMatricula(JOptionPane.showInputDialog(null, "INGRESE LA MATRICULA: "));
        setNombres(JOptionPane.showInputDialog(null, "INGRESE LOS NOMBRES: "));
        setMateria(JOptionPane.showInputDialog(null, "INGRESE LA MATERIA: "));
        setNota_parciales(Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA NOTA DE PARCIALES: ")));
        setNota_examen(Double.parseDouble(JOptionPane.showInputDialog(null, "INGRESE LA NOTA DEL EXAMEN: ")));
        
        Estudiante temp = new Estudiante(getMatricula(), getNombres(), getMateria(), getNota_parciales(), getNota_examen());
 
        temp.setMatricula(getMatricula());
        temp.setNombres(getNombres());  
        temp.setMateria(getMateria());
        temp.setNota_parciales(getNota_parciales());
        temp.setNota_examen(getNota_examen());
        
		usuario[contUser] = temp;
        contUser++;
	}
	
	public void listar(){
		try
		{
			String texto="";
			FileReader lector=new FileReader("D:\\PROGRAMAS_ECLIPSE\\JAVA-PROGRAMAS-3.git\\ObjetoE_2Semanal\\src\\ObjetoE_2Semanal\\estudiantes.txt");
			BufferedReader contenido = new BufferedReader(lector);
			
			while((texto=contenido.readLine())!=null){
				System.out.println(texto);
				}
		}

		catch(Exception e)
		{
			System.out.println("Error al leer");
		}
	}
	
	public void listar_x_matricula(){
		try
		{
			String texto="";
			String alumno="";
			FileReader lector = new FileReader("D:\\PROGRAMAS_ECLIPSE\\JAVA-PROGRAMAS-3.git\\ObjetoE_2Semanal\\src\\ObjetoE_2Semanal\\estudiantes.txt");
			BufferedReader contenido = new BufferedReader(lector);
			
			System.out.println("**********************************************************************************************************");
		    boolean bandera = false;
		    String matricula = JOptionPane.showInputDialog("INGRESE MATRICULA:");
			
			while((texto = contenido.readLine()) != null){
			    for(int i=0; i<texto.length(); i++){
			    	if(matricula.equals(texto.substring(0,4))){
			    		alumno=texto;
			    		bandera = true;
			    	}
			    }
			    System.out.println(alumno);
			    
			    if(!bandera)
			    	JOptionPane.showMessageDialog(null, "NO EXISTE EL ALUMNO");
				}
			contenido.close();
		}

		catch(Exception e)
		{
			System.out.println("Error al leer");
		}
	}
	
	public void editar_informacion(){
		
	}
	
	public void aprueban(){
		try
		{
			String texto="";
			String alumno="";
			FileReader lector = new FileReader("D:\\PROGRAMAS_ECLIPSE\\JAVA-PROGRAMAS-3.git\\ObjetoE_2Semanal\\src\\ObjetoE_2Semanal\\estudiantes.txt");
			BufferedReader contenido = new BufferedReader(lector);
			
			System.out.println("**********************************************************************************************************");
			double promedio = 0;
			
			while((texto = contenido.readLine()) != null){
			    for(int i=0; i<texto.length(); i++){
			    	double np = Double.parseDouble(texto.substring(25,29));
			    	double ne = Double.parseDouble(texto.substring(30,34));
			    	promedio = np+ne;
			    	if(promedio >= 30){
			    		alumno=texto;
			    	}
			    }
			    System.out.println(alumno);
			}
			contenido.close();
		}

		catch(Exception e)
		{
			System.out.println("Error al leer");
		}
	}
	
	public void guardar(){
		try
		{
			File archivo=new File("D:\\PROGRAMAS_ECLIPSE\\JAVA-PROGRAMAS-3.git\\ObjetoE_2Semanal\\src\\ObjetoE_2Semanal\\estudiantes.txt");
			FileWriter escribir = new FileWriter(archivo,true);	
			
			escribir.write(getMatricula()+"|"+getNombres()+"|"+getMateria()+"|"+getNota_parciales()+"|"+getNota_examen()+"|\r\n");
			escribir.close();
		}
		catch(Exception e)
		{
			System.out.println("Error al escribir");
		}
	}
	
	public void xml(){
		try
		{
			String texto = "";
			FileReader lector = new FileReader("D:\\PROGRAMAS_ECLIPSE\\JAVA-PROGRAMAS-3.git\\ObjetoE_2Semanal\\src\\ObjetoE_2Semanal\\estudiantes.txt");
			BufferedReader contenido = new BufferedReader(lector);
			
			File archivo = new File("D:\\PROGRAMAS_ECLIPSE\\JAVA-PROGRAMAS-3.git\\ObjetoE_2Semanal\\src\\ObjetoE_2Semanal\\estudiantes.xml");
			FileWriter escribir = new FileWriter(archivo,true);	
			
			while((texto = contenido.readLine()) != null){
				escribir.write(texto+"\r\n");
			}
			escribir.close();
		}
		catch(Exception e)
		{
			System.out.println("Error al escribir");
		}
	}
	
}
