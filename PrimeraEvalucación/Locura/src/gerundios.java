import javax.swing.*;

public class gerundios {
    public static void main(String[] args) {
        String introducepalabra= JOptionPane.showInputDialog("Introduce una palabra");
        char finalpalabra=introducepalabra.charAt(introducepalabra.length()-1);
        String finaldepalabra=finalpalabra=='g'?"Es gerundio":"no es gerundio";
        JOptionPane.showMessageDialog(null, finaldepalabra);
    }
}
