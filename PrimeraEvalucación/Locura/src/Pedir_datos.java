import java.util.Scanner;

public class Pedir_datos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Introduce tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Buenos Días " + nombre);
    }
}
