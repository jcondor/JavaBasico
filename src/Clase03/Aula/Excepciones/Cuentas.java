/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03.Aula.Excepciones;

/**
 *
 * @author PFR
 */
public class Cuentas {
    private double saldoActual;
    
    public void Cuenta() {
        this.saldoActual = 5000;
    }
    
    public void retirarDeCajero(double cuantoDesea) throws SaldoInsuficienteException {
    if (saldoActual < cuantoDesea) {
            throw new SaldoInsuficienteException(saldoActual, cuantoDesea);
            
        }
            System.out.println("Monto Restante: "+ (saldoActual - cuantoDesea)); 
    }
}
