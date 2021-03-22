public class MarcaCoches {
    String Marca;
    String Modelo;

    public MarcaCoches(String Marca, String Modelo){
        this.Marca=Marca;
        this.Modelo=Modelo;
    }

    public String getMarca(){
        return Marca;
    }

    public String getModelo(){
        return Modelo;
    }

    public void setMarca(){
        this.Marca=Marca;
    }

    public void setModelo(){
        this.Modelo=Modelo;
    }
    @Override
    public String toString(){
        return Marca.toUpperCase()+" "+Modelo;
    }
}
