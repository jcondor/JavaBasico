/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase5.Aula.Serializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author PFR
 */
public class Ejemplo implements Serializable {
    public static void main(String[] args) {
        DeserializarPersona();
    }
    
    public static void SerializarPersona () {
        //FileOutputStream archivo = null;
        ObjectOutputStream salida = null;
        
        Persona p1 = new Persona("Alonso", 23);
        
        try {
            FileOutputStream archivo = new FileOutputStream("F:\\Persona.ser");
            salida  = new ObjectOutputStream(archivo);
            salida.writeObject(p1);
            salida.flush();
        } catch (IOException e){
            System.out.println("Imposible crear el archivo o escribir en él");
        } finally {
            try {
                salida.close();
            } catch (IOException e){
                System.out.println("No pudo cerrarse el canal");
            }
        }        
    }
    
    public static void DeserializarPersona () {
        File archivo = new File("F:\\Persona.ser ");
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Persona p1 = (Persona)ois.readObject();
            ois.close();
            fis.close();
            
            System.out.println("Persona recuperada: " + p1.toString());
        } catch (IOException e){
            System.err.println(e.toString());
        } catch (ClassNotFoundException e){
            System.err.println(e.toString());
        }

    }
}
