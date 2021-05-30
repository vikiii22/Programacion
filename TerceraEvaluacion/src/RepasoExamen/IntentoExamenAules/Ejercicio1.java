package RepasoExamen.IntentoExamenAules;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public void enlaza(String s, String s1){
        Path path= Paths.get(s);
        Charset charset= StandardCharsets.UTF_8;
        List<String> lineas = new ArrayList<>();
        try{
            lineas= Files.readAllLines(path, charset);
            for (String l:lineas) {
                System.out.println(l);
            }
        }catch (IOException e) {
            System.out.println(e);
        }
        Path archivo= Paths.get(s1);
        Charset palabras= StandardCharsets.UTF_8;
        List<String>lineas2=new ArrayList<>();
        try {
            for (String l:lineas) {
                //char pos=l.charAt(l.length());
                char pos2=l.charAt(0);
                lineas2.add(l);
                lineas2.add(l+pos2);
            }
            Files.write(archivo, lineas2, palabras);
        }catch (IOException e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Ejercicio1 ej1=new Ejercicio1();
        ej1.enlaza("origen.txt", "destino.txt");
    }
}
