package Swing;

import javax.swing.*;
import java.awt.*;

public class EjercicioClase2 {
    static JTextField sueldo;
    static JTextField Nempleado;
    static JTextField horasTrabajadas;
    static JFrame ventana;
    public static void main(String[] args) {
        ventana = new JFrame("Empleado");
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel gridBag = new JPanel(new GridBagLayout());
        GridBagConstraints empleado = new GridBagConstraints();
        empleado.fill = GridBagConstraints.HORIZONTAL;
        empleado.gridx = 0;
        empleado.gridy = 0;
        empleado.gridwidth = 2;
        empleado.insets = new Insets(5, 5, 5, 5);

        gridBag.add(new JLabel("Nombre del empleado:"), empleado);
        empleado.gridx = 0;
        empleado.gridy = 1;
        Nempleado=new JTextField(10);
        gridBag.add(Nempleado, empleado);

        GridBagConstraints sueldoBasico = new GridBagConstraints();
        sueldoBasico.gridx = 4;
        sueldoBasico.gridy = 0;
        gridBag.add(new JLabel("Sueldo/hora"), sueldoBasico);
        sueldoBasico.gridx = 4;
        sueldoBasico.gridy = 1;
        sueldo=new JTextField(10);
        gridBag.add(sueldo, sueldoBasico);

        GridBagConstraints horas = new GridBagConstraints();
        horas.gridx = 0;
        horas.gridy = 4;
        gridBag.add(new JLabel("Horas trabajadas"), horas);
        horas.gridx = 0;
        horas.gridy = 5;
        horasTrabajadas = new JTextField(10);
        gridBag.add(horasTrabajadas, horas);


        GridBagConstraints boton = new GridBagConstraints();
        boton.gridx = 1;
        boton.gridy = 5;
        JButton botonCalculo = new JButton("Calcular");
        gridBag.add(botonCalculo, boton);

        GridBagConstraints salarioMensual = new GridBagConstraints();
        salarioMensual.gridx = 4;
        salarioMensual.gridy = 4;
        gridBag.add(new JLabel("Salario mensual"), salarioMensual);
        salarioMensual.gridx = 4;
        salarioMensual.gridy = 5;
        gridBag.add(new JTextField(10), salarioMensual);

        botonCalculo.addActionListener(e -> calcula());
        ventana.add(gridBag);
        ventana.setLocationRelativeTo(null);
        ventana.pack();
        ventana.setVisible(true);


    }

    private static void calcula() {
        double sueldocalculado=Double.parseDouble(sueldo.getText());
        double horitas=Double.parseDouble(horasTrabajadas.getText());
        double horaspagadas=sueldocalculado*horitas;
        String salida=Nempleado+", tiene un salario de: "+horaspagadas;
        JOptionPane.showMessageDialog(ventana, salida);

    }
}
