package EJERCICIOS.EjercicioCoche;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche(2);
        miCoche.aumentarPuertas();
        System.out.println(miCoche.getNumeroPuertas());

    }
}
