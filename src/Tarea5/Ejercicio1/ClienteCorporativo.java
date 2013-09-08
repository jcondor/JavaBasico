/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5.Ejercicio1;

/**
 *
 * @author USUARIO
 */
public class ClienteCorporativo extends Cliente {
    String almacen;
    String calificacion;

    public ClienteCorporativo(String nombre, String direccion, float limiteCredito, String almacen, String calificacion) {
        super(nombre, direccion, limiteCredito);
        this.almacen = almacen;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "ClienteCorporativo{" + "nombre=" + super.getNombre() + ", direccion=" + super.getDireccion() + ", almacen=" + almacen + ", calificacion=" + calificacion + ", limte de credito=" + super.getLimiteCredito() + '}';
    }
    
    
}
