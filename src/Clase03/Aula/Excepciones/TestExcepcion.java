/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03.Aula.Excepciones;

/**
 *
 * @author PFR
 */
public class TestExcepcion {
    public static void main(String[] args) {
        doEjemplo4();
    }
    
    public static void doEjemplo1() {
        int i = 0, u = 0, k;
        k = i / u;

    }

    public static void doEjemploExcepcion() {
        try {
        int i = 0, u = 0, k;
        k = i / u;
        } catch (ArithmeticException e) {
                System.out.println("Divicion por Zero");
        }
    
    }
     
    public static void doEjemplo3 () {    
        int[] n= {11,22,33,44,55,66,77,88,99};
        
        try {
        for (int i=0; i<11;i++) {
            System.out.println( "Valor " + n[i]);
        }
        //ArrayIndexOutOfBoundsException 
        //(indice de arreglo fuera de rango)
        //NullPointerException 
        //(valor nulo)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error Fuera de lista");
        } catch (NullPointerException e) {
            System.out.println("Error nulo");
        }
    }

    public static void doEjemplo4() {
        
    }

}
