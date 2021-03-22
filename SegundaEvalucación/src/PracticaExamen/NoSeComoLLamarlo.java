package PracticaExamen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NoSeComoLLamarlo {
    public static void main(String[] args) {
        List<String> jodete=new ArrayList<>();

        jodete.add("Me importa una mierda");
        jodete.add("Mamahuevo");
        for (String n:jodete) {
            System.out.println(n);
        }

        System.out.println(jodete.get(1));
        jodete.set(1,"Chupamela");
        System.out.println(jodete.get(1));

        System.out.println("------------------------------");

        int[] numerosTope = new int[151];
        for (int i = 0; i < numerosTope.length; i++) {
                numerosTope[i]=(int)Math.round(0);
            System.out.println(i);
        }
    }
}
