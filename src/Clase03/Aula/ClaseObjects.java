/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03.Aula;

import java.util.Date;

/**
 *
 * @author PFR
 */
public class ClaseObjects {
    
    public static void main(String[] args) {
        ClaseObjects.doEquals();
    }
    
    public static void doEquals () {
        Date fechaNacimiento = new Date();
        
        Date fechaCumpleanos = new Date();
        
        if (fechaNacimiento==fechaCumpleanos) {
            System.out.println("Iguales");
        }
        
        if (fechaNacimiento.equals(fechaCumpleanos)) {
            System.out.println("Equals = "+fechaNacimiento.toString());
        } 
    }
    
}
