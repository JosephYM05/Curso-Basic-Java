package EJERCICIOS.EjercicioHerenciaPolimorfismo;

public class herencia {
    public static void main(String[] args) {
        CocheElectrico CocheElectrico = new CocheElectrico();
        CocheElectrico.velocidadMaxima = 14;
        CocheElectrico.matricula = "ABC DEF 234";
        System.out.println(CocheElectrico.comprobarMatricula("XAX"));
    }
}

class Vehiculo {
    int velocidadMaxima;
    String matricula;

    public boolean comprobarMatricula(String matricula) {
        if (matricula == "XXX") {
            return true;
        }
        return false;
    }
}

class Coche extends Vehiculo {

}

class CocheElectrico extends Vehiculo {

}