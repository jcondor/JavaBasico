/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase05.Aula.Serializacion;

import java.io.Serializable;

/**
 *
 * @author PFR
 */
public class Persona implements Serializable {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombre + "; Edad: " + edad;
    }
    
}
