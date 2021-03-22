public class cuentacorriente {
    private final String IBAN;
    private final String titular;
    private int saldo; //por defecto 0

    cuentacorriente(String IBAN, String titular, int saldo){
        this.IBAN=IBAN;
        this.titular=titular;
        this.saldo=saldo*100;
    }
    cuentacorriente(String IBAN, String titular){
        this(IBAN,titular,0);
    }

    String getsaldo(){
        return ""+saldo/100+"."+saldo%100+" €";
    }
    String infocc(){
        return "IBAN:"+IBAN+" "+"Titular:"+titular+"\n saldo:"+saldo+" €";
    }
    void ingresar(int cantidad){
        saldo+=cantidad;
    }
    void retirar(int cantidad) {
        saldo-=cantidad;
    }
}
