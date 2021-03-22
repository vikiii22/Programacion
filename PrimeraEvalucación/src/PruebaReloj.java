public class PruebaReloj {
    public static void main(String[] args) {
        Reloj reloj1;
        Reloj reloj2;
        Reloj reloj3;
        reloj1=new Reloj();
        reloj2=new Reloj(3,45,5);

        System.out.println("Un reloj tiene la hora:"+reloj1.devuelveHora());
        System.out.println("El otro tiene la hora:"+reloj2.devuelveHora());
        System.out.println("Tenemos "+reloj1.totalRelojes()+" relojes");
        System.out.println("Cambiamos el separador a -");
        reloj1.cambiaSeparador('-');
        System.out.println("Leemos una hora");
        reloj3=new Reloj();
        reloj3.leeHora();
        System.out.println("Y la escribimos");
        System.out.println("El reloj leído tiene la hora:"
                +reloj3.devuelveHora());
        System.out.println("Sumamos 6:34:50 a la hora leida");
        reloj3.sumaTiempo(6, 34, 50);
        System.out.println("Ahora el reloj leído tiene la hora:"
                //Práctica del tema 3 Página 2
                        +reloj3.devuelveHora());
        System.out.println("Tenemos "+reloj1.totalRelojes()+" relojes");
        System.out.println("La hora 23:70:34 ¿Es válida?" +reloj1.esValida(23, 70, 34));
    }
}

