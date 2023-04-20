package EJERCICIOS.EjercicioCoche;

public class Coche {
    private int numeroPuertas;

    public Coche(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public void aumentarPuertas() {
        numeroPuertas++;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
}
