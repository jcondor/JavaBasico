/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03.Aula;

/**
 *
 * @author PFR
 */
public class Matematicas {
    
    public static void main(String[] Args) {
        Matematicas.getConsttants();
        System.out.println(Matematicas.doOperaciones());
        Matematicas.wrappers();
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
