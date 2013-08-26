package Mediateca;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Prestamo {
    
    private float Valor = (float) 0.0;

    public float getValor() {
        return Valor;
    }

    public void setValor(float Valor) {
        this.Valor = Valor;
    }

    public Prestamo(SoporteBase soporte, int plazo) {
         if (soporte instanceof Libro) {
             this.Valor = plazo * ((Libro) soporte).getPrecio();
         } else if (soporte instanceof Video) {
             this.Valor = plazo * ((Video) soporte).getPrecio();
         } else if (soporte instanceof Audio) {
             this.Valor = ((Audio) soporte).getPrecio();
         }
    }
    
}
