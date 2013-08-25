/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase02.Aula.Objetos;

/**
 *
 * @author PFR
 */
public class Animal {
        
    private int numeropatas;

    public int getNumeropatas() {
        return numeropatas;
    }

    public void setNumeropatas(int numeropatas) {
        this.numeropatas = numeropatas;
    }
    
    public void HacerRuido() {
        System.out.println("Yo no puedo hacer nada porque soy animal........");
    }
}