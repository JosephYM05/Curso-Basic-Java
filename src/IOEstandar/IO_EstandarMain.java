package IOEstandar;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class IO_EstandarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Lee de la consola
        System.out.print("Introduce un numero: ");
        System.out.print("Introduce un nombre: ");
        String nombre = sc.nextLine(); //Lee una cadena de la consola
        int numero = sc.nextInt(); //Lee un entero de la consola
        System.out.println("El numero introducido es: " + numero);
        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("Hola mundo");//Imprime en la consola
    }
}