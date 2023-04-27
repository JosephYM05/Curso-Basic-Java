package Arrays;

import java.util.Arrays;

import static java.util.Arrays.binarySearch;

public class ArraysMain {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 4, 7, 6, 5, 8, 1, 10}; // Tipo de dato [] nombre del array luego una asignacion de valores
        int[] arr2 = new int[10]; // Tipo de dato [] nombre del array = luego una asignacion de valores
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println("For each");
        for (int item : arr) {
            System.out.print(item);
        }
        System.out.println("Binary search");
        System.out.print(binarySearch(arr, 2)); // Busca un elemento en el array y devuelve su posicion
        System.out.println("Sort");
        Arrays.sort(arr); // Ordena el array
        for (int item : arr) {
            System.out.println(item);
        }
        System.out.println("Equals");
        System.out.println(Arrays.equals(arr, arr2)); // Compara dos arrays
    }
}
