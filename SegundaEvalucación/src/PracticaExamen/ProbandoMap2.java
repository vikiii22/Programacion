package PracticaExamen;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class ProbandoMap2 {
    public static void main(String[] args) {
        Map<String, Animales>miCasa=new TreeMap<>();
        miCasa.put("1 ", new Animales("Perro", "Tara"));
        miCasa.put("2 ", new Animales("Caimán", "Champi"));
        System.out.println(miCasa);

        for (Map.Entry<String, Animales>entrada: miCasa.entrySet()){
            String clave=entrada.getKey();
            Animales nombre=entrada.getValue();
            System.out.println("Numero: "+clave+" "+nombre);
        }

    }
}

class Animales{
    private String especie;
    private String nombre;

    public Animales(String especie, String nombre){
        this.especie=especie;
        this.nombre=nombre;
    }
    public String toString(){
        return "Tengo un "+especie+" y se llama "+nombre+'\n';
    }
}
