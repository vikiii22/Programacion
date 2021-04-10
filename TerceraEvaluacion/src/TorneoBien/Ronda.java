package TorneoBien;

import javax.swing.*;
import java.awt.*;

public class Ronda {
    private final Partido[] partidos;
    private final JPanel panel;

    public JPanel getPanel() {
        return panel;
    }

    Ronda(int numeroPartidos){
        partidos=new Partido[numeroPartidos];
        panel=new JPanel(new GridLayout (0,1));
        for (int i = 0; i < partidos.length; i++) {
            //partidos[i]=new Partido();
            panel.add(partidos[i].getPanel());
        }
    }

    public static void main(String[] args) {
        JFrame ventana=new JFrame("Partido Suelto");
        JPanel temp=new JPanel(new GridLayout(1,0));
        ventana.add(temp);
        Ronda r=new Ronda(16);
        temp.add(r.getPanel());

        Ronda r1=new Ronda(8);
        temp.add(r1.getPanel());
        Ronda r2=new Ronda(4);
        temp.add(r2.getPanel());
        Ronda r3=new Ronda(1);
        temp.add(r3.getPanel());
        GanadorTorneo ganadorTorneo=new GanadorTorneo();
        temp.add(ganadorTorneo.getPanel());


        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}