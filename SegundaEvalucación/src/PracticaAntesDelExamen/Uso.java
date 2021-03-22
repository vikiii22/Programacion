package PracticaAntesDelExamen;

public class Uso extends DispositivoInteligente{
        public Uso(String marcaModelo, String numeroTelefono, int bateria, double tamanyoPantalla, String SO){
            super(marcaModelo, numeroTelefono, bateria, tamanyoPantalla, SO);
    }

    @Override
    public String informacion(){
            return "Smartphone: "+super.informacion();
    }

    public static void main(String[] args) {
        DispositivoMovil movil=new DispositivoMovil("Xiaomi", "722519487", 3000,6.2);
        System.out.println(movil.informacion());
    }
}
