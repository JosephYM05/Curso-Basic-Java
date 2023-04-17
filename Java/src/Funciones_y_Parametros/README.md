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