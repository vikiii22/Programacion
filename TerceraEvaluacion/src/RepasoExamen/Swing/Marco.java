package RepasoExamen.Swing;

import javax.swing.*;
import java.awt.*;

public class Marco {
    JFrame ventana=new JFrame("Federico");

    public Marco(){
        ventana.setSize(500,300);
    }

    JButton boton=new JButton();

    public JButton miBoton(){
        boton.setText("Púlsame");
        boton.addActionListener(e -> System.out.println("Este botón funciona"));
        return boton;
    }

    public static void main(String[] args) {
        JPanel panel=new JPanel(new GridBagLayout());

        Marco m1=new Marco();

        m1.ventana.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        m1.ventana.add(m1.miBoton());
        m1.ventana.setLayout(new GridLayout(2,1));
        m1.ventana.setLocationRelativeTo(null);
        m1.ventana.setVisible(true);
        //m1.ventana.pack();
    }
}
