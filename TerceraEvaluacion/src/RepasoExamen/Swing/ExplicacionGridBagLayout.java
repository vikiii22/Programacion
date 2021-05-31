package RepasoExamen.Swing;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ExplicacionGridBagLayout {
    public static void main(String[] args) {
        JFrame ventana=new JFrame();
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel=new JPanel(new GridBagLayout());
        GridBagConstraints c=new GridBagConstraints();
        c.fill=GridBagConstraints.HORIZONTAL;
        c.gridx=0;
        c.gridy=0;
        c.gridwidth=2;
        c.insets=new Insets(5,5,5,5);
        JLabel titulo=new JLabel("Dashboard");
        titulo.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(titulo,c);
        GridBagConstraints c2=new GridBagConstraints();
        c2.gridx=0;
        c2.gridy=1;
        panel.add(new JLabel("Naame"), c2);
        c.gridx=1;
        c.gridy=1;
        c.gridwidth=1;
        JTextField texto=new JTextField(10);
        panel.add(texto,c);
        c.gridx=0;
        c.gridy=2;
        c.gridwidth=2;
        JButton boton=new JButton("Púlsame");
        panel.add(boton,c);
        boton.addActionListener(e -> System.out.println(texto.getText()));

        ventana.add(panel);
        ventana.setLocationRelativeTo(null);
        ventana.pack();
        ventana.setVisible(true);

        /*Path archivo=Paths.get("nombres.txt");
        Charset charset= StandardCharsets.UTF_8;
        List<String> misLienas=new ArrayList<>();
        try {
            misLienas.add(texto.getText());
            Files.write(archivo, misLienas, charset);
            for (int i = 0; i < 200; i++) {
                misLienas.add(texto.getText());
            }
        }catch (IOException e){
            System.out.println(e);
        }*/
    }
}
