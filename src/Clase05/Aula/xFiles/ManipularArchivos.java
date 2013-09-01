/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase05.Aula.xFiles;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author PFR
 */
public class ManipularArchivos {
    public static void main(String[] args) throws IOException {
        ManipularArchivos.CompruebaArchivo();
        ManipularArchivos.listarDirectorio();
        ManipularArchivos.renameFiles();
    }
    
    public static void CompruebaArchivo() throws IOException {
        //c:
        // Usar >>>>>>>>>>>>>>> File.separator
        
        File f = new File("E:\\temario.txt");
        System.out.println("Nombre: " + f.getName());
        System.out.println("Ruta : " + f.getPath());
        System.out.println("Ruta Absoluta: " + f.getAbsolutePath());

        if(f.exists()){
            System.out.println("Archivo sí existe!");
            System.out.println((f.canRead()) ? "Sí se puede leer" : "");
            System.out.println((f.canWrite()) ? "Sí se puede escribir" : "");
            System.out.println("La longitud del archivo es de " + f.length() + " bytes");
        } else {
            System.out.println("El archivo no existe");
            f.createNewFile();
        }
    }
        
    public static void listarDirectorio() throws IOException {
        File directorio = new File("C:\\ ");
        if ( (directorio.exists()) && (directorio.isDirectory())){
            String[] lista = directorio.list();
            for(int i=0; i<lista.length; i++){
                System.out.println(lista[i]);
            }
        } else {
            System.out.println("El directorio no existe.");
        }
    }
    
    public static void renameFiles () {
        File dir = new File("F:\\musica");
        
        if ( (dir.exists()) && (dir.isDirectory())){
            String[] lista = dir.list();
            for(int i=0; i<lista.length; i++){
                String filename = lista[i];
                String newname = i+". "+filename;
                
                File file = new File(filename);
                file.renameTo(new File(dir+"\\"+newname));
                System.out.println(dir+"\\"+newname);        
            }
        } else {
            System.out.println("El directorio no existe.");
        }
        
        
    }
}
