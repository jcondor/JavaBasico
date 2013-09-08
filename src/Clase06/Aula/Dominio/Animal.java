/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase06.Aula.Dominio;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author PFR
 */
public class Animal {
    private int codigo;
    private String nombre;
    private double peso;
    private Date fechaNacimiento;
    private String observaciones;
    private HashMap<Dieta, Integer> dietas;
    private Especie especie;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public HashMap<Dieta, Integer> getDietas() {
        return dietas;
    }

    public void setDietas(HashMap<Dieta, Integer> dietas) {
        this.dietas = dietas;
    }

    public Especie getEspecie() {
        return especie;
    }

    public void setEspecie(Especie especie) {
        this.especie = especie;
    }
}
