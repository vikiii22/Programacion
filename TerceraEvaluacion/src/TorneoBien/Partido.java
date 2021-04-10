package TorneoBien;

import javax.swing.*;
import java.awt.*;

public class Partido {
    protected String jugador1;
    protected String jugador2;

    protected final JButton boton1;
    protected final JButton boton2;
    protected final JPanel panel;

    Ronda ronda;
    public Partido(Ronda ronda){
        this.ronda=ronda;
        boton1=new JButton("???????");
        boton2=new JButton("???????");
        boton1.addActionListener(e -> ganaJugador1());
        boton2.addActionListener(e -> ganaJugador2());
        jugador1=null;
        jugador2=null;
        panel=new JPanel();
        inicializaPanel();
    }

    private void ganaJugador1(){
        boton2.setEnabled(false);
        boton1.setEnabled(false);
        //ronda.gana(jugador1);
        boton1.setBackground(new Color(200, 255, 0));
        boton1.setForeground(new Color(20, 20, 20));
    }

    private void ganaJugador2(){
        boton2.setEnabled(false);
        boton1.setEnabled(false);
        //ronda.gana(jugador1);
        boton2.setBackground(new Color(200, 255, 0));
        boton2.setForeground(new Color(20, 20, 20));
    }

    public String getJugador1() {
        return jugador1;
    }

    public String getJugador2() {
        return jugador2;
    }

    public JButton getBoton1() {
        return boton1;
    }

    public JButton getBoton2() {
        return boton2;
    }

    public JPanel getPanel() {
        return panel;
    }

    private void inicializaPanel() {
        boton1.setEnabled(false);
        boton2.setEnabled(false);
        panel.setLayout(new GridLayout(3,0));
        panel.add(boton1);
        JLabel etiqueta=new JLabel("VS");
        etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(etiqueta);
        //panel.add(new Label("vs"));
        panel.add(boton2);
        panel.setBorder(BorderFactory.createTitledBorder("Partido"));
    }

    public void anyadeJugador(String jugador){
        if (jugador1==null){
            jugador1=jugador;
            boton1.setEnabled(true);
            boton1.setText(jugador);
        }else if (jugador2==null){
            jugador2=jugador;
            boton2.setEnabled(true);
            boton2.setText(jugador);
        }else {
            throw new IllegalStateException("No se puede añadir otro jugador");
        }
    }

    public static void main(String[] args) {
        JFrame ventana=new JFrame("Partido Suelto");
        JPanel temp=new JPanel(new GridLayout(0,1));
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.add(temp);
        Partido p =new Partido(null);
        temp.add(p.getPanel());
        p.anyadeJugador("Nadal");
        p.anyadeJugador("Federer");
        Partido p2=new Partido(null);
        temp.add(p2.getPanel());
        p2.anyadeJugador("Carlos");
        p2.anyadeJugador("JJ");
        Partido p3=new Partido(null);
        temp.add(p3.getPanel());
        Partido p4 =new Partido(null);
        temp.add(p4.getPanel());
        //ventana.add(p.getPanel());


        ventana.pack();
        ventana.setVisible(true);
        ventana.setLocationRelativeTo(null);
    }
}
