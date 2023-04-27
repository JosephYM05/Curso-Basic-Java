package Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo.Interfaces;

import Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo.Coche;

public class InterfacesMain {
    public static void main(String[] args) {
        CocheService service1 = new CocheServiceClasicImpl();
        CocheService service2 = new CocheServiceSportIml();

        Coche coche1 = service1.crearCocheDemo();
        Coche coche2 = service2.crearCocheDemo();
    }
}
