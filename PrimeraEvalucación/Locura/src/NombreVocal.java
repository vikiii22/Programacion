import javax.swing.*;

public class NombreVocal {
    public static void main(String[] args) {
        String nombre;
        nombre= JOptionPane.showInputDialog("Dime tu nombre");
        char inicialnombre=nombre.charAt(0);
        boolean empiezaporvocal=inicialnombre=='A'
                            || inicialnombre=='E'
                            || inicialnombre=='I'
                            || inicialnombre=='O'
                            || inicialnombre=='U'
                            || inicialnombre=='a'
                            || inicialnombre=='e'
                            || inicialnombre=='i'
                            || inicialnombre=='o'
                            || inicialnombre=='u'
                            || inicialnombre=='á';
        String salida=empiezaporvocal?"Empieza por vocal":"Empieza por consonante";
        JOptionPane.showMessageDialog(null, salida);



    }
}
