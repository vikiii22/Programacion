import javax.swing.*;
import java.util.Scanner;

public class notasaletras {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime la nota");
        int numero=sc.nextInt();
        System.out.println("La nota es "+ numero);
        if(numero<5){
            System.out.println("Insuficiente");
        } else if(numero==5){
            System.out.println("Suficiente");
        } else if(numero==6){
            System.out.println("bien");
        } else if (numero==7 || numero==8){
            System.out.println("Notable");
        }else if (numero==9 || numero==10){
            System.out.println("Sobresaliente");
        }
    }
}
