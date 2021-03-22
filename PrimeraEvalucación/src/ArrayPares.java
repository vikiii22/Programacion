import javax.swing.*;

public class ArrayPares {
    public static void main(String[] args) {
        int[] numero1={3,4,5,0,0,0,1};
        int[] numero2={1,2,1,1,1,2,3};

        imprimeArray(numero1);
        imprimeArray(numero2);
        imprimeArray(sumaDosArrays(numero1,numero2));
        
    }
    static void imprimeArray(int[] array){
        String salida="";
        for (int i:array){
            salida+=i+" ";
        }
        System.out.println(salida);
    }
    static int suma(int numero1, int numero2){
        return numero1+numero2;
    }
    static int[] sumaDosArrays(int[] numero1, int[] numero2){
        int[] suma=new int[numero1.length];
        for (int i = 0; i < suma.length; i++) {
            suma[i]=numero1[i]+numero2[i];
        }
        return suma;
    }
}