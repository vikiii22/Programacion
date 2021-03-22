package PracticaAntesDelExamen;

import java.util.ArrayList;
import java.util.List;

public abstract class DispositivoInteligente extends DispositivoMovil{
    private final String SO;
    private final List<String>aplicacionesInstaladas;

    public DispositivoInteligente(String marcaModelo, String numeroTelefono, int bateria, double tamanyoPantalla, String SO){
        super(marcaModelo, numeroTelefono, bateria, tamanyoPantalla);
        this.SO=SO;
        this.aplicacionesInstaladas=new ArrayList<>();
    }

    public String getSO(){
        return SO;
    }

    public void anyadeAplicaciones(String app){
        this.aplicacionesInstaladas.add(app);
    }

    public void borraAplicaciones(String app){
        this.aplicacionesInstaladas.remove(app);
    }

    public String listaAplicaciones(){
        String salida=" Aplicaciones";
        for (String s:aplicacionesInstaladas){
            salida+=s;
        }
        return salida;
    }
    @Override
    public String informacion(){
        String salida=super.informacion()+"\n";
        salida+="S.O "+SO+"\n";
        salida+=this.listaAplicaciones();
        return salida;
    }
}
