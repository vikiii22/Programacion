public class MaximoArray {
    public static void main(String[] args) {
        int[] vector = {21, 4, 5, 8, 4, 6, 0, 2, 5, 1, 5, 4, 6, 8};
        int maximo = vector[0];
        imprimeArray(vector);
        for (int numerocadavuelta : vector) {
            maximo = numerocadavuelta;
        }
        System.out.println("El máximo es: " + maximo);
    }

    static void imprimeArray(int[] array) {
        String salida = " ";
        for (int i : array) {
            salida += i + " ";
        }
        System.out.println(salida + " ");
    }
}