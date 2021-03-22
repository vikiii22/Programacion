package Practica;

import java.util.Objects;

public class Constructor {
    String nombre;
    String apellido;
    int edad;
    String correo;

    public Constructor(String nombre, String apellido, int edad, String correo){
        this.nombre=nombre;
        this.apellido=apellido;
        this.edad=edad;
        this.correo=correo;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(){
        this.nombre=nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public void setApellido(){
        this.apellido=apellido;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(){
        this.edad=edad;
    }

    public String getCorreo(){
        return correo;
    }

    public void setCorreo(){
        this.correo=correo;
    }

    @Override
    public String toString() {
        return nombre +" "+ apellido + ", edad:"+edad +", "+"correo: "+ correo + '\'';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Constructor that = (Constructor) o;
        return edad == that.edad &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apellido, that.apellido) &&
                Objects.equals(correo, that.correo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido, edad, correo);
    }
}
