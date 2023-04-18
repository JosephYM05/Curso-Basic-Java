package Funciones_y_Parametros;
public class Ejemplo_SobrecargaDeFunciones_04 {
    public static void main(String[] args) {

        holaMundo();
        holaMundo("Jorge", "Marin");
        holaMundo('m');
        holaMundo("Pablo");
    }

    private static void holaMundo() {
        System.out.println("Hola Mundo");
    }

    private static void holaMundo(String name) {
        System.out.println(name);
    }

    private static void holaMundo(char name) {
        System.out.println(name);
    }

    private static void holaMundo(String name, String apellido) {
        System.out.println("Hola " + name + " " + apellido);
    }

}
