/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2.Rango;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
    public static void main(String[] args) throws FueraDeRangoException {
        double valor = -12.34;
        double desde = 0.34;
        double hasta = 245.56;
        
        try {
            if (Util.estaEnRango(valor,desde,hasta)) {
                System.out.println("El Valor "+valor+ " si se encuentra en el rango [ "+desde+" , "+hasta+" ]");
            }
        } catch (FueraDeRangoException e) {
            System.out.println(e.getMessage());
        }
    }
}
