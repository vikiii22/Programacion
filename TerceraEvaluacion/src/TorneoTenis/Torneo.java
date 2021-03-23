package TorneoTenis;

import java.util.Scanner;

public class Torneo {
   public static void main(String[] args) {
        String [] nombres=new String[8];
        Scanner sc=new Scanner(System.in);

        for (int i = 1; i < nombres.length+1; i++) {
            System.out.println("Jugador "+ i +": ");
            nombres[i-1]=sc.nextLine();
        }

        System.out.println("Ronda 1");
        System.out.println("a."+nombres[0] + " - " + "b."+nombres[1]);
        String ganador1=sc.nextLine();

        System.out.println("a."+nombres[2] + " - " + "b."+nombres[3]);
        String ganador2 = sc.nextLine();

        System.out.println("a."+nombres[4] + " - " + "b."+nombres[5]);
        String ganador3 = sc.nextLine();

        System.out.println("a."+nombres[6] + " - " + "b."+nombres[7]);
        String ganador4 = sc.nextLine();


        System.out.println("Ronda 2");
        if (ganador1.equals("a")){
            ganador1=nombres[0];
        }else if (ganador1.equals("b")){
            ganador1=nombres[1];
        }

        if (ganador2.equals("a")){
           ganador2=nombres[2];
        }else if (ganador2.equals("b")){
            ganador2=nombres[3];
        }

        if (ganador3.equals("a")){
            ganador3=nombres[4];
        }else if (ganador3.equals("b")){
            ganador3=nombres[5];
        }

        if (ganador4.equals("a")){
            ganador4=nombres[6];
        }else if (ganador4.equals("b")){
            ganador4=nombres[7];
        }

        System.out.println("a."+ganador1 + " - " + "b."+ganador2);
        String finalista1=sc.nextLine();

        System.out.println("a."+ganador3 + " - " + "b."+ganador4);
        String finalista2=sc.nextLine();

        if (finalista1.equals("a")){
            finalista1=ganador1;
        }else if (finalista1.equals("b")){
            finalista1=ganador2;
        }

        if (finalista2.equals("a")){
            finalista2=ganador3;
        }else if (finalista2.equals("b")){
            finalista2=ganador4;
        }

        System.out.println("Final");
        System.out.println("a." + finalista1 + " - " + "b." + finalista2);
        String campeon=sc.nextLine();

        if (campeon.equals("a")){
            campeon=finalista1;
        }else if (campeon.equals("b")){
            campeon=finalista2;
        }

        System.out.println("EL GANADOR ES..... "+campeon+"!!");
    }
}
