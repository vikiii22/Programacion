import java.util.Scanner;

public class ejemploswitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Dime una nota");
        int nota=sc.nextInt();
        String salida="";
        switch (nota){
            case 1:
                System.out.println("Uno");
                break;
            case 2:
                System.out.println("Dos");
                break;
            case 3:
                System.out.println("Tres");
                break;
            case 4:
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            default:salida="No reconocido";
        }
        String notaescrita="";
        switch (nota){
            case 0:
            case 1:
            case 2:
            case 3:
            case 4: notaescrita="Insfuciente";
            break;
            case 5: notaescrita="Suficiente";
            break;
            case 6: notaescrita="Bien";
            break;
            case 7: notaescrita="Notable";
            break;
            case 8: notaescrita="Notable";
            break;
            case 9: notaescrita="Sobresaliente";
            break;
            case 10: notaescrita="Sobresaliente";
            break;
            default:notaescrita="No reconocido";
            break;
        }
        System.out.println("La nota es: " + salida);
        System.out.println("La nota escrita es " + notaescrita);
    }
}
