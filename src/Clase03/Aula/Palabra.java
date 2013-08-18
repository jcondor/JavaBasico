/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03.Aula;

/**
 *
 * @author PFR
 */
public class Palabra implements Capitalizable {

     String texto;
    
    Palabra(String n){
    texto=n.replaceAll(" ","");
    }
   

    
    @Override
    public String cambiaMayuscula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String cambiaMinuscula() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
