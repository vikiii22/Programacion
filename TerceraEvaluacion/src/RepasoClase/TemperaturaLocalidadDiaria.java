package RepasoClase;

public class TemperaturaLocalidadDiaria {
    String localidad;
    double maxima;
    double minima;

    public TemperaturaLocalidadDiaria(String localidad, double maxima, double minima){
        if (localidad==null || "".equals(localidad)){
            System.out.println("Pasa algo malo");
        }
        this.localidad=localidad;
        this.maxima=maxima;
        this.minima=minima;
    }

    public static void main(String[] args) {
        TemperaturaLocalidadDiaria tmp=new TemperaturaLocalidadDiaria("", 51, 21);
    }
}
