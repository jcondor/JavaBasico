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
        
        ClaseObjects C = new ClaseObjects();
        
        System.out.println(C.toString());
        
        C.rareCompare();
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
    
    @Override
    public String toString() {
        return "Sobreescrito";
    }
    
    public void rareCompare () {
        Integer numeroA = 12;
        Integer numeroB = 12; // asi esta hecho jajava 
        
        Integer numeroX = new Integer(12);
        Integer numeroY = new Integer(12);
        
        if (numeroA ==numeroB) {
            System.out.println("igual a = b");
        }
        
        if (numeroX ==numeroY) {
            System.out.println("igual x = y");
    
        }
        
        
    }
}
