package Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo.Interfaces;

import Clases_CrearObjetos_Herencia_MetodoSuper_Polimorfismo.Coche;

public interface CocheService {
    public Coche crearCocheDemo(); //No confundir esto con un atributo ya que no tiene cuerpo solo tiene la asignarura
    public void destruirCoche(Coche coche);
}
