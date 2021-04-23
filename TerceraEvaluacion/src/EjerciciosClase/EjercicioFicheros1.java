package EjerciciosClase;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class EjercicioFicheros1 {
    public static void main(String[] args) throws IOException {
        JFileChooser fc=new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int elegido= fc.showOpenDialog(fc);

        if (elegido==JFileChooser.APPROVE_OPTION){
            System.out.println("Has elegido el directorio con:" + fc.getSelectedFile().getTotalSpace());
        }
        long tamanyo=0;
        String nombreMayor="";
        for (File s:fc.getSelectedFile().listFiles()){
            long i=s.getTotalSpace();
            if (tamanyo < i){
                nombreMayor=s.getName();
            }
            }
        JOptionPane.showMessageDialog(null, "El mayor es " + nombreMayor);
    }
}
