/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2.Rango;

/**
 *
 * @author USUARIO
 */
public class FueraDeRangoException extends Exception {

    public FueraDeRangoException(double valor, double desde, double hasta) {
        super("[ ERROR ] El Valor "+valor+ " NO se encuentra en el rango [ "+desde+" , "+hasta+" ]");
    }
}
