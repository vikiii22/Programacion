import javax.swing.*;

public class asteriscos {
    public static void main(String[] args) {
        String asterisco="<html><div align=center></div><br/>";
        int lineasAsteriscos = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de líneas que deseas de asteríscos."));
        for (int i = 0; i<lineasAsteriscos;i++){
            for (int w = -1; w<i ;w++){
                asterisco+="*";
            }
            asterisco+="<br>";
        }
        asterisco+="</a></div></html>";
        System.out.print(asterisco);
        JOptionPane.showMessageDialog(null, asterisco);
    }
}

