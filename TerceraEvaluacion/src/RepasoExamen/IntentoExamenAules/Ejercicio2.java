package RepasoExamen.IntentoExamenAules;

import javax.swing.*;
import java.awt.*;
import java.io.Closeable;

public class Ejercicio2 {
    public static void main(String[] args) {
        JFrame ventana=new JFrame("Ejercicio 2");
        JLabel label=new JLabel("Introduzca su nombre:");
        JTextArea texto=new JTextArea(1,20);
        JButton boton=new JButton("Cerrar");
        ventana.setLayout(new GridLayout(2,2));

        ventana.add(label);
        ventana.add(texto);
        ventana.add(boton);

        boton.setBackground(Color.green);
        texto.setFont(Font.getFont("arial"));
        
        boton.addActionListener(e -> System.out.println("El nombre introducido es: "+texto.getText()));
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.pack();
    }
}
