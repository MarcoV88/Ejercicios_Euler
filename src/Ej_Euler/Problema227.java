package Ej_Euler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Problema227 {
    public static void problema227() {

        Random rand = new Random();
        int contador=0;
        int pos1=1;
        int pos2=51;

        do {
            int dado1= rand.nextInt(1, 7);
            int dado2= rand.nextInt(1, 7);
            if(dado1==1){
                System.out.println("El dado 1 ha cambiado su posición a la izquierda");
                contador++;
                System.out.println("LLevais "+contador+ " turnos");
                pos1-=1;
                if (pos1 < 1){
                    pos1 = 100;
                }
                System.out.println(pos1);
            }
            else if(dado1==6){
                System.out.println("El dado 1 ha cambiado su posición a la derecha");
                contador++;
                System.out.println("LLevais "+contador+ " turnos");
                pos1+=1;
                if (pos1 > 100){
                    pos1 = 1;
                }
                System.out.println(pos1);
            }
            else if (dado1 < 6 && dado1>1){
                contador++;
            }
            if(dado2==1){
                System.out.println("El dado 2 ha cambiado su posición a la izquierda");
                System.out.println("LLevais "+contador+ " turnos");
                pos2-=1;
                if (pos2 < 1){
                    pos2 = 100;
                }
                System.out.println(pos2);
            }
            else if(dado2==6){
                System.out.println("El dado 2 ha cambiado su posición a la derecha");
                System.out.println("LLevais "+contador+ " turnos");
                pos2+=1;
                if (pos2 > 100){
                    pos2 = 1;
                }
                System.out.println(pos2);
            }
            else if (dado2<6 && dado2>1){
            }
        }while(pos1!=pos2);
        System.out.println("Se ha logrado en "+contador+ " turnos y en la posicion "+pos1);
    }
}
