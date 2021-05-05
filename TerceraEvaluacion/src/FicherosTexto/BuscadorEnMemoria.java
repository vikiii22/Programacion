package FicherosTexto;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class BuscadorEnMemoria {
    private static final File directorio=new File("..");
    public static void main(String[] args) {
        List<File> ficherosJava=recorre(directorio, ".java");
    }

    private static List<File> recorre(File directorio, String s) {
        List<File> salida=new ArrayList<>();
        for (File f:directorio.listFiles()) {
            if (f.isDirectory()){
                salida.addAll(recorre(f, s));
            }else {
                salida.add(f);
            }
        }

        return salida;
    }
}
