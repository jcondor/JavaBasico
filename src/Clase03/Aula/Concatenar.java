/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase03.Aula;

/**
 *
 * @author PFR
 */
public class Concatenar {
    
    public static void main(String[] Args) {
        Concatenar.Concatenando();
        Concatenar.Extraccion();
        Concatenar.Reemplazo();
        Concatenar.Sbuffer();
    }
    
    public static void Concatenando() {
                String nombre = "James";
		String apellido = "Gosling";
		
		if(nombre.equals("James")) {
			System.out.println(nombre+" "+apellido);
		}
		
		String completo = nombre.concat(" "+apellido);
		
		if(nombre.equals("James")) {
			System.out.println(completo);
		}

    }
    
    public static void Extraccion () {
        String texto = "Tecsup";		
		
		System.out.println("Número de Caracteres: "+texto.length()+"\n");		
		for (int i=0; i<texto.length(); i++) {			
			System.out.println(texto.substring(i,i+1)+"\n");
		}

    }
    
     public static void Reemplazo () {
         String texto = "java permite crear java applets, javabeans y java servlets";
         System.out.println(texto.replaceAll("java","JAVA"));				
     }
     
     public static void Sbuffer () {
         StringBuffer sb = new StringBuffer("Java Basico Tecsup Lima");
		
		sb.insert(11," en");
		sb.delete(21,sb.length());
		
		System.out.println(sb);

     }
}
