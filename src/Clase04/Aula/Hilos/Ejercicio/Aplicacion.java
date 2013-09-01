/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase04.Aula.Hilos.Ejercicio;

/**
 *
 * @author PFR
 */
public class Aplicacion {
    public static void main(String[] args) {
        Hilo hilo = new Hilo(4);
        
        hilo.start();
    }
    
}
