package Practica;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Persona {


    public static void main(String[] args) {
        List<Constructor> persona=new ArrayList<>();
        System.out.println(persona.size());
        persona.add(new Constructor( "Luis","Martinez", 15, "Luisito@gmail.com"));
        persona.add(new Constructor( "Pilar","Ruiz", 21, "Luisito51@gmail.com"));
        persona.add(new Constructor( "Carlos","Rodriguez", 25, "Luisito15@gmail.com"));
        persona.forEach(System.out::println);

    }
}
