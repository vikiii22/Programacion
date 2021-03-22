package PracticaExamen;

public class Coche extends Vehiculos {

    public enum EstadosCoche{
        NUEVO,
        PASABLE,
        COCHAMBROSO;
    }
    private EstadosCoche estado;

    public Coche(String matricula, int anyo, EstadosCoche estado){
        super(matricula,anyo);
        this.estado=estado;
    }

    public void setEstado(EstadosCoche estado) {
        this.estado = estado;
    }

    public EstadosCoche getEstado(){
        return estado;
    }
    @Override
    public boolean pasaRevision(){
        return this.estado==EstadosCoche.NUEVO||this.estado==EstadosCoche.PASABLE;
    }
}