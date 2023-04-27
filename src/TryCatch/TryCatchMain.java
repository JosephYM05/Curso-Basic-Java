package TryCatch;

public class TryCatchMain {
    public static void main(String[] args) {
        try { // try es un bloque de codigo que puede generar un error
            int result = 5 / 0;
        } catch (ArithmeticException e) { // ArithmeticException es una clase que hereda de Exception
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();// muestra el error en consola con el tipo de error y la linea donde se produjo
        }finally {
            System.out.println("Cierre de recursos");// se ejecuta siempre al final del try catch sin importar si hay error o no
        }
        System.out.println("Fin");
    }
}
