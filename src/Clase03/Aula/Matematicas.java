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
    }
    
    public static void getConsttants() {
        System.out.println(Math.PI);
        System.out.println(Math.E);
    }
    public static double doOperaciones() {
        return Math.sqrt(144);
    }
}
