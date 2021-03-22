import java.util.Scanner;

public class PiramideAsteriscos2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número");
        int numfilas=sc.nextInt();
        int espacios=numfilas-1;
        int asteriscos=1;
        for (int i=0; i < numfilas; i++) {
            for (int j = 0; j < espacios; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < asteriscos; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < espacios; j++) {
                //System.out.print(" ");
            }
            System.out.println(" ");
            espacios--;
            asteriscos += 2;
        }
    }
}
