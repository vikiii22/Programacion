package HippieSwimg;

import javax.swing.*;
import java.awt.*;

public class PanelBotones extends JPanel {
    PanelBotones(){
        add(new JLabel("Fuente"));
        add(new JLabel("Fondo"));

    }

    enum Colores{
        AZUL("Azul", Color.BLUE),
        ROJO("Rojo", Color.RED
        );

        Colores(String nombre, Color color) {
            nombre=nombre;
        }
    }

    public static void main(String[] args) {
        JFrame ventana = new JFrame("Ventana");
        PanelBotones panelBotones=new PanelBotones();


        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //ventana.add(PanelBotones);
        ventana.setLocationRelativeTo(null);
        ventana.pack();
        ventana.setVisible(true);
    }
}
