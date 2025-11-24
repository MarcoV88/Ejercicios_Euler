package Ej_Euler;

import java.util.ArrayList;
import java.util.List;

public class Problema10 {
    public static void problema10() {
        List <Integer> lista = new ArrayList<>();
        int inicio = 0;
        int fin = 2000000;
        long suma = 0;


        for (int i = inicio; i <= fin; i++) {
            if (i<2) continue;
            boolean continuar = true;
            for  (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continuar = false;
                    break;
                }
            }
            if (continuar){
                lista.add(i);
                suma += i;
            }
        }
        System.out.println("Suma: "+suma);
    }
}
