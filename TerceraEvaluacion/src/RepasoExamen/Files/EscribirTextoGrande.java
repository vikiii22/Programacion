package RepasoExamen.Files;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirTextoGrande {
    public static void main(String[] args) {
        String frase=JOptionPane.showInputDialog("Introduce texto");
        try (BufferedWriter writer=new BufferedWriter(new FileWriter("ejemplo.txt", true))){
            for (int i = 0; i < 10; i++) {
                writer.write(frase);
                writer.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
