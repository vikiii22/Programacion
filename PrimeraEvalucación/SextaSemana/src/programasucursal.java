public class programasucursal {
    public static void main(String[] args) {
        cuentabancaria c;
        c=new cuentabancaria("pepe");
        c.imprimirdatosenpantalla();
        c.ingresar(100);
        c.retirar(150);
        c.imprimirdatosenpantalla();
    }
}
