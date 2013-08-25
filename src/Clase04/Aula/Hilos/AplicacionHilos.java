/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase04.Aula.Hilos;

/**
 *
 * @author PFR
 */
public class AplicacionHilos {
    public static void main(String[] args) {
        doHerencia();
    }
    
    public static void doHerencia() {
        HiloHerencia hilo = new HiloHerencia();
        hilo.start();
    }
}
