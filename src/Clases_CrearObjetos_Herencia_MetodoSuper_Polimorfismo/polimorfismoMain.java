package Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo;

public class polimorfismoMain {
    public static void main(String[] args) {

        Coche coche1 = new Coche();
        CocheElectrico coche2 = new CocheElectrico();
        CocheHibrido coche3 = new CocheHibrido();
        // Polimorfismo
        Coche coche4 = new CocheElectrico();
        Coche coche5 = new CocheHibrido();

        if (coche4 instanceof Coche) {
            System.out.println("Es una instancia de Coche ");
        }
        if (coche4 instanceof CocheHibrido) {
            System.out.println("Es una instancia de Coche Hibrido");
        }
        if (coche4 instanceof CocheElectrico) {
            System.out.println("Es una instancia de Coche Electrico");
        }
    }
}
