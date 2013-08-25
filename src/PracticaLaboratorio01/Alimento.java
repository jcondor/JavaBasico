/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package PracticaLaboratorio01;

/**
 *
 * @author PFR
 */
public class Alimento {
    String nombre;
    String unidad;
    float costo;
    int valorNutricional;
    int numeroNutrientes;
    Nutriente[] nutrientes;  

    public Alimento(String nombre, String unidad, float costo, int valorNutricional, int numeroNutrientes, Nutriente[] nutrientes) {
        this.nombre = nombre;
        this.unidad = unidad;
        this.costo = costo;
        this.valorNutricional = valorNutricional;
        this.numeroNutrientes = numeroNutrientes;
        this.nutrientes = nutrientes;
    }
    
    public void doImprime () {
        System.out.println("Alimento: "+this.nombre+": "+this.unidad+": "+this.costo+": "+this.valorNutricional);
  //      for (int i = 0; i < this.numeroNutrientes; i++) {
  //          this.nutrientes[i].doImprime();
  //      }
    }
}
