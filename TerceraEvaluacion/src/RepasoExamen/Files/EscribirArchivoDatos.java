package RepasoExamen.Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscribirArchivoDatos {
    public static void main(String[] args) {
        ListaDeCoches listaDeCoches=new ListaDeCoches();
        listaDeCoches.anyadeCoche(new Coche("5454-GSG"));
        listaDeCoches.anyadeCoche(new Coche("1254-GSG"));
        listaDeCoches.anyadeCoche(new Coche("8451-BHH"));
        listaDeCoches.anyadeCoche(new Coche("2481-KSP"));

        try (ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File("coche.obj")))){
            oos.writeObject(listaDeCoches);
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }
}
