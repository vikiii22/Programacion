package PracticaExamen;

public class EjercicioExamen {
    private static int[][] mayoresIguales(int[][]a, int[][]b){
        int [][] salida=new int[a.length][b.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j]>b[i][j]){
                    salida[i][j]=a[i][j];
                }else{
                    salida[i][j]=b[i][j];
                }
            }
        }
        return salida;
    }
}
