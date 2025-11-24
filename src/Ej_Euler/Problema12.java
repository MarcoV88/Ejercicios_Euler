package Ej_Euler;


import java.util.ArrayList;
import java.util.List;

public class Problema12 {
    public static void problema12() {
        int contador=0;
        int suma=0;
        List<Integer> lista=new ArrayList<Integer>();
        do{
            for (int i=0 ;i<=10; i++ ) {
                suma+=i;
//                System.out.println(suma);

//                if (i%lista.getFirst()==0){
//                    lista.removeFirst();
//                    contador++;
//                }
            }


        }while (contador<500);
//        System.out.println("Suma: "+suma);
        System.out.println(lista);
    }
}
