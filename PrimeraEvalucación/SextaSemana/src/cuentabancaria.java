public class cuentabancaria {
    private String propietario;
    private int saldo=0;
    private int movimientos=0; //el valor al crear una cuenta


    cuentabancaria(String propietario){
        this.propietario=propietario;
    }

    void retirar(int cantidad){
        System.out.println("Oye, quito dinero");
        movimientos++;
        saldo-=cantidad;
    }

    void ingresar(int cantidad){
        System.out.println("Bien, añado dinero");
        movimientos++;
        saldo+=cantidad;
    }
    void decirsaldoenpantalla(){
        System.out.println(saldo);
    }
    void imprimirdatosenpantalla(){
        System.out.println("La cuenta de "+propietario+" tiene "+ saldo +" €");
        System.out.println("Se han hecho "+movimientos+" movimientos");
    }
}
