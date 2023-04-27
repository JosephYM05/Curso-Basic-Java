package Listas;

import java.util.ArrayList;
import java.util.List;

public class ListaMain {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Nombre #01 : Juan");
        nombres.add("Nombre #02 : Pedro");
        nombres.add("Nombre #03 : Maria");
        nombres.add("Nombre #04 : Jose");
        nombres.add("Nombre #05 : Luis");
        System.out.println(nombres);
        //FOR EACH
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
        List<AutomovilMain> coches = new ArrayList<>();
        coches.add(new AutomovilMain("Coche #01"));
        coches.add(new AutomovilMain("Coche #02"));
        coches.add(new AutomovilMain("Coche #03"));
        System.out.println(coches);
        System.out.println("For each con toString() de AutomovilMain");
        for (AutomovilMain coche : coches) {
            System.out.println(coche);
        }
    }
}
