import javax.swing.*;

public class ESTipo {
    public static Tipo pideTipoVentana() {
        Tipo[] tipo = Tipo.values();
        Tipo elegido = null;
        while (elegido == null)
            elegido = (Tipo) JOptionPane.showInputDialog(null,
                    "¿Cuál es el tipo de coche?",
                    "Tipo",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    tipo,
                    tipo[0]);
            return elegido;
        }


        public static String cadenaTipo (Tipo tipo){
            return "Tipo:" + tipo + "";
        }

        public static void main (String[]args){
            JOptionPane.showMessageDialog(null, cadenaTipo(pideTipoVentana()));
     }
}
