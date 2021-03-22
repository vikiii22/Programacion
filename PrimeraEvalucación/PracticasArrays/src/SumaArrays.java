public class SumaArrays {
    public static void main(String[] args) {
        int [] numero1={3,4,5,0,0,0,1};
        int [] numero2={1,2,1,1,1,2,3};

        imprimeArray(numero1);
        imprimeArray(numero2);
        System.out.println("----------------");
        imprimeArray (SumaArrays(numero1,numero2));

    }
    static void imprimeArray (int []array){
        String salida =" ";
        for (int i:array){
            salida+=i+" ";
        }
        System.out.println(salida+" ");
    }
    static int suma(int uno, int otro){
        return uno+otro;
    }
    static int[] SumaArrays(int[]uno, int[]otro){
        int[] vectorsuma = new int[uno.length];
        for (int i = 0; i < vectorsuma.length; i++) {
            vectorsuma[i]=uno[i]+otro[i];
        }
        return vectorsuma;
    }
}