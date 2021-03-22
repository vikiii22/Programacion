public class ParesArrays {
    public static void main(String[] args) {
        int[] numero = {1, 2, 5, 4, 6, 9, 10, 7, 8};
        imprimearray(numero);
    }

    static void imprimearray(int[] numero) {
        int numerospares=0;
        String salida = "";
        for (int i : numero) {
            salida+=i+" ";
            //System.out.println(salida);
            if (i % 2 == 0) {
                numerospares=i;
            }
            System.out.print(numerospares+" ");
        }
    }
}
