/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase02.Aula.Objetos;

/**
 *
 * @author PFR
 */
public class Zoologico {
    
    public static void main(String[] args) {
       Zoologico.doHerencia(); 
       Tigre Tiger = new Tigre();
       Tiger.setNumeropatas(4);
       System.out.println(Tiger.getNumeropatas());
    }
    
    public static void doHerencia() {
        System.out.println("Zoologico");
    }
}
