/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Tarea5.Ejercicio1;

/**
 *
 * @author USUARIO
 */
public class PersonalVendedor extends Personal {
    private float comision;

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }

    public PersonalVendedor(float comision, float sueldo, String nombre) {
        super(sueldo, nombre);
        this.comision = comision;
    }
}
