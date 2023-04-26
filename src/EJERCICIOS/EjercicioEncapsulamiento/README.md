# Ejercicio de encapsulamiento
Para practicar la encapsulación:

- Crear clase Persona.
- Crear variables las privadas edad, nombre y telefono de la clase Persona.
- Crear gets y sets de cada propiedad.
- Crear un objeto persona en el main.
- Utiliza los gets y sets para darle valores a las propiedades edad, nombre y telefono, por último muéstralas por consola

| Clase Persona | Descripción |
| --- | --- |
| private int edad | Propiedad privada edad de la clase Persona. |
| private String nombre | Propiedad privada nombre de la clase Persona. |
| private String telefono | Propiedad privada telefono de la clase Persona. |
| public int getEdad() | Método público get para obtener el valor de la propiedad edad. |
| public void setEdad(int edad) | Método público set para establecer el valor de la propiedad edad. |
| public String getNombre() | Método público get para obtener el valor de la propiedad nombre. |
| public void setNombre(String nombre) | Método público set para establecer el valor de la propiedad nombre. |
| public String getTelefono() | Método público get para obtener el valor de la propiedad telefono. |
| public void setTelefono(String telefono) | Método público set para establecer el valor de la propiedad telefono. |

| Clase Main | Descripción |
| --- | --- |
| public static void main(String[] args) | Método principal del programa. |
| Persona persona = new Persona(); | Creación de una instancia de la clase Persona. |
| persona.setEdad(25); | Establecimiento del valor de la propiedad edad de la instancia de Persona. |
| persona.setNombre("Juan"); | Establecimiento del valor de la propiedad nombre de la instancia de Persona. |
| persona.setTelefono("1234567890"); | Establecimiento del valor de la propiedad telefono de la instancia de Persona. |
| System.out.println("Edad: " + persona.getEdad()); | Impresión en consola del valor de la propiedad edad de la instancia de Persona. |
| System.out.println("Nombre: " + persona.getNombre()); | Impresión en consola del valor de la propiedad nombre de la instancia de Persona. |
| System.out.println("Telefono: " + persona.getTelefono()); | Impresión en consola del valor de la propiedad telefono de la instancia de Persona. |

__La tabla muestra las clases Persona y Main y sus respectivos métodos y propiedades. En la clase Persona se definen las propiedades privadas edad, nombre y telefono, y los métodos get y set para cada una de ellas. En la clase Main se crea una instancia de la clase Persona y se establecen valores para sus propiedades utilizando los métodos set. Luego se utilizan los métodos get para obtener los valores de las propiedades y se muestran por consola mediante el método println.__