package DatosFicheros;

import java.io.*;

public class LeerOrdenadores {
    public static void main(String[] args) {
        try {
            try (FileInputStream fis=new FileInputStream("Ordenadores.1k");
                 DataInputStream dis=new DataInputStream(fis);){
                while (true){
                    String numeroSerie=dis.readUTF();
                    int tamanyoDisco=dis.readInt();
                    int tamanyoRAM=dis.readInt();
                    String CPU= dis.readUTF();
                    Ordenador o = new Ordenador(numeroSerie, tamanyoDisco, tamanyoRAM, CPU);
                    System.out.println(o);
                }
            } catch (EOFException eof) {
                System.out.println("Acabando de leer fichero");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
