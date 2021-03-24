package POO;

import java.util.Scanner;

public class PruebaEjemplo {
    public static void main(String[] args) {
        System.out.println("Dime que cantidad de palabras quieres juntar");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        String[] palabras=new String[x];

        for (int i = 0; i < palabras.length; i++) {
            System.out.println("Dime palabras");
            palabras[i]=sc.nextLine();
        }
        for (String s:palabras){
            System.out.print(s+" ");
        }
    }
}
