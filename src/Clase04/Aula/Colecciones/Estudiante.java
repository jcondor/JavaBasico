/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase04.Aula.Colecciones;

/**
 *
 * @author PFR
 */


public class Estudiante implements Comparable<Estudiante>{
        private String nombres;
	private String apellidos;
	private String direccion;
	private int codMatricula;
        
        

	public int compareTo(Estudiante o) {	 	
		String apellidos = o.getApellidos().toLowerCase();
		String apellidosLocal = this.getApellidos().toLowerCase(); 		
		return apellidosLocal.compareTo(apellidos);
        }

    public Estudiante(String nombres, String apellidos, String direccion, int codMatricula) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.codMatricula = codMatricula;
    }
        
        

       

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCodMatricula() {
        return codMatricula;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCodMatricula(int codMatricula) {
        this.codMatricula = codMatricula;
    }
}
