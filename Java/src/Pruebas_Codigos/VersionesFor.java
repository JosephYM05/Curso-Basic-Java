package Pruebas_Codigos;

import java.util.Scanner;

public class VersionesFor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\n-------------------------------------------------------------------------------------");
        int numeros[] = { 1, 2, 3, 4, 5 };
        System.out.println("For loop Normal ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("[ " + numeros[i] + "]");
        }
        System.out.println("\nLos números ingresados con for each: ");
        for (int i : numeros) {
            System.out.print("[ " + i + " ]");
        }
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("For loop (con sintaxis for each)  corto con lleno de datos automatico del 1 al 5");
        int[] numeros2 = new int[5];
        int i = 0;
        for (int num : numeros2) {
            numeros2[i] = i + 1;
            i++;
        }
        for (int num : numeros2) {
            System.out.print("[ " + num + " ]");
        }
        /*
         * El for each no puede imprimir valores inversos correctamente porque en cada
         * iteración del for-each loop estás asignando un nuevo valor a la variable num,
         * pero este nuevo valor no tiene ningún efecto en el contenido del arreglo
         * numeros2.
         */
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("For loop  corto con lleno de datos");
        int[] numeros3 = new int[5];
        int j = 0;
        for (int nume : numeros3) {
            System.out.print("\nIngrese un número para la posición " + j + ": ");
            numeros3[j] = sc.nextInt();
            j++;
        }
        System.out.println("Los números ingresados son: ");
        for (int nume : numeros3) {
            System.out.print("[ " + nume + " ]");
        }
        System.out.println("\n-------------------------------------------------------------------------------------");

    }
}
