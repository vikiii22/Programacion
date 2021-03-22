import javax.swing.*;

public class ESModelo {
    public static Modelo pideModeloVentana(){
        String marca=null;
        do {
            marca = JOptionPane.showInputDialog("¿Marca del coche?");
            if (marca == null){
                if(ESUtilidades.quiereSalir()){
                    return null;
                }
            }
        } while (marca==null);
        Tipo tipo=ESTipo.pideTipoVentana();
        int elegido=JOptionPane.showConfirmDialog(
                null,
                "¿Es todoterreno?",
                "Ciudad, Montaña...",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        boolean todoterreno=(elegido==0);
        return new Modelo(marca, tipo);
    }
    public static String CadenaModelo(Modelo modelo){
        String salida="";
        salida+="<h1>"+ modelo.getMarca()+"</h1>";
        Tipo tipo=modelo.getTipo();
        salida+=tipo.getCadena();
        return salida;
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "<html>"+CadenaModelo(pideModeloVentana()));
    }
}
