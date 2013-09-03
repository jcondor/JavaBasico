/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5.Ejercicio2;

/**
 *
 * @author USUARIO
 */
public class Hilo2 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i < 501; i++) {
            if (esPrimo(i)) {
                System.out.println("Hilo 2: "+i);
            }
        }
    }
    
    public boolean esPrimo(int valor) {
        boolean v = true;
        int d = 2;
        while ((d<valor)&&(v==true)) {
            if (valor%d==0) {
                v=false;
            } else {
                d++;
            }
        }
        return v;
    }
}
