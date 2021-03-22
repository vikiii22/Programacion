package JColorChooser;

import javax.swing.*;
import java.awt.*;

public class Practica_Clase {
    static JLabel figurita;
    static JButton boton;
    public static void main(String[] args) {


        JPanel panel=new JPanel();
        JFrame ventana=new JFrame();

        GridBagConstraints lugarEstrellita=new GridBagConstraints();
        lugarEstrellita.gridx=0;
        lugarEstrellita.gridy=0;
        figurita=new JLabel("✭");
        figurita.setFont(new Font("Sans serif", Font.PLAIN, 150));
        panel.add(figurita,lugarEstrellita);

        GridBagConstraints lugarBoton=new GridBagConstraints();
        lugarBoton.gridx=0;
        lugarBoton.gridy=1;
        boton=new JButton("Cambia mi color");
        panel.add(boton,lugarBoton);
        boton.addActionListener(e -> figurita.setForeground(JColorChooser.showDialog(null, "color?", Color.BLUE)));

        ventana.add(panel);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);
        ventana.pack();
        ventana.setVisible(true);
    }
}
