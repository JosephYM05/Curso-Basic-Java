package Mapas;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<String, String> personas = new HashMap<>();
        personas.put("1725753345", "Nombre #1 : Juan");
        personas.put("1725753346", "Nombre #2 : Pedro");
        personas.put("1725753347", "Nombre #3 : Maria");
        System.out.println(personas);
        for (String key : personas.keySet()) {
            System.out.println(key);
        }
        for (String value : personas.values()) {
            System.out.println(value);
        }
        for (Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println("Key: " + pair.getKey() + " Value: " + pair.getValue());
        }

    }
}
