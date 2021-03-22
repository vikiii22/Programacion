import javax.swing.*;

public class ConcesionarioPepa {
    public static void main(String[] args) {
        ListaCoches lista=new ListaCoches();
        if(JOptionPane.showConfirmDialog(null,
                "Entrar en Concesionario Pepa",
                "Datos",
                JOptionPane.YES_NO_OPTION)==0) {
            lista.anyadirModelo(new Modelo("Seat", Tipo.SUV));
            lista.anyadirModelo(new Modelo("Mazda", Tipo.BERLINA));
            lista.anyadirModelo(new Modelo("Jeep", Tipo.TODOTERRENO));
            lista.anyadirModelo(new Modelo("Opel", Tipo.DEPORTIVO));
            lista.anyadirModelo(new Modelo("Dacia", Tipo.TODOTERRENO));
        }
        String opciones[]={
                "Añadir coche",
                "Quitar coche",
                "Listar coches",
                "Listar por tipos"
        };
        while (true){
            int respuesta = JOptionPane.showOptionDialog(null,
                    "Concesionario Pepa",
                    "La lista tiene "+lista.numeroModelos() + " de "+ lista.maximoModelos(),
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);
            switch (respuesta) {
                case 0:
                    Tipo nuevo = ESTipo.pideTipoVentana();
                    if (nuevo == nuevo) {
                        lista.anyadirModelo(new Modelo(JOptionPane.showInputDialog(null,
                                "Introduce tu modelo"),
                                nuevo));
                    }
                    break;
                case 1:
                    Tipo borrar = ESTipo.pideTipoVentana();
                    if (borrar == borrar) {
                        lista.borrarModelo(new Modelo(JOptionPane.showInputDialog(null,
                                "Introduce el modelo a borrar"),
                                borrar));
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, lista);
                    break;

                case 3:
                    String tipos[]={"TODOTERRENO", "DEPORTIVO", "FAMILIAR", "BERLINA", "MONOVOLUMEN", "SUV"};
                    String tipoElegido= (String) JOptionPane.showInputDialog(null,
                            "Elige un tipo",
                            "Elegir",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            tipos,
                            tipos[0]);
                    for (Tipo t: Tipo.values()) {
                        if(tipoElegido==tipos[0]){
                            JOptionPane.showMessageDialog(null, lista + ""+ tipoElegido);
                        }
                    }
            }
        }
    }
}