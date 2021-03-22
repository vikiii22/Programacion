package CalculadoraIMC;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class CalculadoraIMC {
    static JTextField peso;
    static JTextField altura;
    static JFrame ventana;

    public static void main(String[] args) {
        ventana=new JFrame("Calculadora IMC");
        JPanel panel=new JPanel(new GridLayout(0,3,10,10));


        panel.setBorder(new EmptyBorder(10,10,10,10));
        panel.add(new JLabel("Peso: "));
        peso=new JTextField();
        panel.add(peso);
        panel.add(new JLabel("kg"));
        panel.add(new JLabel("Altura: "));
        altura=new JTextField();
        panel.add(altura);
        panel.add(new JLabel("Metro (Ejemplo 1.80)."));
        JButton boton=new JButton("Púlsame para calcular tu IMC");
        panel.add(boton);
        boton.addActionListener(e -> calcular());


        ventana.add(panel);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
    }
    private static void calcular(){
        double mipeso=Double.parseDouble(peso.getText());
        double mialtura=Double.parseDouble(altura.getText());
        double IMC=mipeso/(mialtura*mialtura);
        String salida=String.format("Tu IMC es: %.2f", IMC);
        JOptionPane.showMessageDialog(ventana,salida);
        String mensajeIMC="";
        if(IMC<18.5){
            mensajeIMC="Peso demasiado bajo";
        } else if(IMC<24.9){
            mensajeIMC="Peso normal";
        } else if(IMC<29.9){
            mensajeIMC="Pre-obesidad o Sobrepeso";
        } else if (IMC<34.9){
            mensajeIMC="Obesidad clase I";
        } else if(IMC<39.9){
            mensajeIMC="Obesidad clase II";
        } else {
            mensajeIMC="Obesidad morbida";
        }
        JOptionPane.showMessageDialog(ventana,mensajeIMC);
    }
}
