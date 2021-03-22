import javax.swing.*;

public class textoanumero {
    public static void main(String[] args) {
        String notatexto= JOptionPane.showInputDialog("¿Nota?");
        int notanumero = 0;
        switch (notatexto){
            case "uno":notanumero=1;
            break;
            case "dos":notanumero=2;
            break;
            case "tres":notanumero=3;
            break;
            default:JOptionPane.showMessageDialog(null, "No te he entendido.");
        }
        JOptionPane.showMessageDialog(null,"La nota es un "+notanumero);
    }
}
