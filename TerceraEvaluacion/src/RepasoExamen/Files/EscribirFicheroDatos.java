package RepasoExamen.Files;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EscribirFicheroDatos {
    public static void main(String[] args) throws IOException {
        Persona p=new Persona("Juan", (byte)54, (short) 180, (short)70, "1002496");
        p
                .anyadeAmigo("Elena")
                .anyadeAmigo("Jose")
                .anyadeAmigo("Xokitas");

        System.out.println(p);

        FileOutputStream fos=new FileOutputStream("persona.dam", true);
        DataOutputStream dos=new DataOutputStream(fos);
        dos.writeUTF(p.getNia());
        dos.writeUTF(p.getNombre());
        dos.writeByte(p.getEdad());
        dos.writeShort(p.getAltura());
        dos.writeShort(p.getPeso());

        dos.writeShort(p.amigos.size());
        for (String s:p.amigos) {
            dos.writeUTF(s);
        }
        try {
            dos.close();
            fos.close();
        }finally {
            dos.close();
            fos.close();
        }
    }
}
