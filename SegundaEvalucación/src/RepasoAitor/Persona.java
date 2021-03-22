package RepasoAitor;

import javax.swing.*;

public class Persona {
    int id;
    String nombre;
    String apellidos;
    public Persona(int id, String nombre, String apellidos){
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }
    public int getId() {
        return this.id;
    }
    public String getNombreCompleto(){
        return this.nombre +" "+this.apellidos;
    }
}
