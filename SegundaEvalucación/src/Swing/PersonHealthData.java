package Swing;

import java.util.NavigableMap;
import java.util.TreeMap;

public class PersonHealthData {
    private final double weight; //kg.
    private final double height; //cm.

    public PersonHealthData(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }


    private static final NavigableMap<Double, String> grades = new TreeMap<>();
    static {
        grades.put(18.5, "Peso bajo");
        grades.put(24.9, "Peso normal");
        grades.put(26.9, "PreObesidad grado I");
        grades.put(29.9, "PreObesidad grado II");
        grades.put(34.9, "Obesidad grado I");
        grades.put(39.9, "Obesidad grado II");
        grades.put(49.9, "Obesidad grado 3: mórbida");
        grades.put(50.9, "Obesidad grado 4: extrema");
        
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public double getBMI(){
        return weight/(double)(height*height);
    }


}
