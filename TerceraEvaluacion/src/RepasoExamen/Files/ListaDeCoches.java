package RepasoExamen.Files;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ListaDeCoches implements Serializable {
    public List<Coche> coches;

    public ListaDeCoches(){
        coches=new ArrayList<>();
    }

    public ListaDeCoches anyadeCoche(Coche c){
        coches.add(c);
        return this;
    }
}
