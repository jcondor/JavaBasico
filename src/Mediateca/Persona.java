package Mediateca;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Persona {
    private String nombre = "";
    private float valor = (float) 0.0;

    public String getNombre() {
        return nombre;
    }

    public float getValor() {
        return valor;
    }

    public Prestamo[] getPrestamos() {
        return prestamos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public void setPrestamos(Prestamo[] prestamos) {
        this.prestamos = prestamos;
    }
    
    
    
    
    private Prestamo[] prestamos;

    public Persona(String nombre, Prestamo[] prestamos) {
        this.nombre = nombre;
        this.prestamos = prestamos;
    
        for (int i = 0; i < prestamos.length; i++) {
            this.valor = this.valor + this.prestamos[i].getValor();
        }    
        
        System.out.println(this.valor);
    }
    
    
   
}
