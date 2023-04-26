package Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo;

// CREACION DE OBJETOS
public class Coche {
    // Atributos

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // contructores
    public Coche() {
    }

    // ACA LLAMA EL METODO SUPER - Clase base
    public Coche(String color, String fabricante, String modelo, Double peso, Double largo) {
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    // Comportamiento
    public void acelerar(Integer cantidad) {
        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    @Override
    public String toString() {
        return "Coche{" +
                " color='" + color + "'" +
                ", fabricante='" + fabricante + "'" +
                ", modelo='" + modelo + "'" +
                ", peso='" + peso + "'" +
                ", largo='" + largo + "'" +
                ", velocidad='" + velocidad + "'" + ", motor='Ejemplo de motor" +
                "}";
    }

}
