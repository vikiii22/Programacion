package Excepciones;

import java.util.Scanner;

public class PracticaExcepciones {
    public static int numero;

    public static void main(String[] args) {
        Menu menu=new Menu();
        PracticaExcepciones numero1=new PracticaExcepciones();
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un número entre 0 y 10");
        numero=sc.nextInt();
        
        menu.queQuieresParaComer();

    }

    public static class Menu{
        String menu;

        public void queQuieresParaComer() {
            if (numero > 5){
                System.out.println("Pasta");
            }else{
                System.out.println("Verduras");
            }
        }
    }
}
