import javax.swing.*;
import java.util.Scanner;

public class producto {
    private String nombre;
    private int precio = (int) (Math.random() * 1 * 100);
    private int iva;
    Scanner reader = new Scanner(System.in);
    int pagacliente = 0;
    int devolucion;


    producto(String nombre) {
        this.nombre = nombre;
        this.precio = precio;
        this.iva = iva;

    }

    void imprimedatosenpantalla() {
        System.out.println("El " + nombre + " tiene un precio de: " + precio + "€ ");
        System.out.println("Cuanto paga el cliente? ");
        pagacliente = reader.nextInt();

        if (precio <= pagacliente) {
            System.out.println("El cliente paga: " + pagacliente + " €");
        } else {
            System.out.println(pagacliente + "€, no te llega la pasta");
        }
        if (pagacliente > precio) {
            devolucion = pagacliente - precio;
            System.out.println("Se devuelven " + devolucion + " €");
        } else {
            System.out.println("No se devuelve nada");
        }
        if ((devolucion <= 1 || devolucion <= 4)) {
            System.out.println(devolucion+" moneda/s de 1 €");
        }
    }
}