package FechaNacimiento;

import java.util.ArrayList;
import java.util.List;

public class PersonasFechas {
        PersonasFechas personas;
        String nombre;
        int dia;
        int mes;
        int anyo;

    public String getNombre() {
        return nombre;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnyo() {
        return anyo;
    }


    public PersonasFechas(String nombre, int dia, int mes, int anyo) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public String nombreFecha(){
            return nombre + ": "+ dia + "/" + mes + "/" + anyo;
    }

    public boolean nacenMismoDia(PersonasFechas personas){
        if (getDia()== personas.getDia()){
            return true;
        }else{
            return false;
        }
    }

    public boolean elMasMayor(PersonasFechas personas){
        if (getAnyo() < personas.getAnyo()){
            return true;
        }else{
            return false;
        }
    }

    public boolean primerCumple(PersonasFechas personas){
        if (getDia() < personas.getDia()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        List<PersonasFechas>personas=new ArrayList<>();
        PersonasFechas ana=new PersonasFechas("Ana", 21, 06, 1990);
        PersonasFechas bea=new PersonasFechas("Bea", 12, 02, 2018);
        PersonasFechas clara=new PersonasFechas("Clara", 01, 01, 2005);

        personas.add(ana);
        personas.add(bea);
        personas.add(clara);

        for (PersonasFechas p:personas) {
            System.out.println(p.nombreFecha());
        }
        if (ana.nacenMismoDia(bea)){
            System.out.println("Nacen el mismo día");
        }else {
            System.out.println("No nacen el mismo día");
        }

        if (ana.elMasMayor(bea)&&ana.elMasMayor(clara)){
            System.out.println(ana.nombre+" Es la mayor");
        }else if (bea.elMasMayor(clara)){
            System.out.println(bea.nombre+ " Es la mayor");
        }else if (clara.elMasMayor(ana)){
            System.out.println(clara.nombre + " Es la mayor");
        }

        if (ana.primerCumple(bea)&& ana.primerCumple(clara)){
            System.out.println(ana.nombre+" Es la primera en cumplir años");
        }else if (bea.primerCumple(clara)){
            System.out.println(bea.nombre+ " Es la primera en cumplir años");
        }else if (clara.primerCumple(ana)){
            System.out.println(clara.nombre + " Es la primera en cumplir años");
        }
    }
}
