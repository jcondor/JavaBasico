/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5.Ejercicio1;

/**
 *
 * @author USUARIO
 */
public class Cliente {
    private String nombre;
    private String direccion;
    private float limiteCredito;

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public float getLimiteCredito() {
        return limiteCredito;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLimiteCredito(float limiteCredito) {
        this.limiteCredito = limiteCredito;
    }

    public Cliente(String nombre, String direccion, float limiteCredito) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.limiteCredito = limiteCredito;
    }
}
