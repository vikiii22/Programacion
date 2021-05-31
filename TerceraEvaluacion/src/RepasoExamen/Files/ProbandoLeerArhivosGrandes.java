package RepasoExamen.Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ProbandoLeerArhivosGrandes {
    public static void main(String[] args) {
        try (BufferedReader reader=new BufferedReader(new FileReader("ejemplo.txt"))){
            String lineas;
            while ((lineas=reader.readLine())!=null){
                System.out.println(lineas);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
