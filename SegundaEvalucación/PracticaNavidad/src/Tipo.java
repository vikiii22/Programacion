import javax.swing.*;

public enum Tipo {
    TODOTERRENO("Todoterreno"),
    DEPORTIVO("Deportivo"),
    FAMILIAR("Familiar"),
    BERLINA("Berlina"),
    MONOVOLUMEN("Monovolumen"),
    SUV("SUV");
    private final String cadena;
    private Tipo tipo;


    Tipo(String cadena){
        this.cadena=cadena;
    }

    public String getCadena(){
        return cadena;
    }

    @Override
    public String toString(){
        return getCadena();
    }


    public static void main(String[] args) {
        System.out.println(Tipo.DEPORTIVO);
    }
}