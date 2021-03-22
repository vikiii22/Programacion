import java.util.*;

public class Colas {
    public static void main(String[] args) {

        //Hay dos tipos de colas:
        //LIFO (pila)
        //FIFO (cola)
        Deque<Character> cola;
        cola=new LinkedList<>();
        Scanner sc=new Scanner(System.in);
        String expresion=sc.nextLine();
        List<Character> poner = Arrays.asList('(', '[', '{');
        for(char c:expresion.toCharArray()){
            if(c=='('){
                cola.push(c);
            }else if (c==')'){
                char sacado=cola.pop();
                if (sacado=='(' && c!=')'){
                    System.out.println("MAL");
                }
                if (sacado=='{' && c!='}'){
                    System.out.println("MAL");
                }
                if (sacado=='[' && c!=']'){
                    System.out.println("MAL");
                }
            }
        }
        System.out.println(cola.isEmpty() ? "Correcta" : "Incorrecta");
    }

}
