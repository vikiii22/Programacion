package Swing;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class IMC {
    static JTextField peso;
    static JTextField altura;
    static JFrame ventana;
    public static void main(String[] args) {

        ventana = new JFrame("IMC");
        JPanel panel = new JPanel(new GridLayout(0,3, 10, 10));
        panel.setBorder(new EmptyBorder(10,10,10,10));
        JButton calcular = new JButton("Calcular");
        panel.add(new JLabel("Peso: "));
        peso = new JTextField();
        panel.add(peso);
        panel.add(new JLabel("KG"));
        panel.add(new JLabel("Altura: "));
        altura = new JTextField();
        panel.add(altura);
        panel.add(new JLabel("CM (ej 180)"));
        panel.add(calcular);
        calcular.addActionListener(e -> calcula());

        ventana.add(panel);
        ventana.setLocationRelativeTo(null);
        ventana.pack();
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.setVisible(true);
    }
    private static void calcula(){
        double mipeso=Double.parseDouble(peso.getText());
        double mialtura=Double.parseDouble(altura.getText())/100.0;
        double IMC=mipeso/(mialtura*mialtura);
        String salida="Tu IMC es "+IMC;
        JOptionPane.showMessageDialog(ventana, salida);
    }
}
