package RepasoAitor;

import java.util.ArrayList;
import java.util.List;

public class Cliente extends Persona {
    private int totalCompras;
    private Direccion direccionEntrega;
    private Direccion direccionFactura;
    private List<Producto> productos;


    public Cliente(int id, String nombre, String apellidos){
        super(id, nombre, apellidos);
        this.totalCompras=0;
        this.productos=new ArrayList<Producto>();
    }

    public Cliente pedir(Producto prod, int cantidad){
        for (int i=0; i<cantidad;i++){
            productos.add(prod);
        }
        totalCompras+=cantidad;

        return this;
    }

    private int getTotalCompras;

    public void Cliente(int id, String nombre, String apellidos){
        this.id=id;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }


    public Cliente devolver(int idProducto, int cantidad){
        return null;
    }

    public double getGastoTotal(){
        return 0;
    }

    public int getTotalCompras(){
        return totalCompras;
    }

    public boolean esVip(){
        return false;
    }

    public static String getResumenPedido(Cliente cli){
        return "";
    }
}