public class CadenaDividida {
    public static void main(String[] args) {
        String cadena = "Los manines de SMR en DAM";
                int longitud = 4;
                int yaEscritosEnUnaLinea = 0;
                for (int i = 0; i < cadena.length(); i++) {
                    System.out.print(cadena.charAt(i));
                    yaEscritosEnUnaLinea++;
                    if (yaEscritosEnUnaLinea == longitud) {
                        System.out.println();
                        yaEscritosEnUnaLinea = 0;
            }
        }
    }
}