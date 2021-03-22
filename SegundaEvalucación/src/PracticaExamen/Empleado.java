package PracticaExamen;

public class Empleado {
    String nombre;
    int edad;

    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String dameDatos(){
        return "El empleado se llama: "+nombre + " y tiene "+edad;
    }
}
