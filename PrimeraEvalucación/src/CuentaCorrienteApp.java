package practica4;

public class CuentaCorrienteApp {
    public static void main(String[] args) {

        // Crear dos cuentas con distintos titulares
        CuentaCorriente cuenta1 = new CuentaCorriente("46053284S", "Pepe");
        CuentaCorriente cuenta2 = new CuentaCorriente("24082866X", "Lola");

        // Realizar ingresos en ambas cuentas
        cuenta1.ingresar(400);
        cuenta2.ingresar(600);

        // Mostrar información de cada cuenta
        System.out.println("\nInformación de la cuenta 1: ");
        cuenta1.mostrarInformacion();
        System.out.println("\nInformación de la cuenta 2: ");
        cuenta2.mostrarInformacion();

        //Intentar extraer dinero de ambas cuentas
        cuenta1.sacar(500); 
        cuenta2.sacar(400);
    }
}
