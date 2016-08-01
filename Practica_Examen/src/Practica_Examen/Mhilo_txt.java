package Practica_Examen;

import java.io.BufferedReader;  
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import  java.lang.Runnable;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Mhilo_txt implements Runnable{
	
	private Thread txt; 
	BufferedReader in;
	private String esme = "Esmeraldas";
	private int edad = 0; 
	private String nombre = null;
	private String matricula = null; 
	private String direccion = null; 
	private String ciudad = null;
	
	public void run(){
		try{
			lecturaFicheroEsmeraldas();
		}
		catch(IOException e){	
			e.printStackTrace();
		}   
	}
	
	public void start(){
		if(txt == null){
			txt = new Thread (this);
			txt.start();
	    }
	}	
	
	public void lecturaFicheroEsmeraldas() throws IOException{
		try{
			System.out.println("============================================ESMERALDAS============================================");
			in = new BufferedReader(new FileReader("test.txt"));
			String line;
			while((line=in.readLine())!= null){
				int pos=0;
				for(int i=0; i<line.length();i++){
					if(line.substring(i,i+1).equals("|")){
						pos++; 
						if(pos==1){
							this.matricula=line.substring(0,i);  		 
						}
						if(pos==2){
							this.nombre=line.substring(this.matricula.length()+1,i); 
						}
						if(pos==3){
							this.direccion=line.substring(this.matricula.length()+this.nombre.length()+2,i); 
						}
						if(pos==4){
							this.ciudad=line.substring(this.matricula.length()+this.nombre.length()+this.direccion.length()+3,i); 
							this.edad=Integer.parseInt(line.substring(this.matricula.length()+this.nombre.length()+this.direccion.length()+this.ciudad.length()+4));
						}
					}			  
				}
				if(this.esme.equals(this.ciudad))
					inf();
			}
		}
		catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "ERROR","NO EXISTE EL TXT",JOptionPane.WARNING_MESSAGE);
		}
		
		try{
			System.out.println("=============================================ADULTOS==============================================");
			in = new BufferedReader(new FileReader("test.txt"));
			String line; 
			while((line=in.readLine())!= null){
				int pos=0;
				for(int i=0; i<line.length();i++){
					if(line.substring(i,i+1).equals("|")){
						pos++; 
						if(pos==1){
							this.matricula=line.substring(0,i);  		 
						}
						if(pos==2){
							this.nombre=line.substring(this.matricula.length()+1,i); 
						}
						if(pos==3){
							this.direccion=line.substring(this.matricula.length()+this.nombre.length()+2,i); 
						}
						if(pos==4){
							this.ciudad=line.substring(this.matricula.length()+this.nombre.length()+this.direccion.length()+3,i); 
							this.edad=Integer.parseInt(line.substring(this.matricula.length()+this.nombre.length()+this.direccion.length()+this.ciudad.length()+4));
						}
					}			  
				}
				if(this.edad>=18)
					inf();
			}
		}
		catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "ERROR","NO EXISTE EL TXT",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	public void inf(){
		System.out.println("Matricula: "+this.matricula+" Nombre: "+this.nombre+" Direccion: "+this.direccion+" Ciudad: "+this.ciudad+" Edad: "+this.edad);
	}
	
}
