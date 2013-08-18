/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03.Aula;

/**
 *
 * @author PFR
 */
public class Oracion implements Capitalizable{
    
    String texto;
    
    Oracion(String n){
    texto=n;
    }
    
    public String agregaPalabra(String t) {
     texto=texto.concat(" "+t);
     return texto;
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
