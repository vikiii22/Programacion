package RepasoExamen.Files;

import java.io.File;

public class EjemploFile {
    public static void main(String[] args) {
        File ejemplo= new File("ejemplo.txt");
        System.out.println(ejemplo.getTotalSpace());
    }
}
