package EJERCICIOS.EjercicioEstructurasDeControl;

public class Estructuras_Control {
    public static void main(String[] args) {

        System.out.println("\nEjercicio #1 Condicionales");
        /*
         * Usando un if, crear una condición que compare si la variable numeroIf es
         * positivo, negativo, o 0.
         * Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
         */
        int numeroIf = 3;
        if (numeroIf < 0) {
            System.out.println("El número" + numeroIf + " es negativo");
        } else if (numeroIf > 0) {
            System.out.println("El número " + numeroIf + " es positivo");
        } else if (numeroIf == 0) {
            System.out.println("El número" + numeroIf + " es cero");
        }
        /*
         * Crea un bucle While, este bucle tendrá que tener como condición que la
         * variable numeroWhile sea inferior a 3, el bloque de código que tendrá el
         * bucle deberá:
         * Incrementar el valor de la variable en uno cada vez que se ejecute.
         * Mostrarlo por pantalla cada vez que se ejecute.
         */
        int numeroWhile = 0;
        System.out.println("\nEjercicio #2 Condición Repetitiva While");
        while (numeroWhile < 3) {
            System.out.println(numeroWhile++);
        }
        /*
         * Para el bucle Do While, deberás crear la misma estructura que en el While,
         * pero solo se debe ejecutar una vez.
         */
        System.out.println("\nEjercicio #3 Condición Repetitiva Do-While");
        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println(numeroDoWhile);
        } while (numeroDoWhile < 3);
        /*
         * Para el bucle For, crea una variable numeroFor, esta variable tendrá como
         * valor 0 y su condición será que la variable sea igual o menor que 3, se irá
         * incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
         * pantalla.
         */
        System.out.println("\nEjercicio #4 Condición Repetitiva For");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        /*
         * Por último, para el Switch, deberás crear la variable estacion, y distintos
         * case para las cuatro estaciones del año. Dependiendo del valor de la variable
         * estacion se deberá mandar un mensaje por consola informando de la estación en
         * la que está. También habrá que poner un default para cuando el valor de la
         * variable no sea una estación.
         */
        System.out.println("\nEjercicio #5 Switch Case");

        var estacion = "Otoño";
        switch (estacion) {
            case "Verano":
                System.out.println("\nEstación: Verano");
            case "Primavera":
                System.out.println("\nEstación: Primavera");
                break;
            case "Otoño":
                System.out.println("\nEstación: Otoño");
                break;
            case "Invierno":
                break;
            default:
                System.out.println("\nNo se encontrado ese tipo de Estación");
                break;
        }
    }
}
