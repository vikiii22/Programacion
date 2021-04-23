package Ficheros;

import java.io.File;

public class DIRRecursivo {
    public static void main(String[] args) {
        File directorio=new File("Ficheros");
        for (File f:directorio.listFiles()) {
            if (f.isFile()) System.out.println(f.getName());
            else {
                System.out.println("Directorios: " + f.getName());
                for (File dentro:f.listFiles()) {
                    System.out.println(dentro.getName());
                }
            }
        }
    }
}
