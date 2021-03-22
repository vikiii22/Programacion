package EjerciciosClase;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio15 {
    public static void main(String[] args) {
        int total=100;
        List<Boolean>numeros=new ArrayList<>();
        for (int i = 0; i <total ; i++) {
            int divide=i%2;
            if (divide==0){
                numeros.add(false);
            }else{
                numeros.add(true);
            }
        }
        System.out.println(numeros);
    }
}
