import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Dime un número: ");
       int numero=sc.nextInt();
       int numero2=0;
       System.out.println("Tabla del " + numero);
        for (numero2 = 0; numero2 < 11; numero2++) {
            System.out.println(numero2 + " X " + numero +" = "+numero2*numero);
        }

    }
}
