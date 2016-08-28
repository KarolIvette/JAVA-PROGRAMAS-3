/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Objetos.Producto;  

import Operaciones.Operaciones;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.JTextComponent;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Karol Cede�o Cede�o
 */
public class GUI extends javax.swing.JFrame {
    Operaciones operaciones;
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        operaciones = new Operaciones();
        operaciones.conectar();
        setResizable(false);
        setVisible(true);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTFId = new javax.swing.JTextField();
        jTFnombre = new javax.swing.JTextField();
        jTFstock = new javax.swing.JTextField();
        jTFfecha = new javax.swing.JTextField();
        jBGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTPersonas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        
        
        JButton btnActualizar = new JButton("Actualizar");
        JButton btnNewButton_1 = new JButton("Consultar");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Stock:");
        
        jLabel4.setText("Fecha de Compra:");

        jBGuardar.setText("Guardar");
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
                btnActualizar.setEnabled(false);
        		jButton2.setEnabled(false);
        		btnNewButton_1.setEnabled(false);
            }
        });
        
        JButton btnNewButton = new JButton("Salir");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		int op = JOptionPane.showConfirmDialog(null, "�Desea salir del programa?", "Atencion",JOptionPane.YES_NO_OPTION);
            	if(op == JOptionPane.YES_NO_OPTION){
            		System.exit(0);	
            	}
        		
        	}
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(jLabel1)
        						.addComponent(jLabel2)
        						.addComponent(jLabel3)
        						.addComponent(jLabel4))
        					.addGap(30)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(jTFstock, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        						.addComponent(jTFfecha, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        						.addComponent(jTFId, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
        						.addComponent(jTFnombre, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(120)
        					.addComponent(jBGuardar, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE)
        					.addGap(60)
        					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel1)
        				.addComponent(jTFId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(40)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel2)
        				.addComponent(jTFnombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(42)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel3)
        				.addComponent(jTFstock, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(44)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jLabel4)
        				.addComponent(jTFfecha, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(62)
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jBGuardar)
        				.addComponent(btnNewButton))
        			.addContainerGap(795, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);

        jTabbedPane1.addTab("Formulario", jPanel1);

        jTPersonas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTPersonas);
        
        
        
        jButton1.setText("Llenar tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
                jButton2.setEnabled(true);
                btnActualizar.setEnabled(true);
                btnNewButton_1.setEnabled(true);
                
            }
        });

        jButton2.setText("Eliminar registro");
        jButton2.setEnabled(false);
        
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        
        
        btnNewButton_1.setEnabled(false);
        btnNewButton_1.addActionListener(new ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		jbtnNewButton_1ActionPerformed(evt);
        	}
        });
        
        
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		jbtnActualizar_1ActionPerformed(evt);
        		btnActualizar.setEnabled(false);
        		jButton2.setEnabled(false);
        		btnNewButton_1.setEnabled(false);
        	        	       
        	}
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
        					.addPreferredGap(ComponentPlacement.UNRELATED)
        					.addComponent(btnActualizar, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
        				.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 511, Short.MAX_VALUE))
        			.addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
        			.addGap(11)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(jButton1)
        				.addComponent(jButton2)
        				.addComponent(btnActualizar)
        				.addComponent(btnNewButton_1))
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);

        jTabbedPane1.addTab("Lista de productos", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void limpiar(){
        jTFId.setText("");
        jTFnombre.setText("");
        jTFstock.setText("");
        jTFfecha.setText("");
    }
    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        try{
            int id = Integer.parseInt(jTFId.getText());
            Producto persona = new Producto(""+id,jTFnombre.getText()
            		,jTFstock.getText(),jTFfecha.getText());
            
            operaciones.guardarUsuario(persona);
            JOptionPane.showMessageDialog(null, "GUARDADO CON EXITO","AVISO",JOptionPane.INFORMATION_MESSAGE);
            limpiar();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error:"+ex.getMessage()+"\nVerifique");
        }
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed 
    	operaciones.totalPersonas((DefaultTableModel)jTPersonas.getModel());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    	int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a eliminar: "));
    	if(operaciones.validar(id)==true){
        int op = JOptionPane.showConfirmDialog(null, "�Desea eliminar el registro de la base de datos?", "Atencion",JOptionPane.YES_NO_OPTION);
        if(op == JOptionPane.YES_NO_OPTION){
        operaciones.insertar("delete from Persona where id="+id);
        operaciones.totalPersonas((DefaultTableModel)jTPersonas.getModel());
        JOptionPane.showMessageDialog(null, "Registro eliminado con exito","AVISO",JOptionPane.INFORMATION_MESSAGE);
    	}
    	}
    	else
    		JOptionPane.showMessageDialog(null, "Registro no encontrado","ERROR",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jbtnNewButton_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    	int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a consulta: "));
    	if(operaciones.validar(id)==true)
    	operaciones.consultar1(Integer.toString(id));
    	else
    		JOptionPane.showMessageDialog(null, "Registro no encontrado","ERROR",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed
   
    
    private void jbtnActualizar_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    	int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id a Actualizar: "));
    	int op;
    	if(operaciones.validar(id)==true){
    		
    		op = Integer.parseInt(JOptionPane.showInputDialog("OP1: ID \n"+"OP2: NOMBRE \n"+"OP3: STOCK \n"+"OP4: FECHA DE COMPRA \n"));
    		switch (op){
    		case 1:
    			int id_1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nuevo id"));
    			operaciones.insertar("UPDATE Persona SET id = "+id_1+" WHERE ID ="+ id);
    			JOptionPane.showMessageDialog(null, "Informacion actualizada con exito","AVISO",JOptionPane.INFORMATION_MESSAGE);
    	    break;
    		case 2:
    			String name =JOptionPane.showInputDialog("Ingrese su nuevo nombre");
    			operaciones.insertar("UPDATE Persona SET nombre = "+"'"+name+"'"+" WHERE ID ="+ id);
    			JOptionPane.showMessageDialog(null, "Informacion actualizada con exito","AVISO",JOptionPane.INFORMATION_MESSAGE);
    		break;
    		case 3:
    			int stock_1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nueva edad"));
    			operaciones.insertar("UPDATE Persona SET stock = "+stock_1+" WHERE ID ="+ id);
    			JOptionPane.showMessageDialog(null, "Informacion actualizada con exito","AVISO",JOptionPane.INFORMATION_MESSAGE);
    	    break;
    		case 4:
    			int fecha_1 =Integer.parseInt(JOptionPane.showInputDialog("Ingrese su nueva edad"));
    			operaciones.insertar("UPDATE Persona SET fecha = "+fecha_1+" WHERE ID ="+ id);
    			JOptionPane.showMessageDialog(null, "Informacion actualizada con exito","AVISO",JOptionPane.INFORMATION_MESSAGE);
    	    break;
    		}	
    	}
    	
    	else
    		JOptionPane.showMessageDialog(null, "Registro no encontrado","ERROR",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton2ActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new GUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFId;
    private javax.swing.JTextField jTFnombre;
    private javax.swing.JTextField jTFstock;
    private javax.swing.JTextField jTFfecha;
    private javax.swing.JTable jTPersonas;
    private javax.swing.JTabbedPane jTabbedPane1;
}
