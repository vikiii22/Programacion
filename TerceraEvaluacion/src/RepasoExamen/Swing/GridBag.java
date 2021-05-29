package RepasoExamen.Swing;

import javax.swing.*;
import java.awt.*;

public class GridBag {
    public static void main(String[] args) {
        MarcoCalculadora calc=new MarcoCalculadora();

    }
}

class MarcoCalculadora {
    JFrame ventana=new JFrame();
    public MarcoCalculadora(){
        ventana.setTitle("Mi calculadora");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        laminaCalculadora lam=new laminaCalculadora();
        ventana.add(lam.getLamina());

        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.pack();
    }
}

class laminaCalculadora{
    JPanel panel;
    JTextField text=new JTextField("0");
    public laminaCalculadora(){
        panel=new JPanel();
        text.setLayout(new BorderLayout());
        panel.add(text, BorderLayout.NORTH);
        panel2=new JPanel();
        anyadeNumeros();
        panel.add(panel2, BorderLayout.SOUTH);
        anyadeOperacion("+");
        anyadeOperacion("*");
        anyadeOperacion("-");
        anyadeOperacion("/");
    }

    public JPanel getLamina(){
        return panel;
    }
    public JPanel panel2;

    public JPanel anyadeNumeros(){
        panel2.setLayout(new GridLayout(5,3));
        int cantidad=10;
        for (cantidad = 1; cantidad<10 ; cantidad++) {
            JButton boton=new JButton(""+cantidad);
            boton.setPreferredSize(new Dimension(80,70));
            panel2.add(boton);
            int finalCantidad = cantidad;
            boton.addActionListener(e -> text.setText(""+ finalCantidad));
        }
        return panel2;
    }

    public void anyadeOperacion(String rotulo){
        JButton operacion=new JButton(rotulo);
        panel2.add(operacion, BorderLayout.SOUTH);
        operacion.addActionListener(e -> text.setText(""+operacion));
    }
}