import java.util.Scanner;

public class EjercicioGoogle2 {
    public static void main(String[] args) {
        System.out.println("Dime el primero número");
        Scanner sc=new Scanner(System.in);
        int numero1= sc.nextInt();
        System.out.println("Dime el segundo número");
        Scanner sc1=new Scanner(System.in);
        int numero2= sc.nextInt();

        if (numero1 > numero2){
            System.out.println("El mayor es: " + numero1);
        }if(numero1 < numero2){
            System.out.println("El mayor es: " + numero2);
        }
    }
}
