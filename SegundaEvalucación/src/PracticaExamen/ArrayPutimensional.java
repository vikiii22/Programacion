package PracticaExamen;

public class ArrayPutimensional {
    public static void main(String[] args) {
        int [][] numeros={{1,2,3},{12,4,8}};

        for (int i=0;i<numeros.length;i++){
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.println(numeros[i][j]);
            }
        }
    }
}
