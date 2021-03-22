import javax.swing.*;

public class coche {
    private String marca;
    private int CV;
    private String color;
    private String matricula;

    coche(String matricula, String color, String marca, int CV){
        this.matricula=matricula;
        this.color=color;
        this.marca=marca;
        this.CV=CV;
    }
    void imprimedatosenpantalla(){
        System.out.println("El "+marca+" "+color+" su matrícula es: "+matricula+" ");
    }
    void imprimedatosjoption(){
        JOptionPane.showMessageDialog(null,"El "+marca+" "+color+" su matrícula es: "+matricula+" ");
    }
}
