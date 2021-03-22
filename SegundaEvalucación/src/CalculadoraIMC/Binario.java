package CalculadoraIMC;

import java.util.Scanner;

public class Binario {
    public static void main(String[] args) {
        int numeroEntero;
        int consigueDecimal=2;
        int consigueDivision=2;

        Scanner sc=new Scanner(System.in);
        System.out.println("Dime un número");
        numeroEntero= sc.nextInt();

        int entero=numeroEntero/consigueDivision;
        int decimal=entero%consigueDecimal;
        System.out.println(entero+""+decimal);
    }
}
