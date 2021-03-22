import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String linea="";
        /*do{
            linea=sc.nextLine();
            Trayecto t = new Trayecto(linea);
            if (t.getResultado()!=Trayecto.Resultado.FINALIZAR){
                System.out.println(t.getResultado());
            }
        }*/
    }
}


class Trayecto {
    int distanciaMetros;
    int velocidadMaximaMxS;
    int tiempoEmpleadoSegundos;
    public Trayecto(int distanciaMetros, int velocidadMaximaMxS, int tiempoEmpleadoSegundos){
        this.distanciaMetros=distanciaMetros;
        this.velocidadMaximaMxS=(int)(velocidadMaximaMxS*3.6);
        this.tiempoEmpleadoSegundos=tiempoEmpleadoSegundos;
    }
    public Trayecto(String distancia, String velocidad, String tiempo){
        this(Integer.parseInt(distancia), Integer.parseInt(velocidad), Integer.parseInt(tiempo));
    }
    public Trayecto(String linea){
        this(linea.split(" ")[0],linea.split(" ")[1],linea.split(" ")[2]);
    }
    public Resultado getResultado(){
        if(distanciaMetros==0 && velocidadMaximaMxS ==0 && tiempoEmpleadoSegundos==0){
            return Resultado.FINALIZAR;
        }
        int velocidad=distanciaMetros/tiempoEmpleadoSegundos;
        if(velocidad<=velocidadMaximaMxS){
            return Resultado.OK;
        }
        if (velocidad<=velocidadMaximaMxS*1.2){
            return Resultado.PUNTOS;
        }
        if (velocidad>velocidadMaximaMxS*1.2){
            return Resultado.MULTA;
        }
        return Resultado.ERROR;
    }

    enum Resultado{
        OK,
        MULTA,
        PUNTOS,
        ERROR,
        FINALIZAR;
    }
}
