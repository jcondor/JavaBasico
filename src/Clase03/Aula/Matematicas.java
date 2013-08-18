/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03.Aula;

import java.text.ParseException;
import librerias.Utiles;

/**
 *
 * @author PFR
 */
public class Matematicas {
    
    public static void main(String[] Args) throws ParseException {
        Matematicas.getConsttants();
        System.out.println(Matematicas.doOperaciones());
        Matematicas.wrappers();
        
        
        System.out.println(Utiles.stringToDate("Holña"));
        
    }
    
    public static void getConsttants() {
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
    public static double doOperaciones() {
        return Math.sqrt(144);
    }
    
    public static void wrappers() {
        Integer entero = new Integer(122223);
        
        System.out.println(entero.shortValue());
    }
    
        
}
