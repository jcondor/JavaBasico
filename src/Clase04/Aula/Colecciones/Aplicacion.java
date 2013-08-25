/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase04.Aula.Colecciones;

import Clase02.Aula.Objetos.Animal;
import Clase02.Aula.Objetos.Gallina;
import Clase02.Aula.Objetos.Tigre;
import Clase02.Aula.Objetos.Vaca;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 *
 * @author PFR
 */
public class Aplicacion {
    public static void main(String[] args) {
        ejemploanimales();
    }
    
    public static void ejemplo1 (){
        Estudiante e1 = new Estudiante ("Jose","Condor","", 123);
        Estudiante e2 = new Estudiante ("Alberto","Benavente","", 123);
        Estudiante e3 = new Estudiante ("Carlos","Zoeger","", 123);
        
    List<Estudiante> listaEstudiantes = new ArrayList <>();
    
    listaEstudiantes.add(e1);
    listaEstudiantes.add(e2);
    listaEstudiantes.add(e3);
    
    Collections.sort(listaEstudiantes);
    
        for (Estudiante e : listaEstudiantes) {
            System.out.println(e.getApellidos()+" ");
        }
    }
    
    public static void ejemplo2() {
        Estudiante e1 = new Estudiante("Alberto", "Zapata", "Bolognesi 123", 100525);
    	Estudiante e2 = new Estudiante("Benjamin", "Ayasta", "Libertad 987", 100526);
    	Estudiante e3 = new Estudiante("Carlos", "Lopez", "Union 456", 100527);
        
        // LinkedList
        HashSet<Estudiante> setE = new HashSet<>();
        setE.add(e1);
        setE.add(e2);
        setE.add(e3);
        //setE.add(e1);
        
        for (Estudiante es : setE) {
		System.out.println(es.getNombres() + " " + es.getApellidos());
	}


    }
    
    public static void ejemploanimales() {
        
        
        
        
        Set<Animal> animales = new HashSet<>();
               
        animales.add(new Tigre());
        animales.add(new Tigre());
        animales.add(new Tigre());
        animales.add(new Tigre());
        animales.add(new Tigre());
        animales.add(new Animal());
        animales.add(new Vaca());
        animales.add(new Gallina());
        
        for (Animal ani : animales) {
            ani.HacerRuido();
        }
    }
          
}
