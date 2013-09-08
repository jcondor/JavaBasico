/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5.Ejercicio1;

/**
 *
 * @author USUARIO
 */
public class Aplicacion {
    public static void main(String[] args) {
        
       ClientePersona persona = new ClientePersona("Jose Condor","Surco",1234533);
        System.out.println(persona.toString());
        
       ClienteCorporativo corporativo = new ClienteCorporativo("JJC CONTRATISTAS GENERALES S.A.","Av. República de Chile 388", 100000f,"Chorrillos","A");
        System.out.println(corporativo.toString());
    }
}
