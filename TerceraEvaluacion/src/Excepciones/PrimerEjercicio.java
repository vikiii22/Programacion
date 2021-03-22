package Excepciones;

public class PrimerEjercicio {
    public static void main(String[] args) {
        metodoExcepciones();
    }

    private static void metodoExcepciones() {
        try{
            throw new IllegalStateException("Error provocado");

        }catch (IllegalStateException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Siempre paso por aquí");
        }
    }
}
