public class Modelo {
    private final String marca;
    private final Tipo tipo;

    public Modelo(String marca, Tipo tipo){
        this.marca=marca;
        this.tipo=tipo;
    }

    public String getMarca(){
        return marca;
    }

    public Tipo getTipo(){
        return tipo;
    }


    @Override
    public String toString() {
        return "Marca: " + marca  +
                ", Tipo: " + tipo+"\n";
    }
}
