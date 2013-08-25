/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaLaboratorio01;

/**
 *
 * @author PFR
 */
public class Animal {
    private String nombre;
    private int codigo;
    private String especie;
    private float peso;
    private String fecha;
    private String Observaciones;

    public String getNombre() {
        return nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEspecie() {
        return especie;
    }

    public float getPeso() {
        return peso;
    }

    public String getFecha() {
        return fecha;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
    }

    public Animal(String nombre, int codigo, String especie, float peso, String fecha, String Observaciones) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.especie = especie;
        this.peso = peso;
        this.fecha = fecha;
        this.Observaciones = Observaciones;
    }
    
    public void doImprime() {
        System.out.println("Animal:"+this.nombre+": "+this.codigo+": "+this.especie+": "+this.peso+": "+this.fecha+": "+this.Observaciones);
    }
    
}
