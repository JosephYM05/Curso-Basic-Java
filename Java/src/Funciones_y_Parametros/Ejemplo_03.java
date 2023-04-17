package Funciones_y_Parametros;

import java.util.Scanner;

public class Ejemplo_03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entero:");
        int miNumero = scanner.nextInt();
        boolean resultado = esPositivo(miNumero);
        System.out.println(resultado);
    }

    public static boolean esPositivo(int numero) {
        if (numero > 0) {
            return true;
        } else {
            return false;
        }
    }

}
