package PracticaExamen;

import java.util.ArrayList;
import java.util.List;

public class TestVehiculos {
    public static int cuentaBarcos(ArrayList<Vehiculos> l){
        int cuenta=0;
        for (Vehiculos v:l) {
            if (v instanceof Barco){
                cuenta++;
            }
        }
        return cuenta;
    }
    public static void main(String[] args) {
        List<Vehiculos>nuevos=new ArrayList<>();
        nuevos.add(new Coche("ASSA",2015, Coche.EstadosCoche.NUEVO));
        nuevos.add(new Coche("NISA",2015, Coche.EstadosCoche.NUEVO));
        nuevos.add(new Barco("MA",2001));
        nuevos.add(new Barco("MON",2011));

        ((Coche)nuevos.get(0)).setEstado(Coche.EstadosCoche.COCHAMBROSO);
        ((Barco)nuevos.get(3)).setCascoBarcoBien(false);

        for (Vehiculos v:nuevos){
            if (!v.pasaRevision()){
                System.out.println(v.getMatricula());
            }
        }
    }
}
