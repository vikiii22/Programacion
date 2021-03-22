public class hucha {


    private String forma;
    private int dineroactualcentimos=0;
    private String propietario;

    public String getForma(){
        return forma;
    }

    void metereuros(int cantidad){
        this.dineroactualcentimos+=cantidad;
    }
    public int getDineroactual(){
        return dineroactualcentimos;
    }

    hucha(String propietario, String forma){
        this.propietario=propietario;
        this.forma=forma;
        this.dineroactualcentimos=0;
    }
    String infohucha(){
        return "La hucha "+forma+" de "+propietario+" tiene "+dineroactualcentimos;
    }
}
