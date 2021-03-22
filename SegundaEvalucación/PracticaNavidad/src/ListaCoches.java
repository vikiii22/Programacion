import java.util.Arrays;

public class ListaCoches {
    private static final int MAX_COCHES=10;
    private final Modelo[] modelos;
    private int numeroModelos;
    Tipo tipo;

    public ListaCoches(){
        this.modelos=new Modelo[MAX_COCHES];
    }

    public void anyadirModelo(Modelo modelo){
        modelos[numeroModelos++]=modelo;
    }

    public void borrarModelo(Modelo modelo){
        modelos[numeroModelos--]=modelo;
    }

    public boolean estaVacia(){
        return numeroModelos==0;
    }

    public boolean estaLlena(){
        return numeroModelos==modelos.length;
    }

    public int numeroModelos(){
        return numeroModelos;
    }

    public int maximoModelos(){
        return MAX_COCHES;
    }

    public Tipo esIgual(){
        if (tipo==tipo){
            System.out.println(tipo);
        }
        return tipo;
    }


    @Override
    public String toString() {
        return "Lista de Coches " + Arrays.asList(modelos)+
                ", numero de modelos actuales= " + numeroModelos;
    }

    public static void main(String[] args) {
        ListaCoches topegama=new ListaCoches();
        System.out.println(topegama);
    }

    public void anyadirModelo(Tipo nuevo) {
    }
    public void borrarModelo(Tipo borrar){

    }

}
