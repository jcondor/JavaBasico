/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase04.Aula.Hilos;

/**
 *
 * @author PFR
 */
public class HiloImplements implements Runnable {
    @Override
    public void run() {
       for (int i = 0; i < 50; i++) {
			System.out.println(i);
		}
    }
    
}
