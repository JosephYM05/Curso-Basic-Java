package Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo;

public class CocheHibrido extends Coche {
    String motorCombustion;

    // Contructores
    public CocheHibrido() {
    }

    public CocheHibrido(String motorCombustion) {
        this.motorCombustion = motorCombustion;
    }

    public CocheHibrido(String color, String fabricante, String modelo, Double peso, Double largo,
            String motorCombustion) {
        super(color, fabricante, modelo, peso, largo);
        this.motorCombustion = motorCombustion;
    }

    // metodo sobre escritura
    public void acelerar(Integer cantidad) {
        if (cantidad > 0 && cantidad <= 120) {
            this.velocidad += cantidad;
        }
    }

    // to String
    @Override
    public String toString() {
        return "Coche Combustion{" +
                " color='" + color + "'" +
                ", fabricante='" + fabricante + "'" +
                ", modelo='" + modelo + "'" +
                ", peso='" + peso + "'" +
                ", largo='" + largo + "'" +
                ", velocidad='" + velocidad + "'" + ", motor='" + motorCombustion + '\'' +
                "}";
    }

}
