package Ej_Euler;

public class Problema_inicial {

    public static void problema_inicial() {
        long inicio = 0;
        long fin = 647000;
        long suma = 0;

        for (long i =inicio; i <=fin; i++) {
            if (i%2==0) {
                suma+=0;
            }
            else {
                suma+=i*i;
            }

        }
        System.out.println(suma);
    }
}
