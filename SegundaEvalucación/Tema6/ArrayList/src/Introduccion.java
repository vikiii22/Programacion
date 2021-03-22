import java.util.ArrayList;
import java.util.Scanner;

public class Introduccion {
    public static void main(String[] args) {
        ArrayList cadenas = new ArrayList();
        System.out.println(cadenas.size());
        cadenas.add("Esto mola");
        cadenas.add("Soy Zorman");
        cadenas.add("Ibai LLanos");
        System.out.println(cadenas);
        System.out.println(cadenas.indexOf("Esto mola"));
        System.out.println(cadenas.indexOf("Ibai LLanos"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un nombre");
        String nombre=sc.nextLine();
        if (cadenas.indexOf(nombre)==-1){
            System.out.println("El nombre no está");
        }else{
            System.out.println("El nombre si está");
        }
        if (cadenas.indexOf(nombre)==-1){
            Scanner nuevonombre = new Scanner(System.in);
            nuevonombre.nextLine();
            cadenas.add(nuevonombre);
            System.out.println("El nombre se ha añadido");
        }
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Dime un nombre");
        String nuevonombre=sc.nextLine();
        cadenas.add(nuevonombre);
        if (cadenas.indexOf(nombre)==-1){
            System.out.println("El nombre no está");
        }else{
            System.out.println("El nombre si está");
        }

    }
}
