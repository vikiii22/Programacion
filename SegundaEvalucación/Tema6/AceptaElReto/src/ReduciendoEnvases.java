import java.util.Scanner;

public class ReduciendoEnvases {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int veces=sc.nextInt();
        for (int i = 0; i < veces; i++) {
            int pesoneto1 = sc.nextInt();
            int pesobolsa1= sc.nextInt();
            int operacion=pesobolsa1 - pesoneto1;
            System.out.println(operacion);
        }
    }
}