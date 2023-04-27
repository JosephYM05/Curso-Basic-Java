package Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo.Interfaces;

import Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo.Coche;
import Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo.CocheElectrico;

public class CocheServiceClasicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando coche clasico");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo coche clasico");
    }
}
