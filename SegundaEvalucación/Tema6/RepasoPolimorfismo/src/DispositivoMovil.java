public class DispositivoMovil {
    //Si lleva final puede tener get pero no set.
    private final String IMEI;
    private String numeroTelefono;
    private final int amperajeBateria;
    private final double pulgadas;

    public DispositivoMovil(String IMEI, String numeroTelefono, int amperajeBateria, double pulgadas) {
        this.IMEI = IMEI;
        this.numeroTelefono = numeroTelefono;
        this.amperajeBateria = amperajeBateria;
        this.pulgadas = pulgadas;
    }
    public String info(){
        String salida="";
        salida+=IMEI+" - "+numeroTelefono+" - "+amperajeBateria+" - "+pulgadas;
        return salida;
    }

    public String getIMEI() {
        return IMEI;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public int getAmperajeBateria() {
        return amperajeBateria;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    String getDuarcionBateria(){
        if (amperajeBateria<2000){
            return "5 horas jugando";
        }
        if (amperajeBateria<4000){
            return "Un día entero";
        }
        return "Semanas y semanas";
    }
}
