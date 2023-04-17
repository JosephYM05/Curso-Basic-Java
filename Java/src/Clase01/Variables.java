package Clase01;

public class Variables {
    public static void main(String[] args) {

        /* Variables */

        // Datos enteros
        byte numer1 = 1; // 1 byte
        short number2 = 2; // 2 byte
        int number3 = 3; // 4 byte
        long number4 = 4; // 8 byte

        // Punto flotante
        float decimal1 = 4.9f;
        double decimal2 = 9.99d;

        // Caracter
        char caracter1 = 'a';

        // booleano
        boolean booleano1 = true;
        boolean falso = false;

        // Cadenas de texto
        String cadena1 = "Hola";
        String cadena2 = " Mundo";

        // Tipos envoltorio

        Integer numero = null;
        Long numero2 = 2L;

        System.out.println("Datos enteros: " + numer1 + " " + numero2 + " " + number3 + " " + number4);
        System.out.println("Punto Flotante: " + decimal1 + " " + decimal2);
        System.out.println("Caracter: " + caracter1);
        System.out.println("Booleanos: " + booleano1 + ", " + falso);
        System.out.println("Cadena de texto:" + cadena1 + " " + cadena2);
        System.out.println("Tipos envolterio: " + numero + " " + numero2);

    }
}
