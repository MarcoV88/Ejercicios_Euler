package Ej_Euler;

public class Problema7 {
    public static void problema7() {
        int contador = 0;
        int num = 2;
        do {
            boolean esPrimo = true;
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                contador++;
            }
            if (contador < 10001) {
                num++;
            }

        }while (contador < 10001);

        System.out.println("El número primo 10001 es: " + num);
    }
}
