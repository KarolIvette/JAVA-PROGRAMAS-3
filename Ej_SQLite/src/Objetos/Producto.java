/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Objetos;

/**
 *
 * @author Karol Cedeño Cedeño
 */
public class Producto {
    private String id;
    private String nombre;
    private String stock;
    private String fecha;
    
    
    public Producto(String id, String nombre, String stock, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getstock() {
        return stock;
    }

    public void setstock(String stock) {
        this.stock = stock;
    }   
    
    public String getfecha() {
        return fecha;
    }

    public void setfecha_de_compra(String fecha) {
        this.fecha = fecha;
    }
    
}
