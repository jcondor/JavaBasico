/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase06.Aula.Dominio;

import java.util.HashMap;

/**
 *
 * @author PFR
 */
public class Alimento {
    String unidadMedida;
    String nombre;
    TipoAlimento tipoAlimento;
    Double costo;
    Double valorNutricional;
    HashMap<Nutriente, Integer> nutrientes;
}
