package DatosFicheros;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class CrearOrdenadores {
    public static void main(String[] args) {
        Set<Ordenador> ordenadores = new HashSet<>();
        Ordenador ordenador1=new Ordenador("DFS5555474", 4096, 32, "Intel core I7");
        Ordenador ordenador2=new Ordenador("4512DSDF5", 2048, 16, "AMD Ryzen 1600x");

        ordenadores.add(ordenador1);
        ordenadores.add(ordenador2);

        try (FileOutputStream fos=new FileOutputStream("Ordenadores.1k", true);
             DataOutputStream dos=new DataOutputStream(fos);){
            for (Ordenador o:ordenadores) {
                dos.writeUTF(o.getNumeroSerie());
                dos.writeUTF(String.valueOf(o.getTamnyoDisco()));
                dos.writeUTF(String.valueOf(o.getTamanyoRAM()));
                dos.writeUTF(o.getCPU());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
