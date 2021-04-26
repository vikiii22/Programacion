package Recursividad;

public class Factorial {
    //El factorial de n es n!=n*(n-1)*(n-2)*......*2*1
    //Ej factorial 6 = 6*5*4*3*2*1=720
    public static void main(String[] args) {
        int n=4;
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }
}
