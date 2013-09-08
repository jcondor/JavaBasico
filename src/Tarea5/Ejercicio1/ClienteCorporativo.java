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
    char calificacion;

    public ClienteCorporativo(String nombre, String direccion, float limiteCredito, String almacen, char calificacion) {
        super(nombre, direccion, limiteCredito);
        this.almacen = almacen;
        this.calificacion = calificacion;
    }
}
