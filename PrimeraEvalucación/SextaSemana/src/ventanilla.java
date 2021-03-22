public class ventanilla {
    public static void main(String[] args) {

        cuentacorriente c1 = new cuentacorriente("3212514-4521", "Juan");
        cuentacorriente c2 = new cuentacorriente("32114504-4521", "PEPE");
        c1.ingresar(10000);
        c2.retirar(200);
        c2.ingresar(500);
        System.out.println(c1.infocc());
        System.out.println(c2.infocc());
    }
}
