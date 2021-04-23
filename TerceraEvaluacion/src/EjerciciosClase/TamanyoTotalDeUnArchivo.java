package EjerciciosClase;

import java.io.File;

public class TamanyoTotalDeUnArchivo {
    static long total=0;
    static long ocupa=0;
    public static void main(String[] args) {
        File directorio=new File("D:\\josev\\Documents\\1ºDAM");
        tamanyo(directorio);
    }

    private static void tamanyo(File directorio){
        for (File f:directorio.listFiles()){
            if (f.isDirectory()){
                ocupa=f.getTotalSpace();
            }else{
                total=f.length();
            }
        }
        System.out.println("Los archivos ocupan: " + total);
        System.out.println("El directorio ocupa "+ ocupa + " bytes");
    }
}
