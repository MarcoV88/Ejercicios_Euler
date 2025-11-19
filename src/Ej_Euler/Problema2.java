package Ej_Euler;

import java.util.ArrayList;
import java.util.List;

public class Problema2 {
    public static void problema2(){

        List<Integer> lista = new ArrayList<>();
        int suma = 0;
        lista.add(1);
        lista.add(2);
        for (int i=0;i<400000;i++){
            if (lista.get(i) <= 4000000) {
                if (lista.get(i) % 2 == 0) {
                    suma += lista.get(i);
                }
            } else {
                break;
            }
            lista.add(lista.get(i) + lista.get(i + 1));
        }
        System.out.println(suma);
    }
}
