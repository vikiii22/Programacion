package RepasoExamen.Files;

import javax.swing.*;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class LeerFicheroDatos {
    public static void main(String[] args) {
        try (DataInputStream dis=new DataInputStream(new FileInputStream(args[0]))){
            while (true){
                String nia=dis.readUTF();
                String nombre=dis.readUTF();
                byte edad=dis.readByte();
                short altura=dis.readShort();
                short peso=dis.readShort();
                Persona persona=new Persona(nombre, edad, altura, peso, nia);

                short numeroAmigos=dis.readShort();
                for (int i = 0; i < numeroAmigos; i++) {
                    String nombreAmigo=dis.readUTF();
                    persona.anyadeAmigo(nombreAmigo);
                }
                JOptionPane.showMessageDialog(null, persona);
            }
        }catch (EOFException eofe){
            System.out.println("Terminado de leer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
