package FicherosTexto;

import java.io.*;

public class NumerosHastaElCien {
    public static void main(String[] args) {
        try(BufferedWriter escritor=new BufferedWriter(new FileWriter("numeros.txt"))){
            int numeros=1;
            for (numeros = 1; numeros <= 100; numeros++) {
                escritor.write(" "+numeros);
                escritor.newLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
