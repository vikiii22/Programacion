import javax.swing.*;
import java.util.Scanner;

public class Saludo {//Fiesta aburrida ejercicio repaso
    public static void main(String[] args) {
        int veces;
        String nombre=null;
        Scanner sc = new Scanner(System.in);
        veces = sc.nextInt();
        for (int i = 0; i < veces; i++) {
            Scanner name=new Scanner(System.in);
            nombre = name.nextLine();
            nombre=nombre.substring(0);
            System.out.println("Hola, " + nombre+".");
        }
    }
}
