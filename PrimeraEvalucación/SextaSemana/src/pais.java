import javax.swing.*;

public class pais {
    public static void main(String[] args) {

    }
        private String nombre;
        private String capital;
        private String idiomamasusado;
        private int tamanyo;
        private int numerohabit;
        private int elevacionmax;
        //private boolean salidaalmar;

        pais(String nombre, String capital, String idiomamasusado, String tamanyo, String numerohabit, String elevacionmax){
            this.nombre=nombre;
            this.capital=capital;
        }
        String infopais(){
            return "La capital de "+nombre+" es "+capital+" el idioma más hablado es"+idiomamasusado+", su tamaño es "+tamanyo+" tiene "+numerohabit+" habitantes, su pico más alto es  "+elevacionmax;

        }



}