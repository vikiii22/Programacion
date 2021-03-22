import javax.swing.*;

public class ESUtilidades {
    public static boolean quiereSalir() {
        int elegido = JOptionPane.showConfirmDialog(
                null,
                "¿Quiere salir?",
                "Confirmar",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        return elegido == 0;
    }

    public static void main(String[] args) {
        System.out.println(quiereSalir());
    }
}
