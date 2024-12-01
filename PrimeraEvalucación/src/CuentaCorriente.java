package practica4;

public class CuentaCorriente {
    // Atributos privados
    private String dni;
    private String nombre;
    private double saldo;


    // Constructor parametrizado para crear la cuenta con saldo incial 0
    public CuentaCorriente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = 0;
    }

    // Metodo para ingresar dinero
    public void ingresar(double cantidad) {
        if(cantidad > 0){
            saldo += cantidad;
            System.out.println("Ingreso de cantidad " + cantidad + " realizado correctamente. Nuevo saldo: " + saldo);
        }else{
            System.out.println("La cantidad " + cantidad + "no es válida. Debe ser positiva.");
        }
    }

    // Metodo para sacar dinero (devuelve true si se ha podido realizar la operación)
    public boolean sacar(double cantidad) {
        if(cantidad > saldo) {
            System.out.println("No se puede sacar esta cantidad: " + cantidad + ". Operación fallida: saldo insuficiente.");
            return false;
        } else {
            saldo -= cantidad;
            System.out.println("Extracción de " + cantidad + " realizada. Nuevo saldo: " + saldo);
            return true;
        }
    }

    // Metodo para mostrar la información de la cuenta
    public void mostrarInformacion() {
        System.out.println("Títular de la cuenta: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo + "\n");
    }
}
//