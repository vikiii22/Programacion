package PracticaExamen;

import java.util.*;

public class UsoEmpleado {
    public static void main(String[] args) {
        List<Empleado>listaEmpleados=new ArrayList<>();
        listaEmpleados.add(new Empleado("Juan", 22));
        listaEmpleados.add(new Empleado("Pedro", 32));
        listaEmpleados.add(new Empleado("Ana", 22));
        //listaEmpleados.remove(0);

        System.out.println(listaEmpleados.get(1).dameDatos());
        System.out.println("------------------------------------");

        for (Empleado e:listaEmpleados) {
            System.out.println(e.dameDatos());
        }

        System.out.println("--------------------------------------");
        Set<String>nombres=new TreeSet<>();
        nombres.add("Luis");
        nombres.add("Pedro");
        nombres.add("Ana");

        for (String n:nombres){
            System.out.println(n);
        }

        System.out.println("------------------------------");

        Iterator <Empleado> miIterador=listaEmpleados.iterator();
        while (miIterador.hasNext()){
            System.out.println(miIterador.next().dameDatos());
        }
    }
}
