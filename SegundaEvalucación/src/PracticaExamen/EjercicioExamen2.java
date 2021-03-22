package PracticaExamen;

public class EjercicioExamen2 {
    private static int[][] mayoresCuadradas(int[][] a, int[][]b){
        int[][] pequenya;
        int[][] mayores;
        int[][] salida;

        if (a.length > b.length){
            mayores=a;
            pequenya=b;
        }else {
            mayores=b;
            pequenya=a;
        }

        salida=new int[mayores.length][pequenya.length];
        for (int i = 0; i < pequenya.length; i++) {
            for (int j = 0; j < pequenya.length; j++) {
                salida[i][j]=pequenya[i][j];
            }

        }
        return mayoresCuadradas(mayores,salida);
    }
}
