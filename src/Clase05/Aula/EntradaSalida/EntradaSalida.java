/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase05.Aula.EntradaSalida;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author PFR
 */
public class EntradaSalida {
    public static void main(String[] args) {
        EntradaSalida.EscribirArchivo();
    }
    
    public static void EscribirArchivo () {
        
        FileWriter fw;
        BufferedWriter bw;
        try {
            fw = new FileWriter("F:\\pruebas.txt");
            bw = new BufferedWriter(fw);
            bw.write("Es una linea");
            bw.newLine();
            bw.write("Es otra linea");
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    
}
