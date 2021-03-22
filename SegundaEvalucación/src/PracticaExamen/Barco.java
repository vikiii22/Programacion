package PracticaExamen;

public class Barco extends Vehiculos {

    private boolean velasBien=true;
    private boolean cascoBarcoBien=true;

    public Barco(String matricula, int anyo){
        super(matricula, anyo);
    }

    public void setVelasBien(boolean velasBien){
        this.velasBien=velasBien;
    }

    public void setCascoBarcoBien(boolean cascoBarcoBien){
        this.cascoBarcoBien=cascoBarcoBien;
    }


    @Override
    public boolean pasaRevision() {
        return velasBien && cascoBarcoBien;
    }
}
