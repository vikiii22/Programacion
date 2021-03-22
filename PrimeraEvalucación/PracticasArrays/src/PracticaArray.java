public class PracticaArray {
    private final String nombre;
    private int altura;
    private final String continente;
    private final String[] paises;
    private final String cordillera;

    public PracticaArray(String nombre, int altura, String continente, String[] paises, String cordillera){
        this.nombre=nombre;
        this.altura=altura;
        this.continente=continente;
        String[] mispaises=new String[paises.length];
        for (int i = 0; i < paises.length; i++) {
            mispaises[i]=paises[i];
        }
        this.paises=paises;
        this.cordillera=cordillera;
    }
    public String infoMontanya(){
        String salida="";
        salida+=nombre+" ("+altura+" m) - "+cordillera+" (";
        for (String pais:paises){
            salida+=pais+", ";
        }
        salida=salida.substring(0, salida.length()-2);
        salida+=")";
        return salida;
    }
    public static void main(String[] args){
        PracticaArray[] lista=new PracticaArray[4];
        String[] paises={"Tibet", "Nepal"};
        lista[0]=new PracticaArray("Everest", 8848, "Asia", paises, "Himalaya");
        String[] paises2={"Argentina"};
        lista[1]=new PracticaArray("Aconcagua", 6962, "América del sur", paises2, "Andes");
        paises2[0]="Estados Unidos";
        lista[2]=new PracticaArray("McKinley", 6194, "América del Norte", paises2, "Andes");
        paises2[0]=("Tanzania");
        lista[3]=new PracticaArray("Kibo", 5895, "África", paises2, "Kilimanjaro");
        for(PracticaArray p:lista){
            System.out.println(p.infoMontanya());
        }
    }
}