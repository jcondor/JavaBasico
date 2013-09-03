/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5.Ejercicio3;

/**
 *
 * @author USUARIO
 */
public class Hilo extends Thread {
    int inicio, fin, retardo, razon;

    public Hilo(int inicio, int fin, int retardo, int razon) {
        this.inicio = inicio;
        this.fin = fin;
        this.retardo = retardo;
        this.razon = razon;
    }

    @Override
    public void run() {
        for (int i = inicio; i < fin+1; i+=razon) {
            try {
                Thread.sleep(retardo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Hilo : "+i);
        }
    }
    
}
