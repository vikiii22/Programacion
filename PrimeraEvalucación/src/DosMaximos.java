import javax.swing.*;

public class DosMaximos {
    public static void main(String[] args) {
        int numerointroducido= Integer.parseInt(JOptionPane.showInputDialog("Número?"));
        int max=numerointroducido;
        int segundomax=numerointroducido;
        while (numerointroducido!=0){
            numerointroducido= Integer.parseInt(JOptionPane.showInputDialog("Número?"));
            if (numerointroducido>max){
                segundomax=max;
                max=numerointroducido;
            }else {
                segundomax=numerointroducido;
            }
        }
        JOptionPane.showMessageDialog(null, "El máximo es "+ max);
        JOptionPane.showMessageDialog(null, "El 2º máximo es "+ segundomax);
    }
}