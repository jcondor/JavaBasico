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
        doHerenciaImplements();
    }
    
    public static void doHerencia() {
        HiloHerencia hilo = new HiloHerencia();
        hilo.start();
    }
    
    public static void doHerenciaImplements(){
        HiloImplements hilo = new HiloImplements();
        
        Thread th = new Thread(hilo);
                
        th.start();
    }
}