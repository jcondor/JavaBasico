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
        
//Ejercicio 1
        System.out.println(T1.toFarenheit(75));
        
//Ejercicio 2       
        System.out.println(T1.implica(false, false));
        System.out.println(T1.implica(false, true));
        System.out.println(T1.implica(true, false));
        System.out.println(T1.implica(true, true));
        
//Ejercicio 3
        T1.Ejercicio31();
        T1.Ejercicio32();
        
//Ejercicio 5
        System.out.println(T1.diasEnMes(4));
        
    }
}
