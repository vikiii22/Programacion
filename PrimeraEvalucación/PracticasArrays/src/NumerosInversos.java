import javax.swing.*;

public class NumerosInversos {
    public static void main(String[] args) {


        //Entregar (copiar y pegar el código) un
        // programa que lea tres números enteros del usuario y los muestre en orden inverso al introducido.

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Dime 1 número"));
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Dime 1 número"));
        int numero3 = Integer.parseInt(JOptionPane.showInputDialog("Dime 1 número"));

        System.out.print(numero);
        System.out.print(numero2);
        System.out.print(numero3);
        System.out.println("");

        System.out.println("------------------");
        if (numero == numero){
            System.out.print(numero3);
        } if (numero2 == numero2){
            System.out.print(numero2);
        }if (numero3 == numero3){
            System.out.print(numero);
        }
        System.out.println("");
        System.out.println("------------");

    }
}
