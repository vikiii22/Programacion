import javax.swing.*;

public class PracticaBoolean {
    public static void main(String[] args) {
        String nombreCliente = JOptionPane.showInputDialog("¿Nombre?");
        String saludo = "Hola, "+nombreCliente+", encantado";
        JOptionPane.showMessageDialog(null, saludo);
        int EdadCliente=Integer.parseInt(JOptionPane.showInputDialog("¿Edad?"));
        boolean tieneSuficienteEdad=EdadCliente>=25;
        boolean seconcede=tieneSuficienteEdad;
        String concedido=seconcede?"Concedido, "+nombreCliente:"Lo siento";
        JOptionPane.showMessageDialog(null, concedido);
    }
}
