package PracticaAntesDelExamen;

public class DispositivoMovil {
    private final String marcaModelo;
    private String numeroTelefono;
    private int bateria;
    private double tamanyoPantalla;

    public DispositivoMovil(String marcaModelo, String numeroTelefono, int bateria, double tamanyoPantalla){
        this.marcaModelo=marcaModelo;
        this.numeroTelefono=numeroTelefono;
        this.bateria=bateria;
        this.tamanyoPantalla=tamanyoPantalla;
    }

    public String informacion(){
        String salida="";
        salida+=marcaModelo+" "+numeroTelefono+" "+bateria+" "+tamanyoPantalla;
        return salida;
    }

    public String getMarcaModelo(){
        return marcaModelo;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono){
        this.numeroTelefono=numeroTelefono;
    }

    public int getBateria() {
        return bateria;
    }

    public double getTamanyoPantalla() {
        return tamanyoPantalla;
    }

    String getDuracionBateria(){
        if(bateria<4000){
            return " Un día";
        }else{
            return "Semanas";
        }
    }

}
