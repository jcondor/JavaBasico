/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5.Ejercicio3;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
    public static void main(String[] args) {
        Hilo hilo = new Hilo(1, 100, 1000, 7);
        hilo.start();
    }
}
