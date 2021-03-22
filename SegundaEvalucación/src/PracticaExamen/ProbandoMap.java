package PracticaExamen;

import java.util.Map;
import java.util.TreeMap;

public class ProbandoMap {
    public static void main(String[] args) {
        Map<String, JulioProfe>empresa=new TreeMap<>();
        empresa.put("Dep. Ciencias", new JulioProfe("Julito"));
    }
}

class JulioProfe{
    public JulioProfe(String nombre){
        nombre=nombre;
        sueldo=2000;
    }
    public String toString(){
        return "Nombre= "+nombre+", tiene un sueldo de: "+sueldo;
    }

    private String nombre;
    private double sueldo;
}
