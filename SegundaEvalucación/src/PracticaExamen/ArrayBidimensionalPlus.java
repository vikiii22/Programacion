package PracticaExamen;

public class ArrayBidimensionalPlus {
    public static void main(String[] args) {
        int [][] matriz={
                {10,21,21,51},
                {27,41,10,31}
        };

        /*for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println(matriz[i][j]);
            }
        }*/
        for (int [] fila:matriz) {
            for (int z:fila) {
                System.out.println(z);
            }
        }
    }
}
