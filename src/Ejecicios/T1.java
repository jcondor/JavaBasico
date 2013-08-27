/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecicios;

/**
 *
 * @author USUARIO
 */
public class T1 {
    public static double toFarenheit(double celcius) {
        return 1.8*celcius + 32;
    }
    
    public static boolean implica(boolean a, boolean b) {
        return (((a==true)&&(b==false)) ? false : true);
    }
    
    public static void Ejercicio31() {
        int a = 0, b;
        while (a < 6) {
            b = a;
            System.out.println(a);
            a++;
        }
    }
    
    public static void Ejercicio32() {
        int a =57, b = 50;
        
        while (a != b) {
            if (a > b) {
                System.out.println("Demaciado Alto");
            }
            if (a < b) {
                System.out.println("Demaciado Bajo");
            }
            a = 50;
        }
    }
    
    public static int diasEnMes(int mes) {
        int[] meses = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        return meses[mes];
    }
    


}
