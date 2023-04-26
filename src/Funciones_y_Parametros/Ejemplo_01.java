package Funciones_y_Parametros;

public class Ejemplo_01 {
    public static void main(String[] args) {

        holaMundo();
        nombres("Joseph");
        nombres("Anderson");
        String hola = devolver_texto();
        System.out.println("Bienvenidos al curso de java " + hola);

    }

    private static String devolver_texto() {
        return "Alumnos";
    }

    private static void nombres(String name) {
        System.out.println("Saludos " + name);
    }

    private static void holaMundo() {
        System.out.println("Hola Mundo de Java");
    }
}
