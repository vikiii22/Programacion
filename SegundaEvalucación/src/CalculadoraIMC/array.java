package CalculadoraIMC;

import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        int[] numeros=new int[3];
        numeros[0]=2;
        numeros[1]=5;
        numeros[2]=4;
        Arrays.sort(numeros);
        for (int n:numeros) {
            System.out.println(n);
        }

        System.out.println("-------------------------------");

        int[][] tabla=new int[10][8];
        System.out.println(tabla[2].length);

        System.out.println("------------------------------");

    }
}
