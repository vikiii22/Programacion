package POO;

public class Coche {
    protected final int ruedas;
    protected int largo;
    protected int ancho;
    protected int motor;
    protected int peso;
    protected String color;
    protected String nombre;

    public Coche() {
        this.ruedas = 4;
        this.largo = 2000;
        this.ancho = 1500;
        this.motor = 3600;
        this.peso = 2000;
    }

    public void ponmeNombre(String nombre){
        this.nombre=nombre;
    }

    public String miraMiNombre(){
        return nombre;
    }

    public String verColor(){
        return color;
    }

    public void estableceColor(String color){
        this.color=color;
    }

    @Override
    public String toString() {
        return ruedas  + " ruedas" + ", altura en cm= " + largo + ", anchura en cm= " + ancho + ", motor= " + motor +
                ", peso= " + peso;
    }
}
