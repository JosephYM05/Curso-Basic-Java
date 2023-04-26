/**
 * This Java class checks if number1 is less than number2 and number2 is less than number3, and prints
 * "verdadero" if true.
 */
package EstructurasDeControl;

public class If_Else {
    public static void main(String[] args) {
        // boolean check = 5 < 10;

        int number1 = 5, number2 = 10, number3 = 20, number4 = 1000;
        if (number1 < number2 && number2 < number3) {
            System.out.println("verdadero");
        } else if (number3 < number4) {
            System.out.println("Else if");
        } else {
            System.out.println(" ");
        }
        System.out.println("Fin");
    }
}
