import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practica_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> coches=new ArrayList<>();
        System.out.println("Lista de marcas");
        coches.add("Ford");
        coches.add("Nissan");
        coches.add("Dacia");
        coches.add("Seat");
        coches.forEach(System.out::println);

        System.out.println("------------------------------------------------");

        List<MarcaCoches> marcas=new ArrayList<>();
        marcas.add(new MarcaCoches("Seat", "Leon"));
        marcas.add(new MarcaCoches("Nissan", "Qaskai"));
        marcas.add(new MarcaCoches("Opel", "Corsa"));
        marcas.add(new MarcaCoches("Dacia", "Sandero"));
        marcas.add(new MarcaCoches("Audi", "A1"));
        marcas.forEach(System.out::println);
       /* Scanner sc=new Scanner(System.in);
        System.out.println("Dime una marca");
        String nombre=sc.nextLine();
        if (coches.indexOf(nombre)==-1){
            System.out.println("Ese coche no está");
        }else{
            System.out.println("Ese coche si está");
        }*/
        MarcaCoches buscado=null;
        String nombre=JOptionPane.showInputDialog("Dime una marca");
        String modelo=JOptionPane.showInputDialog("Dime un modelo");
        for (MarcaCoches m:marcas){
            if (m.getMarca().equals(nombre) && m.getModelo().equals(modelo)){
                buscado = m;
            }
        }
        if (buscado!=null){
            String salida="El coche "+buscado.getMarca()+" "+buscado.getModelo()+" está disponible";
            JOptionPane.showMessageDialog(null, salida);
        }else{
            JOptionPane.showMessageDialog(null, "El coche "+nombre+" "+modelo+" no se encuentra disponible");
        }

        System.out.println("---------------------------------------------");
        marcas.forEach(System.out::println);
        System.out.println("Coche seleccionado: " + nombre + " " + modelo);
    }
}
