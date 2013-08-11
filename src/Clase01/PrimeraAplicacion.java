package Clase01;

public class PrimeraAplicacion {

    public static void main(String[] args) {
        PrimeraAplicacion.ejercicio7(7);
        PrimeraAplicacion.ejercicio7(17);
        PrimeraAplicacion.ejercicio7(18);
        PrimeraAplicacion.ejercicio7(59);
        PrimeraAplicacion.ejercicio7(60);
        ejerciciomatriz();
    }

    public static void ejercicio1() {
        int resultado = 7 * (15 + 1) * 2 % 2;
        System.out.println(resultado);
    }

    public static void ejercicio2() {
        boolean resultado = 0.0 / 0.0 == 0.0 / 0.0;
        System.out.println(resultado);
    }

    public static void ejercicio3() {
        boolean resultado = (!true && false);
        System.out.println(resultado);
    }

    public static void ejercicio4() {
        boolean resultado = ((3 * 4 >= 12) && (3.5 > 1 + 2f)) || (4 < 8);
        System.out.println(resultado);
    }

    public static void ejercicio5() {
        boolean resultado = !(true == false);
        System.out.println(resultado);
    }

    public static void ejercicio6() {
        boolean resultado = (!true == false);
        System.out.println(resultado);
    }

    public static void ejercicio7(int edad) {
        
        int resultado = ((edad >= 0) && (edad < 18)) ? 15
                : ((edad >= 18) && (edad < 60)) ? 0
                : (edad >= 60) ? 30 : 0;
        System.out.println(resultado);
    }

    public static void ejerciciomatriz() {
        int[] matriznumero = {2, 24, 5, 6};

        for (int i = 0; i < matriznumero.length; i++) {
            System.out.println(matriznumero[i]);
        }
    }

    public static void ejercicio8() {
        int[] meses = {31,28,31,30,31,30,31,30,31,30,31,30};

        for (int i = 0; i < meses.length; i++) {
            System.out.println(meses[i]);
        }
    }

}
