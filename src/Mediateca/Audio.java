package Mediateca;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Audio extends SoporteImpreso {
    private String lugar = "";
    private int Duracion = 0;

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }
    
    public String getLugar() {
        return lugar;
    }

    public int getDuracion() {
        return Duracion;
    }

    public Audio() {
        this.Precio = (float) 20.0;
    }
    
}
