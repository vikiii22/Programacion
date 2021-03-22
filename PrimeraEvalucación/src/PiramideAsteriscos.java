import java.util.Scanner;

public class PiramideAsteriscos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numfilas = sc.nextInt();
        numfilas++;
        System.out.println();

        for (int altura = 0; altura < numfilas; altura++){
            System.out.println();
            for (int espacio = 1; espacio <= numfilas-altura; espacio++){
                System.out.print("  ");
            }
        for (int asteriscos = 1; asteriscos <= (altura*2)-1; asteriscos++){
            System.out.print("*");
        }
            System.out.print(" ");
        }
    }
}