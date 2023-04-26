package Funciones_y_Parametros;

public class Ejemplo_02 {
    public static int suma(int a, int b) {
        return a + b;
    }

    public static void main(String[] arg) {
        // Llamamos a la función suma y le pasamos dos parámetros
        int resultado = suma(5, 10);

        // Mostramos el resultado de la función en la pantalla
        System.out.println("La suma de 5 y 10 es: " + resultado);

    }
}
