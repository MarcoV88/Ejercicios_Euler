package Ej_Euler;

public class Problema5 {
    public static void problema5() {
        int fin = 20;
        long num = 20;
        boolean encontrado = false;

        while (!encontrado) {
            encontrado = true;
            for (int i = 1; i <= fin; i++) {
                if (num % i != 0) {
                    encontrado = false;
                    break;
                }
            }
            if (!encontrado) {
                num += 1;
            }
        }

        System.out.println(num);
    }

}
