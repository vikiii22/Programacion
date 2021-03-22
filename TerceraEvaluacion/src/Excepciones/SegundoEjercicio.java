package Excepciones;

public class SegundoEjercicio {
    public static void main(String[] args) {
        try {
            throw new MiException("Error", "Lo que ha pasado es que.....");
        } catch (MiException m){
            //m.getMessage()+" Profundizando más: "+m.getExplicacionLarga();
        }
    }
}
class MiException extends Exception{
    String explicacionLarga;
    MiException(String corta, String larga){
        super(corta);
    }

    public String getExplicacionLarga(){
        return explicacionLarga;
    }
}
