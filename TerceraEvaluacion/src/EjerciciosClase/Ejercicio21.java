package EjerciciosClase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio21 {
    public static void main(String[] args) {
        List<Character> primera= Arrays.asList('a', 'e', 'i', 'o', 'u');
        List<Character> segunda= Arrays.asList('d', 'm', 'y', 'z');
        List<Character> solucion=new ArrayList<>();
        solucion.addAll(primera);
        solucion.addAll(segunda);
        //solucion.sort();
        System.out.println(solucion);

        int punteroPrimera=0;
        int punteroSegunda=0;
        solucion.clear();
        while (punteroPrimera<primera.size() && punteroSegunda < segunda.size()){
            if (primera.get(punteroPrimera)<segunda.get(punteroSegunda)){
                solucion.add(primera.get(punteroPrimera++));
            }else{
                solucion.add(segunda.get(punteroSegunda++));
            }
        }
        if (punteroPrimera<primera.size()) {
            solucion.addAll(primera.subList(punteroPrimera, primera.size()));
        }
        if (punteroSegunda<segunda.size()){
            solucion.addAll(primera.subList(punteroSegunda, segunda.size()));
        }
        System.out.println(solucion);
    }
}


