/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5.Ejercicio1;

/**
 *
 * @author USUARIO
 */
public class Personal {
    private float sueldo;
    private String nombre;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public float getSueldo() {
        return sueldo;            
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public Personal(float sueldo, String nombre) {
        this.sueldo = sueldo;
        this.nombre = nombre;
    }
    
    
}
