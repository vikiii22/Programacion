import java.util.Arrays;

public class QuitarElementoArray {
    public static void main(String[] args) {
        int [] array={1,2,4,5,8,6,7,3,2,0};
        System.out.println(Arrays.toString(array));
        int []quitadoEl4=quitar(array,8);
        System.out.println(Arrays.toString(quitadoEl4));

        for (int numero:quitar(array,8)){
            //System.out.println(numero);
        }
    }
    private static int[]quitar(int[] array, int numeroMalvado){
        int contadorBuenos=0;
        for (int numero:array){
            if (numero!=numeroMalvado)contadorBuenos++;
        }
        int[] salida = new int [contadorBuenos];
        int lugarInserccionBuenos=0;
        for (int n: array){
            if (n!=numeroMalvado){
                salida[lugarInserccionBuenos++]=n;
            }
        }
        return salida;
    }
}
