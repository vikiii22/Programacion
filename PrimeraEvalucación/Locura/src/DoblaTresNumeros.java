import javax.swing.*;

public class DoblaTresNumeros {
    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Primero?"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Segundo?"));
        int n3=Integer.parseInt(JOptionPane.showInputDialog("Tercero?"));
        int dobleN1=n1*2;
        int dobleN2=n2*2;
        int dobleN3=n3*2;
        String salida=""+dobleN1+dobleN2+dobleN3;
        String otrasalida="El doble de "+n1+" es:"+dobleN1+"\n";
        String otrasalida2="El doble de "+n2+" es:"+dobleN2+"\n";
        String otrasalida3="El doble de "+n3+" es:"+dobleN3+"\n";
        JOptionPane.showMessageDialog(null, otrasalida);
        JOptionPane.showMessageDialog(null, otrasalida2);
        JOptionPane.showMessageDialog(null, otrasalida3);

    }
}
