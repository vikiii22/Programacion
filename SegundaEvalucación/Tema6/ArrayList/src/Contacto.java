public class Contacto {
    String nombre;
    String numeroTelefono;

    public Contacto(String nombre, String numeroTelefono){
        this.nombre=nombre;
        this.numeroTelefono=numeroTelefono;
    }

    public String getNombre(){

        return nombre;
    }

    public String getNumeroTelefono()
    {
        return numeroTelefono;
    }

    public void setNombre(){
        this.nombre=nombre;
    }

    public void setNumeroTelefono(){
        this.numeroTelefono=numeroTelefono;
    }

    @Override
    public String toString(){
        return nombre.toUpperCase()+" - "+numeroTelefono;
    }
}
