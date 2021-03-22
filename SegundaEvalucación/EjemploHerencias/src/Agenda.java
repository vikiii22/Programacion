public class Agenda {
    private String nombre;
    private int numero;

    public Agenda(){
        this.nombre=null;
        this.numero=0;
    }
    public Agenda(String nombre, int numero){
        this.nombre=nombre;
        this.numero=numero;
    }
    public void getNumero() {
        this.numero = numero;
    }
    public String getNombre(){
        return this.nombre;
    }
}
