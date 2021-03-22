package EjerciciosClase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio14 {
    public static void main(String[] args) {
        int total=100;
        List<Integer> numeros=new ArrayList<>();
        for (int i = 0; i < total; i++) {
            numeros.add(i * i);
        }
        numeros=numeros.stream().sorted().collect(Collectors.toList());
        System.out.println(numeros);
    }
}
