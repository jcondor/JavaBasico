/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea2.Hymenoptera;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author USUARIO
 */
public class Colmena {
    private Reina reina;
    private Zangano zangano;
    private Set<Obrera> obreras;
    
    public Colmena() {
        reina = new Reina();
        zangano = new Zangano();
        obreras = new HashSet();
    }
    
    public void CreaObrera() {
        obreras.add(new Obrera());
    }

    public Reina getReina() {
        return reina;
    }

    public Zangano getZangano() {
        return zangano;
    }

    public Set<Obrera> getObreras() {
        return obreras;
    }

    public void setReina(Reina reina) {
        this.reina = reina;
    }

    public void setZangano(Zangano zangano) {
        this.zangano = zangano;
    }

    public void setObreras(Set<Obrera> obreras) {
        this.obreras = obreras;
    }
}
