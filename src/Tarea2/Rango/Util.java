/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2.Rango;

/**
 *
 * @author USUARIO
 */
public class Util {
    public static boolean estaEnRango(double valor, double desde, double hasta) throws FueraDeRangoException {
        boolean salida = false;
        if ((valor>=desde)&&(valor<=hasta)) {
            salida = true;
        } else {
            throw new FueraDeRangoException(valor,desde,hasta);
        }
        return salida;
    }
}
