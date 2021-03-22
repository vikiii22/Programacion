public class CincoDigitos {
        public static void main(String[] args) {
            int numero1 = 0;
            int numero2 = 0;
            int numero3 = 0;
            int numero4 = 0;
            int numero5 = 0;

            for (numero1 = 0; numero1 < 10; numero1++) {
                if (numero1 == 3) {
                }
                for (numero2 = 0; numero2 < 10; numero2++) {
                    if (numero2 == 3) {
                    }
                    for (numero3 = 0; numero3 < 10; numero3++){
                        if (numero3 == 3) {
                        }
                        for (numero4 = 0; numero4 < 10; numero4++) {
                            if (numero4 == 3) {
                            }
                            for (numero5 = 0; numero5 < 10; numero5++) {
                                if (numero5 == 3) {
                                    System.out.println("E");
                                }
                                System.out.println(numero1+"-"+numero2+"-"+numero3+"-"+numero4+"-"+numero5);
                            }
                        }
                    }
                }
            }
        }
    }
