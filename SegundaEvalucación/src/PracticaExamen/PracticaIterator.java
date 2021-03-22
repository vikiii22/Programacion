package PracticaExamen;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PracticaIterator {
    public static void main(String[] args) {
        Set<String>clientes=new TreeSet<>();
        clientes.add("Juan");
        clientes.add("Pedro");
        clientes.add("Ana");
        clientes.add("Pilar");

        Iterator<String>meChupaUnHuevo=clientes.iterator();

        while (meChupaUnHuevo.hasNext()){
            String nombres=meChupaUnHuevo.next();
            System.out.println(nombres);
        }

    }
}
