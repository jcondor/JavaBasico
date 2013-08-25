package PracticaLaboratorio01;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PFR
 */
public class PracticaLaboratorio01 {
    
    public static void main(String[] args) {
        
        Nutriente nutriente1 = new Nutriente ("Calcio",34);
        Nutriente nutriente2 = new Nutriente ("Glucosa",123);
        Nutriente nutriente3 = new Nutriente ("Magnesio",56);
        Nutriente nutriente4 = new Nutriente ("Lactosa",489);
        Nutriente nutriente5 = new Nutriente ("Riboflamina",289);
        
               
        Nutriente[] nutrientes = {nutriente1, nutriente2};
        
        Alimento alimento1 = new Alimento ("Carne", "kg", 55.12f, 123, 3, 
                nutrientes );
        Alimento alimento2 = new Alimento ("Verdura", "kg", 55.12f, 123, 3,
                new Nutriente[] {new Nutriente ("Riboflamina",44), new Nutriente ("Lactosa",489)} );
 /*       Alimento alimento3 = new Alimento ("Cereal", "kg", 55.12f, 123, 3, 
                new Nutriente[1]);
        Alimento alimento4 = new Alimento ("Fruta", "kg", 55.12f, 123, 3, 
                new Nutriente[1]);
        Alimento alimento5 = new Alimento ("Balanceado", "kg", 55.12f, 123, 3, 
                new Nutriente[1]);
   */     
        alimento1.doImprime();
        alimento2.doImprime();
        
        
        Animal animal1 = new Animal ("Margarita",2345,"Caballo",345.6f,"23/12/2011","");
        Animal animal2 = new Animal ("Lola",2345,"Vaca",235.6f,"23/12/2011","");
        Animal animal3 = new Animal ("Margarita",2345,"Vaca",445.6f,"23/12/2011","");
        Animal animal4 = new Animal ("Margarita",2345,"Caballo",512.6f,"23/12/2011","");
        Animal animal5 = new Animal ("Margarita",2345,"Caballo",345.6f,"23/12/2011","");
        
        animal1.doImprime();
        animal2.doImprime();
        animal3.doImprime();
        animal4.doImprime();
        animal5.doImprime();
        
    }        
    
}
