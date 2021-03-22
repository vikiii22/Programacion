package PruebaSwimg;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class PruebaSwimg3 {
    static JButton anyadir;
    static JButton borrar;
    static JLabel respuesta;
    public static void main(String[] args) {
        JFrame ventana = new JFrame("Parte 2");
        JPanel panel=new JPanel();
        panel.setBorder(new EmptyBorder(10,10,10,10));
        panel.setLayout(new GridBagLayout());

        JTextField nombre=new JTextField(20);
        GridBagConstraints LNombre=new GridBagConstraints();
        LNombre.gridx=1;
        LNombre.gridy=0;
        panel.add(nombre,LNombre);


        anyadir=new JButton("Púlsame");
        GridBagConstraints LBoton=new GridBagConstraints();
        LBoton.gridx=1;
        LBoton.gridy=1;
        panel.add(anyadir,LBoton);

        borrar=new JButton("Borrar");
        GridBagConstraints lugarBorrar = new GridBagConstraints();
        lugarBorrar.gridx=2;
        lugarBorrar.gridy=1;
        panel.add(borrar,lugarBorrar);


        respuesta=new JLabel("");
        GridBagConstraints LNnombre = new GridBagConstraints();
        LNnombre.gridx=1;
        LNnombre.gridy=2;
        panel.add(respuesta, LNnombre);

        List<String> nombres=new ArrayList<>();
        anyadir.addActionListener(e -> {
            nombres.add(nombre.getText());
            String salida=String.join(", ", nombres);
            respuesta.setText(salida);
        });

        borrar.addActionListener(e -> {
            nombres.remove(nombre.getText());
            String salida=String.join(", ", nombres);
            respuesta.setText(salida);
        });

        ventana.add(panel);
        ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        ventana.pack();
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);


    }
}