package RepasoExamen.Files;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Persona {
    String nombre;
    byte edad;
    short altura;
    short peso;
    String nia;
    List<String> amigos;

    public Persona(String nombre, byte edad, short altura, short peso, String nia) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        this.nia = nia;
        this.amigos=new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public short getAltura() {
        return altura;
    }

    public void setAltura(short altura) {
        this.altura = altura;
    }

    public short getPeso() {
        return peso;
    }

    public void setPeso(short peso) {
        this.peso = peso;
    }

    public String getNia() {
        return nia;
    }

    public void setNia(String nia) {
        this.nia = nia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return edad == persona.edad &&
                altura == persona.altura &&
                peso == persona.peso &&
                Objects.equals(nombre, persona.nombre) &&
                Objects.equals(nia, persona.nia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nia);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                ", nia='" + nia + '\'' +
                '}';
    }

    public String info(){
        return nia.toUpperCase()+" - "+nombre;
    }

    public List<String> getAmigos(){
        List<String> salida=new ArrayList<>(amigos);
        return salida;
    }

    public Persona anyadeAmigo(String amigo){
        amigos.add(amigo);
        return this;
    }
}
