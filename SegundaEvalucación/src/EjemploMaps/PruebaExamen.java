package EjemploMaps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class PruebaExamen {
    public static void main(String[] args) {
        //Ejercicio 3 del examen ejemplo de clase 12/02/2021
        Map<Integer, String>mapa=new TreeMap<>();
        mapa.put(1,"Uno");
        mapa.put(3,"Tres");
        mapa.put(4, "Cuatro");
        mapa.put(5, "Cinco");

        for (Map.Entry<Integer, String> entrada: mapa.entrySet()) {
            System.out.println(entrada.getKey() + " - " + entrada.getValue());
        }

        System.out.println("--------------------------------");

        Iterator<Map.Entry<Integer, String>> iterator=mapa.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> entradaActual=iterator.next();
            System.out.println(entradaActual.getKey() + " - " + entradaActual.getValue());
        }
    }


}
