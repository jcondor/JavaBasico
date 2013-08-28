/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecicios;

/**
 *
 * @author USUARIO
 */
public class T2 {
    public static int[] OrdenaMayorMenor(int[] matriz){
        int aux;
        for (int i =0; i<matriz.length-1; i++){
            for (int j= i+1; j<matriz.length; j++){
                if (matriz[i] > matriz[j]){
                    aux= matriz[i];
                    matriz[i]= matriz[j];
                    matriz[j]= aux;
                }	
            }
        }
        return matriz;
    }

     public static int[] OrdenaMenorMayor(int[] matriz){
        int aux;
        for (int i =0; i<matriz.length-1; i++){
            for (int j= i+1; j<matriz.length; j++){
                if (matriz[i] < matriz[j]){
                    aux= matriz[i];
                    matriz[i]= matriz[j];
                    matriz[j]= aux;
                }	
            }
        }
         return matriz;
    }
     
     public static int[] Union(int[] a, int[] b) {
         int[] ax = {1,2,3};
         
         return a;
     }

}
