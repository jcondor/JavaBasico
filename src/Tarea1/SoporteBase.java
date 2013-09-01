package Tarea1;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class SoporteBase {
    private String titulo = "";
    float Precio = (float) 0.0;

    public void setPrecio(float Precio) {
        this.Precio = Precio;
    }

    public float getPrecio() {
        return Precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
}
