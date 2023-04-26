package EJERCICIOS.EjercicioHerenciaPolimorfismo;

public class Herencia_y_Abstraccion {
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
abstract class Vehiculo2 {
    int velocidadMaxima;
    String matricula;
    String sonido;

    public Vehiculo2() {
        System.out.println("Estoy en el constructor de Vehiculo");
    }

    // VAMOS A ABSTRAERLOS CON UNA CLASE ABSTRACTA
    abstract public String getSonido();

    abstract public void setSonido(String sonido);

}

class Coche extends Vehiculo2 {
    public String getSonido() {

        return "SUPER SONIDO" + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}

class Moto extends Vehiculo2 {
    public String getSonido() {
        return "SUPER SONIDO de moto PLUS" + this.sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
