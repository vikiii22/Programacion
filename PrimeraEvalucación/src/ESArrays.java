public class ESArrays {
    //Hacer un método auxiliar que señale una posición en un Array
    public static void main(String[] args) {
        int [] vector={3,2,5,7,8,0,1};
        senyalaposicion(vector,3);

    }

    private static String senyalaposicion(int [] vector, int i){
        vectorcadena(vector);
        return "";
    }

    private static void vectorcadena(int [] vector){
        String salida = "Array: {";
        //unimos todo con comas
        for (int i:vector) {
            salida+=i+", ";
        }
        System.out.println(salida);
    }
}
