package Clasificador;

import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Clasificador {
    public static final File directorioBase=new File("D:\\clasificador");
    static int cantidadLetras;
    public static void main(String[] args) {
        List<File> listaFicheros=devuelveFicheros(directorioBase);
        listaFicheros.forEach(file -> System.out.println(file.getName()));
        Set<String> prefijos=new HashSet<>();
        listaFicheros.forEach(file -> prefijos.add(file.getName().substring(0, cantidadLetras)));

    }

    private static List<File> devuelveFicheros(File directorioBase) {
        List<File> ficheros=new ArrayList<>();
        for (File f:directorioBase.listFiles()) {
            if (f.isFile()){
                ficheros.add(f);
            }else{
                ficheros.addAll(devuelveFicheros(f));
            }
            System.out.println(cantidadLetras = f.getName().length());
        }
        return ficheros;
    }
}
