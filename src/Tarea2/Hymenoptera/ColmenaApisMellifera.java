/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2.Hymenoptera;

import java.util.HashSet;

/**
 *
 * @author USUARIO
 */
public class ColmenaApisMellifera extends Colmena {

    public ColmenaApisMellifera() {
        super();
        super.getReina().setPeriodoDesarrollo(16);
        super.getZangano().setPeriodoDesarrollo(23);
    }
    
    @Override
    public void CreaObrera() {
        super.getObreras().add(new Obrera(21));
    }
}
