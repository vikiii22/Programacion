package PracticaExamen;

public class EjemploExamen {
    private final String marca;
    private String modelo;
    private enum Estado {
        MAL,
        BIEN,
        PESIMO
    }

    Estado estado;

    public EjemploExamen(String marca, String modelo, Estado estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo() {
        this.modelo = modelo;
    }

    public String dameInfo() {
        return marca + " " + modelo;
    }

    public String noPasa() {
        if (estado == Estado.PESIMO) {
            return "No puede pasar";
        }

        if (estado==Estado.BIEN){
            return "Pasa sin problemas";
        }

        if (estado==Estado.MAL){
            return "Pasa de milagro";
        }
        return null;
    }
}
