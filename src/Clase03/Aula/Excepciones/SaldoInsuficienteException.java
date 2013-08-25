/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03.Aula.Excepciones;

/**
 *
 * @author PFR
 */
public class SaldoInsuficienteException extends Exception {
    public double saldo, cuantoDeseo;

    public SaldoInsuficienteException(double saldo, double cuantoDeseo) {
       super("Este es un error de cuenta");
    }

}
