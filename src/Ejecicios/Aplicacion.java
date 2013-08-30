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
        System.out.println("TAREA 1");
        System.out.println("------------------------------------");      
//Ejercicio T1.1
        System.out.println("Ejercicio 1");
        System.out.println("===========================");
        System.out.println("75°C = "+T1.toFarenheit(75)+"°F");
        System.out.println();
//Ejercicio T1.2       
        System.out.println("Ejercicio 2");
        System.out.println("===========================");
        System.out.println("( Falso implica Falso         = "+T1.implica(false, false));
        System.out.println("( Falso implica Verdadero     = "+T1.implica(false, true));
        System.out.println("( Verdadero implica Falso     = "+T1.implica(true, false));
        System.out.println("( Verdadero implica Verdadero = "+T1.implica(true, true));
        System.out.println();
//Ejercicio T1.3
        System.out.println("Ejercicio 3");
        System.out.println("===========================");
        T1.Ejercicio31();
        T1.Ejercicio32();
        System.out.println();
        
//Ejercicio T1.5
        System.out.println("Ejercicio 5");
        System.out.println("===========================");
        System.out.println("Número de Dias en Marzo = "+T1.diasEnMes(2));
        System.out.println();
        
//Ejercicio T2.1        
        
        System.out.println("TAREA 2");
        System.out.println("------------------------------------");
        System.out.println();    
        System.out.println("Ejercicio 1");
        System.out.println("===========================");
        System.out.println("num = {3,5,9,1,2,4,5,6}");        
        System.out.println();
        System.out.println("Arreglo n ordenado de mayor a menor");
        T2.imprimeMatrizEntera(T2.ordenaMayorMenor(new int[] {3,5,9,1,2,4,5,6}));
        System.out.println("Arreglo n ordenado de menor a mayor");
        T2.imprimeMatrizEntera(T2.ordenaMenorMayor(new int[] {3,5,9,1,2,4,5,6}));
        System.out.println();
        System.out.println("Ejercicio 2");
        System.out.println("===========================");
        System.out.println("a = {3,5,9,1,2,4,5,6}");
        System.out.println("b = {8,2,1,8,2,9,4,5}");
        System.out.println();
        System.out.println("a union b = ");
        T2.imprimeMatrizEntera(T2.union(new int[] {3,5,9,1,2,4,5,6}, new int[] {8,2,1,8,2,9,4,5}));
        System.out.println();
        System.out.println("a interseccion b =");
        T2.imprimeMatrizEntera(T2.interseccion(new int[] {3,5,9,1,2,4,5,6}, new int[] {8,2,1,8,2,9,4,5}));
        System.out.println();
        System.out.println("a menos b =");
        T2.imprimeMatrizEntera(T2.menos(new int[] {3,5,9,1,2,4,5,6}, new int[] {8,2,1,8,2,9,4,5}));
        
     }
}
