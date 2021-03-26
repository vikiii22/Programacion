package TorneoBien;

import javax.swing.*;
import java.awt.*;

public class GanadorTorneo {
    private final JPanel panel;
    private final JButton ganador;

    public GanadorTorneo(){
        panel=new JPanel(new GridLayout(1,0));
        ganador=new JButton("\uD83C\uDFC6");
        ganador.setEnabled(false);
        panel.add(ganador);
        panel.setBorder(BorderFactory.createTitledBorder("Vencedor"));
    }

    public JPanel getPanel() {
        return panel;
    }


    public void setGanador(String ganador) {
        this.ganador.setText(ganador);
    }
}
