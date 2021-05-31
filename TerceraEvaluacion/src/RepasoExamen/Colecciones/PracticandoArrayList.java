package RepasoExamen.Colecciones;

import java.util.ArrayList;
import java.util.List;

public class PracticandoArrayList {
    String modelo;
    int anyo;
    String marca;
    public PracticandoArrayList(String modelo, int anyo, String marca){
        this.modelo=modelo;
        this.anyo=anyo;
        this.marca=marca;
    }

    public String toString(){
        return marca + " - " + modelo + " - " + anyo;
    }

    public static void main(String[] args) {
        List<PracticandoArrayList> coches=new ArrayList<>();

        coches.add(new PracticandoArrayList("Mazda", 2015, "CX5"));
        coches.add(new PracticandoArrayList("León", 2020, "Seat"));

        for (PracticandoArrayList s:coches){
            System.out.println(s.toString());
        }
    }
}
