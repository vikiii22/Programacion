package ResolviendoExamen18022021;

import java.util.List;

public class ArrayExamen {
    public static void main(String[] args) {
        int [][] primera={
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4},
                {1,2,3,4}};
        int [][] segunda={
                {1,2,9,4},
                {1,2,9,4},
                {1,2,9,4},
                {1,2,9,4}};
        int [][] salida=matrizMaxima(primera,segunda);

        int [][] salidaOtra=matrizMaximaDistinta(primera,segunda);
        }
        private static int[][] matrizMaximaDistinta(int [][] primera, int [][] segunda) {
            int[][] grande;
            int[][] pequenya;
            if (primera.length > segunda.length) {
                grande = primera;
                pequenya = segunda;
            } else {
                grande = segunda;
                pequenya = primera;
            }
            int[][] expandida = new int[grande.length][pequenya.length];
            for (int i = 0; i < pequenya.length; i++) {
                for (int j = 0; j < grande.length; j++) {

                    return matrizMaximaDistinta(expandida, grande);
                }
            }
            return matrizMaximaDistinta(expandida, grande);
        }
    private static int[][] matrizMaxima(int[][] una, int [][] otra){
        int[][] salida;
        int filas=una.length;
        int columnas=una[0].length;
        salida=new int[filas][columnas];
        for (int i=0;i<filas;i++) {
            for (int j = 0; j < columnas; j++) {
                int mayor = una[i][j] > otra[i][j] ? una[i][j] : otra[i][j];
                salida[i][j] = mayor;
            }
        }

        return salida;
    }
}