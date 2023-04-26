package Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo;

public class CocheMain {
    public static void main(String[] args) {
        // String coche = "Alfa Romeo";
        // Coche cocheObj = new Coche();

        Coche cocheObj2 = new Coche("Rojo", "Honda", "Civic", 1245.312, 5.4);

        cocheObj2.acelerar(50);
        System.out.println("Principal  : " + cocheObj2);
        cocheObj2.peso = 1234.53;
        System.out.println("Cambios : " + cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();
        cocheElectrico.color = "Negro";
        cocheElectrico.fabricante = "HONDA";
        cocheElectrico.modelo = "GT";
        cocheElectrico.peso = 9872.432;
        cocheElectrico.largo = 10.32;
        cocheElectrico.motorElectrico = "Ejemplo de motor";
        System.out.println("Herencia : " + cocheElectrico);

        /* Clase base e hija - Sin diplicar */
        CocheElectrico cocheElectrico2 = new CocheElectrico("Azul", "Alfa", "Romeo", 1400d, 4.99, "TXT");
        System.out.println("Metodo Super: " + cocheElectrico2);
        cocheElectrico2.acelerar(50);
        System.out.println("Sobre escritura: " + cocheElectrico2);
        CocheHibrido cocheElectrico3 = new CocheHibrido("Violeta", "Nisan", "Q23k", 4573.223, 3.23, "ECO2KA");
        cocheElectrico3.acelerar(30);
        System.out.println(cocheElectrico3);
    }
}
