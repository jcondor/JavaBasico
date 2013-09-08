/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5.Ejercicio1;

/**
 *
 * @author USUARIO
 */
public class ClientePersona extends Cliente {
    private int tarjetaCredito;

    public void setTarjetaCredito(int tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }
        
    public int getTarjetaCredito() {
        return tarjetaCredito;
    }

    public ClientePersona(String nombre, String direccion, int tarjetaCredito) {
        super(nombre, direccion, 0.00f);
        this.tarjetaCredito = tarjetaCredito;
    }
}
