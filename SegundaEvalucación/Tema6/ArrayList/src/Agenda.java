import javax.swing.*;
import java.awt.event.ContainerAdapter;
import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public static void main(String[] args) {
        List<Contacto> listado=new ArrayList<>();
        Contacto ana=new Contacto("Ana", "652124587");
        listado.add(ana);
        listado.add(new Contacto("Bea", "542458712"));
        listado.add(new Contacto("Luis", "727741294"));
        Contacto fede=new Contacto("Federico", "542174574");
        listado.add(fede);
        System.out.println(listado);
        System.out.println("----------------------------------------");
        //Para poner uno arriba/abajo del otro se hace o con (for i) o forEach o la opción que hay justo abajo.

        listado.forEach(System.out::println);

        for (int i = 0; i < listado.size(); i++) {
            Contacto c=listado.get(i);
            System.out.println(c);
        }

        System.out.println("-----------------------------");

        for (Contacto c:listado){
            System.out.println(c);
        }

        System.out.println("-------------------------");

        listado.add(2, new Contacto("Ibai", "999554124"));
        listado.add(new Contacto("Messi", "101101010"));
        listado.forEach(System.out::println);
        String nombre= JOptionPane.showInputDialog("Dime un nombre");
        Contacto buscado=null;
        for(Contacto c:listado){
            if(c.getNombre().equals(nombre)){
                buscado=c;
            }
        }
        if (buscado!=null){
            String salida="El número de "+buscado.getNombre()+" es: "+buscado.getNumeroTelefono();
            JOptionPane.showMessageDialog(null, salida);
            //buscado.setNumeroTelefono("0000000000");
        }else{
            JOptionPane.showMessageDialog(null, "El nombre no está en la agenda");
        }
        System.out.println("------------------------");
        //En buscado está la referencia al contaco.
        listado.forEach(System.out::println);

    }
}
