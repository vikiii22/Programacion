import javax.swing.*;

public class pruebaventanitascuenta {
    public static void main(String[] args) {
        String nombre= JOptionPane.showInputDialog("Nombre del titular");
        cuentabancaria c=new cuentabancaria(nombre);
        c.ingresar(500);
        c.imprimirdatosenpantalla();

    }
}
