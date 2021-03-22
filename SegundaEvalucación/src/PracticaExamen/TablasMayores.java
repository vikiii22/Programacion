package PracticaExamen;

public class TablasMayores {
    private static int[][]numeros (int a[][], int b[][]){

        int[][] pequenyo;
        int[][] mayor;
        int[][] salida;

        if (a.length<b.length){
            mayor=a;
            pequenyo=b;
        }else{
            pequenyo=a;
            mayor=b;
        }
        salida=new int[mayor.length][pequenyo.length];
        for (int i = 0; i < pequenyo.length; i++) {
            for (int j = 0; j < pequenyo.length; j++) {
                salida[i][j]=pequenyo[i][j];
            }
        }
        return numeros(mayor,salida);
    }
}
