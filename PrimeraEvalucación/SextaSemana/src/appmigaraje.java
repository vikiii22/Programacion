public class appmigaraje {
    public static void main(String[] args) {
        coche pequenyo=new coche("7673-TRE", "Malva", "Peugeot 206", 430);
        coche todoterreno=new coche("5121-GFD", "Rojo", "Range Rover", 120);

        pequenyo.imprimedatosenpantalla();
        todoterreno.imprimedatosenpantalla();
        todoterreno.imprimedatosjoption();
        pequenyo.imprimedatosjoption();
    }
}
