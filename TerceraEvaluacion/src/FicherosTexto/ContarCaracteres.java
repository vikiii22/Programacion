package FicherosTexto;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ContarCaracteres {
    public static void main(String[] args) {
        try(BufferedReader lector=new BufferedReader(new FileReader(JOptionPane.showInputDialog("Añade una ruta:")))){
            int caracter;
            if (lector.readLine() != null){
                System.out.println("El ficheros existe");
            }else{
                System.out.println("No funciona");
            }
            while ((caracter=lector.readLine().length()) != 0){
                System.out.println(caracter);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
