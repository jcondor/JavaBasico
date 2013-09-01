/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase04.Aula.Hilos.Ejercicio;

/**
 *
 * @author PFR
 */
public class Hilo extends Thread {
    int opcion;
    
    @Override
    public void run() {
       try {
          while (true) {
              switch (opcion) {
                    case 1: System.out.println("Memoria Total:"+Runtime.getRuntime().totalMemory());
                            break;
                    case 2: System.out.println("Memoria Libre:"+Runtime.getRuntime().freeMemory());    
                            break;
                    case 3: System.out.println("Procesadores disponibles:"+Runtime.getRuntime().availableProcessors());
                            break;
                    case 4: System.out.println("Memoria Maxima:"+Runtime.getRuntime().maxMemory());
                            break;
                    default: System.out.println("No es opcion");    
                             break;
                }
                    sleep(5000);

          }
       } catch (InterruptedException e) {
           System.out.println("Error");
       }
    }

    public Hilo(int opcion) {
        this.opcion = opcion;
        
        
    }
    
    
    
}
