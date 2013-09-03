/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5.Ejercicio2;

/**
 *
 * @author USUARIO
 */
public class Hilo1 extends Thread {

    @Override
    public void run() {
        for (int i = 100; i > 0; i--) {
            if (!esPar(i)) {
                System.out.println("Hilo 1: "+i);
            }
        }
    }
    
    public boolean esPar(int valor) {
        return (((valor%2)==0)?true:false);
    }
}
