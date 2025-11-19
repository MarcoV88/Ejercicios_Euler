package Ej_Euler;

public class Problema4 {
    public static void problema4() {
        int maxPalindromo = 0;

        for (int i = 999; i >= 100; i--) {
            for (int j = i; j >= 100; j--) { // Evitamos repetir pares
                int producto = i * j;
                if (esPalindromo(producto) && producto > maxPalindromo) {
                    maxPalindromo = producto;
                }
            }
        }

        System.out.println("El palíndromo más grande de 3 cifras es: " + maxPalindromo);
    }

    public static boolean esPalindromo(int num) {
        String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder(str);
        return str.equals(sb.reverse().toString());
    }
}
