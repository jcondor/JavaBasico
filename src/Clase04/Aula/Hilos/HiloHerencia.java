/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase04.Aula.Hilos;

/**
 *
 * @author PFR
 */
public class HiloHerencia extends Thread{
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public static int getMIN_PRIORITY() {
        return MIN_PRIORITY;
    }

    public static int getNORM_PRIORITY() {
        return NORM_PRIORITY;
    }

    public static int getMAX_PRIORITY() {
        return MAX_PRIORITY;
    }
    
    
    
    @Override
    public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i);
		}
	}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
