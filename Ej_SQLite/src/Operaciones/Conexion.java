/*
 * To change this template, choose Tools | Templates 
 * and open the template in the editor.
 */
package Operaciones;


import java.sql.Connection;  
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
*
* @author Karol Cede�o Cede�o
*/


public class Conexion{
	Connection conexion;
	Statement consulta;

    /**
     * Constructor for objects of class Conexion
     */
    
    public void conectar(){
		try {
	            Class.forName("org.sqlite.JDBC");
	        }
	        catch (ClassNotFoundException e) {
	            JOptionPane.showMessageDialog(null, e.getMessage());
	        }	 
			try {           
                            conexion = DriverManager.getConnection("jdbc:sqlite:base.db");
                            consulta = conexion.createStatement();
                        	consulta.executeUpdate("create table Persona (id integer, nombre string, stock integer, fecha integer)");

			} catch (SQLException e) {}
			
		  }
	}
    
