/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaLaboratorio01;

/**
 *
 * @author PFR
 */
public class Nutriente {
    private String nombre;
    private int cantidad;

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Nutriente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }
    
    public void doImprime () {
        System.out.println("Nutriente: "+this.nombre+": "+this.cantidad);
    }
    
    
    
}
