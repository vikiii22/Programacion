public class ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] tabla;
        tabla=new int[4][];
        tabla[0]=new int[3];
        tabla[1]=new int[5];
        tabla[2]=new int[6];
        tabla[3]=new int[4];
        int[] num={43,5,4,2,1,4,8,4,5,2,1,3,5};
        char[][] sopanumeros={
                {5,4,6,5},
                {2,1,4,7},
                {3,1,2,8,10},
                {10,5,1,2}
        };
        System.out.println(sopanumeros[2][4]);
        for (char[] fila:sopanumeros){
            for (char numero:fila){
                System.out.print(numero);
            }
            System.out.println();
        }
        for (int i = 0; i < sopanumeros.length; i++) {
            for (int j = 0; j < sopanumeros[i].length; j++) {
                System.out.print(i+","+j);
            }
            System.out.println();
            System.out.println();
        }
    }
}
