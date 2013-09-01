package Tarea1;


public class Mediateca {

    public static void main(String[] args) {
 
        Libro libro = new Libro(); 
        Audio audio = new Audio();
        
        
        
        libro.setTitulo("El mundo de julius....");
        libro.setAutor("Jose");
        libro.setNumeroPaginas(123);
        libro.setISBN(765);
        
        System.out.println(libro.getTitulo());
        System.out.println(libro.getAutor());
        System.out.println(libro.getNumeroPaginas());
        System.out.println(libro.getISBN());
        System.out.println(libro.getPrecio());
        
       
        audio.setTitulo("Whos call the rain");
        audio.setAutor("Credence Clearwater Revival");
        audio.setLugar("EEUU");
        audio.setDuracion(123);
        
        
        
        
        System.out.println("  ");
        
        System.out.println(audio.getTitulo());
        System.out.println(audio.getAutor());
        System.out.println(audio.getLugar());
        System.out.println(audio.getDuracion());
        System.out.println(audio.Precio);
        
        System.out.println(" Hola ");
                
        Persona persona = new Persona("Jose Condor", new Prestamo[] {new Prestamo(audio,12), new Prestamo(libro,3)});
        
     //   System.out.println(persona.getValor());
    }
}
