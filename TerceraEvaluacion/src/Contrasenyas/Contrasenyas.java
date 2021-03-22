package Contrasenyas;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Contrasenyas {
    public static void main(String[] args) {
        String frase = null;
        Scanner sc=new Scanner(System.in);
        System.out.println("Añade una frase");
        frase=sc.nextLine();
        String[][] diccionario={{"a", "4"}, {"e", "3"}, {"i", "1"}, {"t", "7"}, {"g", "9"}, {"s", "2"}, {".", "!"}, {"o", "0"}};

        System.out.println("Frase");
        for (String[] d:diccionario) {
            frase=frase.replace(d[0], d[1]);
        }
        System.out.println(frase);

        /*Me falta hacer que se elija las veces que hace el cambio*/
        int n=0;
        System.out.println("Dime un numero de veces");
        n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(diccionario[i][j]);
            }
        }
        System.out.println(frase);
    }
}
