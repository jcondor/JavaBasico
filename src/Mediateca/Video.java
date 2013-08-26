package Mediateca;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Video extends SoporteBase {
    String director = "";
    int duracion = 0;

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Video() {
        this.Precio = (float) 10.0;
    }
    
    
    
    
}
