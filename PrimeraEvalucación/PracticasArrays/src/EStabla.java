import javax.swing.*;

public class EStabla {
    public static void main(String[] args) {
        int [][] tabla= {
                {1,2,3},
                {2,0,1},
                {4,0,1},
                {0,0,1}
        };
        JOptionPane.showMessageDialog(null, EStabla.simpleHTML(tabla));
    }
    private static String simpleHTML (int[][] tabla) {
        String salida = "<html><table style='border:2px; border-color:white;'>";
        for (int[] fila : tabla) {
            salida += "<tr>";
            for (int n : fila) {
                salida += "<td style=:border:3px solid white;>" + n + "</td>";
            }
        }
        salida += "</tr>";
        return salida;
    }
}