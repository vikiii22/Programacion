//Ejemplo constructor telescopico;

public class bolsadesnacks {
    private String nombre;
    private int precio;
    private int grasas; //por defecto 0;
    private int iva; //por defecto 21%;
    private boolean esperjudicial; //por defecto false

    bolsadesnacks(String nombre, int precio, int grasas){
        this.nombre=nombre;
        this.precio=precio;
        this.grasas=grasas;
        this.iva=21;
        this.esperjudicial=false;
    }
}
