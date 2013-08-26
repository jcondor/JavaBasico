package Mediateca;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO
 */
public class Libro extends SoporteImpreso {
    private int NumeroPaginas = 0;
    private long ISBN = 0;

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public long getISBN() {
        return ISBN;
    }

    public int getNumeroPaginas() {
        return NumeroPaginas;
    }

    public void setNumeroPaginas(int NumeroPaginas) {
        this.NumeroPaginas = NumeroPaginas;
    }

    public Libro() {
        this.Precio = (float) 5.0;
    }
    
}
