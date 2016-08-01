package EjercicioExamen;

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

public class Hilo1_txt implements Interfaz1, Runnable{
	private Thread txt;
	
	BufferedReader in;
	private String matricula = null; 
	private String nombre = null;
	private String direccion = null; 
	private String ciudad = null;
	private int edad = 0;
	
	@Override
	public void run(){
		try{
			lecturaTXT();
		}
		catch(IOException e){	
			e.printStackTrace();
		}   
	}
	
	@Override
	public void start(){
		if(txt == null){
			txt = new Thread (this);
			txt.start();
	    }
	}	
	
	@Override
	public void lecturaTXT() throws IOException{
		try{
			System.out.println("============================================GUAYAQUIL=============================================");
			in = new BufferedReader(new FileReader("file.txt"));
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
				if(("Guayaquil").equals(this.ciudad))
					inf();
			}
		}
		catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "ERROR","NO EXISTE EL TXT",JOptionPane.WARNING_MESSAGE);
		}
		
		try{
			System.out.println("=============================================ADULTOS==============================================");
			in = new BufferedReader(new FileReader("file.txt"));
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
				if(this.edad>40)
					inf();
			}
		}
		catch(FileNotFoundException e){
			JOptionPane.showMessageDialog(null, "ERROR","NO EXISTE EL TXT",JOptionPane.WARNING_MESSAGE);
		}
	}
	
	@Override
	public void inf(){
		System.out.println("Matricula: "+this.matricula+" Nombre: "+this.nombre+" Direccion: "+this.direccion+" Ciudad: "+this.ciudad+" Edad: "+this.edad);
	}
	
}
