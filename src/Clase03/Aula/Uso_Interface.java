/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03.Aula;

/**
 *
 * @author PFR
 */
public class Uso_Interface {

    public static void main(String[] args) {
        
        Capitalizable[] obj1 = new Capitalizable[3];   

        obj1[0] = new Palabra("Programacion en Java");
        obj1[1] = new Palabra("Tecsup");
        obj1[2] = new Oracion("Curso Java Basico - Tecsup");        

        for (int i=0; i<obj1.length;i++){
	        System.out.println( "Texto " + i + ": " + obj1[i].cambiaMayuscula());
	}
    }

    
}
