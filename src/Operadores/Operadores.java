package Operadores;

public class Operadores {
    public static void main(String[] args) {
        // Declaración e inicialización de variables
        int a = 10;
        int b = 3;

        // Operadores aritméticos
        int suma = a + b; // Suma
        int resta = a - b; // Resta
        int multiplicacion = a * b; // Multiplicación
        float division = a / b; // División
        int modulo = a % b; // Módulo

        System.out.println("Suma: " + a + "+" + b + " = " + suma);
        System.out.println("Resta: " + a + "-" + b + " = " + resta);
        System.out.println("Multiplicación: " + a + "*" + b + " = " + multiplicacion);
        System.out.println("División: " + a + "/" + b + " = " + division);
        System.out.println("Módulo: " + a + "%" + b + " = " + modulo);

        // Operadores de incremento y decremento
        int c = 0;
        System.out.println("c = " + c); // Imprime 1
        c++; // Incremento
        System.out.println("Incremento c: " + c); // Imprime 1

        int d = 5;
        System.out.println("d: " + d); // Imprime 4
        d--; // Decremento
        System.out.println("Decremento d: " + d); // Imprime 4

        // Operadores de asignación
        int e = 10;
        System.out.println("e: " + e); // Imprime 15
        e += 5; // e = e + 5
        System.out.println("e=e+5: " + e); // Imprime 15

        int f = 20;
        System.out.println("f: " + f);
        f -= 10; // f = f - 10
        System.out.println("f=f-10: " + f); // Imprime 10

        // Operadores de comparación
        int g = 15;
        int h = 20;

        boolean mayorQue = h > g; // Mayor que
        boolean menorQue = g < h; // Menor que
        boolean mayorIgualQue = h >= g; // Mayor o igual que
        boolean menorIgualQue = g <= h; // Menor o igual que
        boolean igualQue = g == h; // Igual que
        boolean distintoQue = g != h; // Distinto que

        System.out.println("Mayor que: " + mayorQue);
        System.out.println("Menor que: " + menorQue);
        System.out.println("Mayor o igual que: " + mayorIgualQue);
        System.out.println("Menor o igual que: " + menorIgualQue);
        System.out.println("Igual que: " + igualQue);
        System.out.println("Distinto que: " + distintoQue);

        // Operadores lógicos
        boolean i = true;
        boolean j = false;

        boolean and = i && j; // AND lógico
        boolean or = i || j; // OR lógico
        boolean not = !i; // NOT lógico

        System.out.println("AND lógico: " + and);
        System.out.println("OR lógico: " + or);
        System.out.println("NOT lógico: " + not);
    }
}
