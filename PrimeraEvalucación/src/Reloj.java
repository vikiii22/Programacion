import javax.swing.*;

public class Reloj {
    private int segundos;
    private int minutos;
    private int hora;
    private static char separadores=':';
    private static int relojes=0;

    public Reloj() {
        segundos = 0;
        minutos = 0;
        hora = 0;
        Reloj.relojes++;
    }
    public Reloj(int hora, int minutos, int segundos) {
        this.hora=hora;
        this.minutos=minutos;
        this.segundos=segundos;
        Reloj.relojes++;
    }
    public String devuelveHora(){
        return ""+hora+""+separadores+""+minutos+""+separadores+""+segundos;
    }
    public void leeHora(){
        hora=Integer.parseInt(JOptionPane.showInputDialog("Dime la hora"));
        minutos=Integer.parseInt(JOptionPane.showInputDialog("Dime los minutos"));
        segundos=Integer.parseInt(JOptionPane.showInputDialog("Dime los segundos"));
    }
    public void ponHora(int hora,int minutos, int segundos){
        if (this.esValida(hora, minutos, segundos)){
            this.segundos=segundos;
            this.minutos=minutos;
            this.hora=hora;
        }
    }
    public void sumaTiempo(int hora, int minutos, int segundos){
        this.hora+=hora;
        this.minutos+=minutos;
        this.segundos+=segundos;
        while(this.segundos>59){
            this.minutos++;
            this.segundos=59;
        }
        while(this.minutos>59){
            this.hora++;
            this.minutos=59;
        }
        while(this.hora>23){
            this.hora-=1;
        }
    }
    public void cambiaSeparador(char separadores){
        Reloj.separadores=separadores;
    }
    public int totalRelojes(){
        return Reloj.relojes;
    }
    public boolean esValida(int hora, int minutos, int segundos){
        return segundos <=59 && minutos <59 && hora <= 23;
    }

}