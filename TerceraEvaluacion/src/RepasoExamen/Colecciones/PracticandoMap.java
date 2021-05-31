package RepasoExamen.Colecciones;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PracticandoMap {
    private int sueldo;
    private String n;
    public PracticandoMap(String nombre){
        n=nombre;
        sueldo=2000;
    }

    public String toString(){
        return "El empleado es: "+n+" Con un sueldo de "+sueldo;
    }

    public int cambiaSueldo() {
        System.out.println("Introduce el sueldo nuevo");
        Scanner sc = new Scanner(System.in);
        int nuevoSueldo = sc.nextInt();
        sueldo=nuevoSueldo;
        return nuevoSueldo;
    }

    public static void main(String[] args) {
        TreeMap<String, PracticandoMap> ejemplo=new TreeMap<>();

        ejemplo.put("1 ", new PracticandoMap("Jose"));
        ejemplo.put("2 ", new PracticandoMap("Antoñico"));

        for (Map.Entry<String, PracticandoMap> p:ejemplo.entrySet()){
            System.out.println(p.getKey() + p.getValue());
        }

        HashMap<Integer, PracticandoMap> ejemplo2=new HashMap<>();

        PracticandoMap nuevo=new PracticandoMap("Manolo");
        nuevo.cambiaSueldo();
        ejemplo2.put(1, new PracticandoMap("Luis"));
        ejemplo2.put(5, new PracticandoMap("Federica"));
        ejemplo2.put(2, nuevo);
        ejemplo2.put(2, new PracticandoMap("Firulais"));

        for (Map.Entry<Integer, PracticandoMap> p:ejemplo2.entrySet()) {
            System.out.println(p.getKey()+" "+p.getValue());
        }
    }
}
