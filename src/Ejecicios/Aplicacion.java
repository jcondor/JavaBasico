/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecicios;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
    public static void main(String[] args) {
        
//Ejercicio T1.1
        System.out.println(T1.toFarenheit(75));
        
//Ejercicio T1.2       
        System.out.println(T1.implica(false, false));
        System.out.println(T1.implica(false, true));
        System.out.println(T1.implica(true, false));
        System.out.println(T1.implica(true, true));
        
//Ejercicio T1.3
        T1.Ejercicio31();
        T1.Ejercicio32();
        
//Ejercicio T1.5
        System.out.println(T1.diasEnMes(1));
        
//Ejercicio T2.1        
      
        int[] num1 = T2.OrdenaMayorMenor(new int[] {3,5,9,1,2,4,5,6});
        for (int i = 0; i < num1.length; i++) {
            System.out.println(num1[i]);
        }
        
        int[] num2 = T2.OrdenaMenorMayor(new int[] {3,5,9,1,2,4,5,6});
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
 
    }
}
