package POO;

import java.util.Scanner;

public class UsoCoche {
    public static void main(String[] args) {
        /*int[] coche= new int[8];

        for (int i = 0; i < coche.length; i++) {
            Coche coche1=new Coche(4, 2, 2, 3600, 1220);
            System.out.println(coche1 + "Coche: "+i);
        }*/

        Coche mio=new Coche();
        System.out.println(mio);
        mio.estableceColor("Rojo");
        System.out.println(mio + " tiene el color: " +mio.verColor());

        Coche suPutaMadre=new Coche();
        suPutaMadre.ponmeNombre("Me cago en la hostia");
        suPutaMadre.estableceColor("negro de la flipar");
        System.out.println("El coche "+ suPutaMadre.miraMiNombre() + " tiene un color " + suPutaMadre.verColor() + " y tiene " + suPutaMadre);
    }
}
