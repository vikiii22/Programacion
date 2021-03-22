public class Montanya {
    private final String nombre;
    private int altura;
    private final String continente;
    private final String[] pais;
    private final String cordillera;

    public Montanya(String nomnbre, int altura, String continente, String[] pais, String cordillera){
        this.nombre=nomnbre;
        this.altura=altura;
        this.continente=continente;
        this.pais=pais;
        this.cordillera=cordillera;
    }

    public String infoMontanya(){
        String salida="";
        salida+=nombre+" ("+altura+" m) - "+cordillera+" (";
        for (String pais: pais){
            salida+=pais+", ";

        }
        return salida;
    }
    Montanya[] lista = new Montanya[4];

}
