package RepasoExamen.Files;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LeerTextoPequenyo {
    public static void main(String[] args) {
        Path path=Paths.get("caminante.txt");
        Charset charset=StandardCharsets.UTF_8;
        List<String> lineas = new ArrayList<>();
        try{
            lineas=Files.readAllLines(path, charset);
            for (String l:lineas) {
                System.out.println(l);
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
