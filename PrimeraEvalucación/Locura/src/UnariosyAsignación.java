public class UnariosyAsignación {
    public static void main(String[] args) {
        int a=9;
        int b=+a;
        int c=-a;
        a++; //operador incremento
        //a vale 10;
        a++;
        //a vale 11;
        b=a++;
        System.out.println(a + "  " + b);
        //a vale 12 y b 11;
        b=++a;
        //a vale 13 y b vale 13
        System.out.println(a + "  " + b );
    }
}
