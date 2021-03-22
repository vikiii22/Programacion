import javax.swing.*;

public class CadenaDivididaExamen {
    public static void main(String[] args) {
        String federico= "Los manines de Mr.Robot";
        //int cadena=Integer.parseInt(JOptionPane.showInputDialog("Introduce una cadena"));
        int longitud=Integer.parseInt(JOptionPane.showInputDialog("Longitud?"));
        int yaescritosenlinea=0;
        for (int i=0; i < federico.length() ; i++){
            System.out.print(federico.charAt(i));
            yaescritosenlinea++;
            if (yaescritosenlinea==longitud) {
                System.out.println();
                yaescritosenlinea=0;
            }
        }
    }
}