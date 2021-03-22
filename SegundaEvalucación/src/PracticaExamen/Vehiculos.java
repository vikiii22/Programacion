package PracticaExamen;

public abstract class Vehiculos {
    private final String matricula;
    private final int anyoFabricacion;

    public Vehiculos(String matricula, int anyoFabricacion){
        this.matricula=matricula;
        this.anyoFabricacion=anyoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public int getAnyoFabricacion() {
        return anyoFabricacion;
    }


    public abstract boolean pasaRevision();
}
