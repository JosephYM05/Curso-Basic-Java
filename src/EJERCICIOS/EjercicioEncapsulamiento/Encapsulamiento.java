package EJERCICIOS.EjercicioEncapsulamiento;

public class Encapsulamiento {
    public static void main(String[] args) {
        encap persona = new encap();

        persona.setEdad(25);
        persona.setNombre("Juan");
        persona.setTelefono("1234567890");

        System.out.println("Edad: " + persona.getEdad());
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Telefono: " + persona.getTelefono());
    }
}
