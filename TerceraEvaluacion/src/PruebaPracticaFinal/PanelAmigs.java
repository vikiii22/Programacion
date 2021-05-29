package PruebaPracticaFinal;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/*public class PanelAmigs {
    public static final JPanel panel;
    List<MiBotonAmigo> botones;
    PanelAmigs() throws IOException {
        panel=new JPanel();
        //panel.setLayout(0,2);
        botones=new ArrayList<>();
        rellenaBotonesDeFichero();
        for (MiBotonAmigo m:botones) {
            panel.add(m.getBoton());
        }
    }

    private void rellenaBotonesDeFichero() throws IOException {
        List<String>lineas= Files.readAllLines(Paths.get("amigos.csv"));
        for (String s:lineas) {
            String[] campos=s.split(":");
            MiBotonAmigo nuevo=new MiBotonAmigo(campos[0], Integer.parseInt(campos[1]));
            botones.add(nuevo);
        }
    }

    public JPanel getPanel(){
        return panel;
    }

    public static void main(String[] args) throws IOException {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        PanelAmigs amigos=new PanelAmigs();

        frame.add(amigos.getPanel());

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

class MiBotonAmigo {
    public JButton getBoton(){
        return boton;
    }
    String nombre;
    JButton boton;
    int cantidad;

    public MiBotonAmigo(String nombre, int cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;
    }
}*/