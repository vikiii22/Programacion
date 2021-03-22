import javax.swing.*;

public class DosNumerosMayores {
    public static void main(String[] args) {
        int n1;
        int n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
        n2 = n1;
        while (n1 != 0) {
            n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un número"));
            if (n1 > n2) {
                System.out.println("El número mayor es " + n1);
                System.out.println("El segundo número mayor es " + n2);
                n2=n1;
            }
        }
    }
}
