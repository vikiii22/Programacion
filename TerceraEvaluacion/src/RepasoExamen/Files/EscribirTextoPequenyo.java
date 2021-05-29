package RepasoExamen.Files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EscribirTextoPequenyo {
    public static void main(String[] args) {
        Path archivo= Paths.get("archivo.txt");
        Charset palabras= StandardCharsets.UTF_8;
        List<String>lineas=new ArrayList<>();
        try {
            lineas.add("Hola me llamo Jose Luis");
            Files.write(archivo, lineas, palabras);
            for (int i = 0; i <= 200; i++) {
                lineas.add(""+i);
            }
            Files.write(archivo, lineas, palabras);
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
