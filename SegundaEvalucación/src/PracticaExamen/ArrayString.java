package PracticaExamen;

import javax.swing.*;
import java.util.Arrays;

public class ArrayString {
    public static void main(String[] args) {
        String paises[]=new String[8];

        /*for (int i=0; i < paises.length; i++){
            System.out.println(paises[i]);
        }

        System.out.println("-----------------------------------");
        Arrays.sort(paises);
        for (int i=0; i < paises.length; i++){
            System.out.println(paises[i]);
        }
        System.out.println("---------------------------------");*/
        for (int i=0; i< paises.length;i++){
            paises[i]=JOptionPane.showInputDialog("Introduce un país: "+ (i+1));
        }
        for(String s:paises){
            System.out.println(s);
        }
    }
}
