# Ejercicios

Enunciado del ejercicio:

Primera parte:

- Crear una función con tres parámetros que sean números que se - suman entre sí.
- Llamar a la función en el main y darle valores.

Segunda parte:

- Crear una clase coche.
- Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.
- Una función que incremente el número de puertas que tiene el coche.
- Crear un objeto miCoche en el main y añadirle una puerta.

__Entrega: Mostrar el número de puertas que tiene el objeto.__

## Explicación

Tenemos una clase Coche que tiene una variable de instancia numeroPuertas que representa el número de puertas que tiene el coche. Además, tenemos un constructor que toma un parámetro numeroPuertas para establecer el número inicial de puertas del coche.

La clase Coche también tiene dos métodos: aumentarPuertas() que incrementa el número de puertas del coche en 1 y getNumeroPuertas() que devuelve el número actual de puertas del coche.

En el main, creamos un objeto miCoche de la clase Coche con 2 puertas mediante la llamada del constructor Coche(2). Luego, llamamos al método aumentarPuertas() en el objeto miCoche para agregar otra puerta. Finalmente, imprimimos el número total de puertas del coche con System.out.println(miCoche.getNumeroPuertas()).

En resumen, este ejemplo ilustra cómo usar una clase en Java para modelar un objeto complejo (en este caso, un coche con un número de puertas). También demuestra cómo se pueden usar los métodos de una clase para interactuar con el objeto y realizar acciones como agregar o actualizar información.