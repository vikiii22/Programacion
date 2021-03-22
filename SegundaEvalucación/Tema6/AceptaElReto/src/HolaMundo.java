import java.util.Scanner;

public class HolaMundo {
    public static void main(String[] args) {
        String p="Hola Mundo";
        Scanner sc =new Scanner(System.in);
        int veces= sc.nextInt();
        for (int i = 0; i < veces; i++) {
            System.out.println(p);
        }
    }
}
