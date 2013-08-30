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
                if (matriz[i] < matriz[j]){
                    aux= matriz[i];
                    matriz[i]= matriz[j];
                    matriz[j]= aux;
                }	
            }
        }
        return quitarRepetidosMatrizOrdenada(matriz);
    }

     public static int[] OrdenaMenorMayor(int[] matriz){
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
         return quitarRepetidosMatrizOrdenada(matriz);
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
     
     public static int[] quitarRepetidosMatrizOrdenada(int[] matriz){
         int[] salida = new int[matriz.length];
         
         int longitud = 0;
         
         for (int i = 0; i < matriz.length; i++) {
             if (!estaIncluido(matriz[i], salida)) {
                 salida[longitud] = matriz[i];
                 longitud++;
             }
         }
         return nuevoArray(longitud,salida);
     }
     
     public static int[] union(int[] a, int[] b) {
         int[] c = new int[a.length+b.length];
         for (int i = 0; i < c.length; i++) {
             if (i<a.length) {
                 c[i] = a[i];
             } else {
                 c[i] = b[i-a.length];
             }
         }
         return OrdenaMenorMayor(c);
     }
     
     public static boolean estaIncluido(int numero, int[] matriz) {
         boolean salida = false;
         for (int i = 0; i < matriz.length; i++) {
             if (numero==matriz[i]) {
                 salida = true;
                 break;
             }
         }
         return salida;
     }
     
     public static int[] interseccion(int[] a, int[] b) {
         int[] aa = OrdenaMenorMayor(a);
         int[] bb = OrdenaMenorMayor(b);
         
         int[] c = new int[Math.max(aa.length,bb.length )];
         int longitud = 0;
         
         if (aa.length <= bb.length) {
                for (int i = 0; i < aa.length; i++) {
                    if (estaIncluido(aa[i],bb)) {
                        c[longitud] = aa[i];
                        longitud++;
                    }
                }

         } else {
             for (int i = 0; i < bb.length; i++) {
                    if (estaIncluido(bb[i],aa)) {
                        c[longitud] = bb[i];
                        longitud++;
                    }
                }
         }
         return nuevoArray(longitud,c);
     }
     
     public static int[] nuevoArray(int numero, int[] matriz) {
         int[] arreglo = new int[numero];
         for (int i = 0; i < arreglo.length; i++) {
             arreglo[i] = matriz[i];
         }
         return arreglo;
     }
     
     public static int[] menos(int[] a, int[] b) {
         int[] aa = OrdenaMenorMayor(a);
         int[] bb = OrdenaMenorMayor(b);
         
         int[] comun = interseccion(a,b);
         
         int[] c = new int[Math.max(aa.length,bb.length )];
         int longitud = 0;
         

         for (int i = 0; i < aa.length; i++) {
             if (!estaIncluido(aa[i],comun)) {
                 c[longitud] = aa[i];
                 longitud++;
             }
         }
         return nuevoArray(longitud,c);
     }

}
