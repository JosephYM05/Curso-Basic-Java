package Listas;

public class AutomovilMain {
    String name="Nombre de coche";
    public AutomovilMain(){
    }
    public  AutomovilMain(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Automovi{" +
                "name='" + name + '\'' +
                '}';
    }
}
