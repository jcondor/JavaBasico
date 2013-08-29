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
  //      numeroRepetidos(matriz); 
        
    //    int[] matriz = num;
        
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
     
     public static void imprimeMatrizEntera(int[] matriz){
         for (int i = 0; i < matriz.length; i++) {
             System.out.println(i+": "+matriz[i]);
         }
     }
     
     public static int numeroRepetidos(int[] matriz){
         int repeticiones = 0;
         for (int i = 0; i < matriz.length-1; i++) {
             for (int j = i+1; j < matriz.length; j++) {
                if (matriz[i] == matriz[j]) {
                    repeticiones++;
                }
             }
         }
         return repeticiones;
     }
     
     public static int[] quitarRepetidos(int[] matriz){
         int[] salida = new int[matriz.length-numeroRepetidos(matriz)];
         
         for (int i = 0; i < matriz.length-1; i++) {
             for (int j = i+1; j < matriz.length; j++) {
                if (matriz[i] != matriz[j]) {
                    salida[i] = matriz[i];
                }
             }
         }
         return salida;
     }
     
     public static int[] Union(int[] a, int[] b) {
         int[] c = new int[a.length+b.length];
         
         return a;
     }

}
