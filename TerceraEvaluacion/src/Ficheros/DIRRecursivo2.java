package Ficheros;

import java.io.File;

public class DIRRecursivo2 {
    public static void main(String[] args) {
        File directorio=new File("Ficheros");
        //devuelveListaFicheros(directorio);
    }

    private static void devuelveListaFicheros(File p, int nivel) {
        String salida="";
        for (File f:p.listFiles()) {
            if (f.isFile()) salida+= "\n"+f.getName();
            else {
                salida+="\nDirectorio: " + f.getName()+"\n";
                //salida+=devuelveListaFicheros(f,nivel+1);
            }
        }
    }
}
