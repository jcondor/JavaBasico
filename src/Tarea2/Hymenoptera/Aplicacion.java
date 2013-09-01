/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2.Hymenoptera;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
    public static void main(String[] args) {
        doCreaColmenaApisMellifera();
    }
    
    public static void doCreaColmenaApisMellifera() {
        ColmenaApisMellifera colmena = new ColmenaApisMellifera();
        for (int i = 0; i < 40; i++) {
            colmena.CreaObrera();
        }
        
        System.out.println(colmena.getClass().getName());
        System.out.println(colmena.getReina().getClass().getName());
        System.out.println(colmena.getZangano().getClass().getName());
        for (int i = 0; i < 40; i++) {
            colmena.getObreras().iterator();
        }
    }
}
