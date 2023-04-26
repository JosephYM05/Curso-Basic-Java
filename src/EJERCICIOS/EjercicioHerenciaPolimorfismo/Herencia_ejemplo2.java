package EJERCICIOS.EjercicioHerenciaPolimorfismo;

public class Herencia_ejemplo2 {
    public static void main(String[] args) {
        // Vehiculo2 vehiculo = new Vehiculo2();
        // vehiculo.setSonido("BRRRR");
        // System.out.println(vehiculo.getSonido());

        // Es los mismo
        Coche coche = new Coche();
        coche.setSonido("BRRRR");
        System.out.println(coche.getSonido());

    }
}

// si vamos hacer abtraccion tenemos que abstraer esta clase
class Vehiculo2 {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo2() {
        System.out.println("Estoy en el constructor de Vehiculo");
    }

    // Esto se utiliza sin que la funcion sea abstracta
    public String getSonido() {
        return this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

}

class Coche extends Vehiculo2 {
}

class Moto extends Vehiculo2 {
}