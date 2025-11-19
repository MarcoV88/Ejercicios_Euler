package Ej_Euler;

public class Problema1 {
    public static void problema1() {
        long inicio = 0;
        long fin = 1000;
        long suma = 0;

        for (long i =inicio; i <fin; i++) {
            if (i%3==0 || i%5==0) {
                suma+=i;
            }
        }
        System.out.println(suma);
    }
}
