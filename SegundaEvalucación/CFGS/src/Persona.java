public abstract class Persona { //HACERLO DESPUÉS UNA VEZ SUBIDO A GITHUB.
    private final String nombre;
    private final String apellidos;

    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public abstract String getID();

}

abstract class Profesor extends Persona {
    public Profesor(String nombre, String apellidos) {
        super(nombre, apellidos);
    }
}

    @Override
    public int hashCode() {
        return super.hashCode();
}



@Override
public String getID(){
    return NIF;
}
