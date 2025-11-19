package Ej_Euler;

import java.util.ArrayList;
import java.util.List;

public class Problema3 {
    public static void problema3() {
        List<Integer> lista = new ArrayList<>();
        long numero = 600851475143L;
        int fin = 1000000;
        for (int i = 0; i <= fin; i++) {
            if (i<2) continue;
            boolean continuar = true;
            for  (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continuar = false;
                    break;
                }
            }
            if (continuar && numero%i==0){
                lista.add(i);
            }
        }
        System.out.println("Primos: "+lista);
    }
}
