package Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo;

//HERENCIA
public class CocheElectrico extends Coche {
    String motorElectrico;

    // Contructores
    public CocheElectrico() {
    }

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    // Metodo Super
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo,
            String motorElectrico) {
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    // metodo sobre escritura
    @Override // notacion
    public void acelerar(Integer cantidad) {
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);
    }

    // toString

    @Override
    public String toString() {
        return "CocheElectrico{" +
                " color='" + color + "'" +
                ", fabricante='" + fabricante + "'" +
                ", modelo='" + modelo + "'" +
                ", peso='" + peso + "'" +
                ", largo='" + largo + "'" +
                ", velocidad='" + velocidad + "'" + ", motorElectrico='" + motorElectrico + '\'' +
                "}";
    }

}
