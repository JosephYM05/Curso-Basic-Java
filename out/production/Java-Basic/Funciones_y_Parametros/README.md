# **Ámbitos en Java:**

En Java, los ámbitos se refieren a la visibilidad y accesibilidad de una variable o método en diferentes partes de un programa. Una variable declarada dentro de un bloque de código solo es visible y accesible dentro de ese bloque de código y no puede ser utilizada fuera de él. Por otro lado, una variable declarada fuera de un bloque de código (en la clase, por ejemplo) es visible y accesible en cualquier parte del programa. 
## Funciones
1. ¿Qué son las funciones y los parámetros?
- Las funciones son bloques de código que realizan una tarea específica. Son utilizadas para dividir el código en partes más pequeñas y fáciles de manejar. Las funciones se pueden llamar en cualquier parte del código, permitiendo reutilizar el código sin tener que volver a escribirlo.
- Los parámetros son valores que se pasan a una función para ser utilizados dentro de ella. Las funciones pueden tomar uno o varios parámetros. Los parámetros permiten que una función sea más flexible y útil, ya que pueden tomar diferentes valores en diferentes momentos y para diferentes situaciones.
- Existen varios tipos de parámetros en Java, incluyendo enteros, flotantes, cadenas, booleanos, arreglos, objetos, entre otros. La elección del tipo de parámetro depende de la tarea que la función deba realizar.
- Algunas funciones no requieren parámetros y se utilizan para realizar una tarea específica sin la necesidad de recibir datos adicionales. Por ejemplo, una función que muestra un mensaje de bienvenida en la pantalla no necesita recibir ningún parámetro.
- Otras funciones no devuelven valores, sino que realizan una tarea específica y no tienen ningún valor que deba ser devuelto al código principal. Por ejemplo, una función que muestra una ventana emergente en la pantalla no necesita devolver ningún valor.
2. Declaración de funciones y parámetros en Java
    - Sintaxis para definir una función en Java
    - Sintaxis para definir parámetros en Java
    - Cómo especificar el tipo de retorno de una función

```Java
[modificadorAcceso] [modificadorFinal] [tipoRetorno] nombreFuncion([tipoParametro1] 
nombreParametro1, [tipoParametro2] nombreParametro2, ...) 
{
// Cuerpo de la función
return valorRetorno;
}
```

Donde:

- **`modificadorAcceso`** es un modificador de acceso como public, private o protected. Indica si la función puede ser accedida desde otros lugares del programa.
- **`modificadorFinal`** es la palabra clave **`final`**, que indica que la función no puede ser sobrescrita por subclases.
- **`tipoRetorno`** es el tipo de datos que devuelve la función. Puede ser cualquier tipo de datos válido en Java.
- **`nombreFuncion`** es el nombre de la función, que debe ser un identificador válido en Java.
- **`tipoParametro1`**, **`tipoParametro2`**, etc., son los tipos de datos de los parámetros de la función. Pueden ser cualquier tipo de datos válido en Java.
- **`nombreParametro1`**, **`nombreParametro2`**, etc., son los nombres de los parámetros de la función.

## `Sobre carga de funciones`

En Java se refiere a la capacidad de tener múltiples métodos con el mismo nombre en una clase, pero con diferentes parámetros. Esto significa que podemos tener múltiples versiones de un método, y Java decidirá qué método ejecutar según los parámetros que se le pasen.
- holaMundo(): Este método no tiene parámetros y simplemente imprime "Hola Mundo" en la consola.
- holaMundo(String name): Este método toma un parámetro String llamado name y lo imprime en la consola.
- holaMundo(char name): Este método toma un parámetro char llamado name y lo imprime en la consola.
- holaMundo(String name, String apellido): Este método toma dos parámetros de tipo String llamados name y apellido, y los concatena para imprimir "Hola " seguido del nombre y el apellido en la consola.

Al ejecutar el método main(), se llaman a cada uno de estos métodos de holaMundo con diferentes combinaciones de parámetros. Por ejemplo, la llamada holaMundo("Jorge", "Marin") ejecuta el tercer método holaMundo(char name), mientras que la llamada holaMundo("Pablo") ejecuta el segundo método holaMundo(String name).

Este ejemplo ilustra cómo podemos utilizar la sobrecarga de funciones en Java para tener múltiples versiones de un método con diferentes parámetros. Esto puede ser muy útil en situaciones en las que queremos tener la misma funcionalidad en diferentes contextos.