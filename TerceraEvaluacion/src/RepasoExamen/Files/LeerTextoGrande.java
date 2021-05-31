package RepasoExamen.Files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerTextoGrande {
    public void largo(String archivo){
        File fichero=null;
        FileReader fr=null;
        try {
            fichero=new File(archivo);
            fr=new FileReader(fichero);
            BufferedReader reader=new BufferedReader(fr);
            String linea;
            while ((linea=reader.readLine())!=null){
                System.out.println("Linea: " + linea);
            }
            reader.close();
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            try {
                if (null != fr){
                    fr.close();
                }
            }catch (Exception e2){
                e2.printStackTrace();
            }
        }
    }

    public void corto(String texto){
        try (BufferedReader reader=new BufferedReader(new FileReader(texto))){
            String lineaLeida;
            while ((lineaLeida=reader.readLine())!=null){
                System.out.println("Línea: " + lineaLeida);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        LeerTextoGrande ltg=new LeerTextoGrande();
        ltg.largo("caminante.txt");
        System.out.println("-----------------------------------");
        ltg.corto("caminante.txt");
    }
}
