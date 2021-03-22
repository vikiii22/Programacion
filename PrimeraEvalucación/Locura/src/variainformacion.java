import javax.swing.*;
import java.awt.*;

public class variainformacion {
    public static void main(String[] args) {
        //mostrar varias variables a la vez en ShowMessage
        String nombre= JOptionPane.showInputDialog("¿Nombre?");
        int edad=Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));
        String provinciacadena= JOptionPane.showInputDialog(
                "Provincia? (A)licante (V)alencia (C)astellón (O)tra");
        char inicialProvincia=provinciacadena.charAt(0);
        //Liamos
        String provincia=inicialProvincia=='A'?"Alicante":(
                inicialProvincia=='V'?"Valencia":(
                        inicialProvincia=='C'?"Castellón":"Otra"));
        String salida="<html><h1>"+nombre+"</h1> "+edad+" "+provincia;
        JOptionPane.showMessageDialog(null, salida);
    }
}
