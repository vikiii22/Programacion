package FicherosTexto;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class BuscadorClases {
    private static final File directorio=new File("..");
    public static void main(String[] args) {
        //Encontrar todos los archivos del directorio
        //Los ponemos en una lista
        //Esto nos lo aprendemos de memoria porque sale ne le examen alguna variacion
        //de este algoritmo recursivo.
        List<File> todosLosFicheros=recorre(directorio);

        //Nos quedamos con los .java
        List<File> soloJava=seleccionaPorExtension(todosLosFicheros, ".java");
        soloJava.forEach(System.out::println);
        //Para cada fichero que quede, leemos todas las líneas
        //Quedándonos con las líneas que tengan la palabra class
        //Imprimimos esas líneas
    }

    private static List<File> seleccionaPorExtension(List<File> todosLosFicheros, String s) {
        List<File> salida=new ArrayList<>();
        salida.forEach(f ->{
            if (f.getName().endsWith(s)){
                salida.add(f);
            }
        });

        return salida;
    }

    private static List<File> recorre(File directorio) {
        List<File>salida=new ArrayList<>();
        for (File f:directorio.listFiles()) {
            if (f.isDirectory()){
                    salida.addAll(recorre(f));
            }else{
                    salida.add(f);
            }
        }

        return salida;
    }
}
