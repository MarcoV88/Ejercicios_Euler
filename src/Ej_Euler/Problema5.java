package Ej_Euler;

public class Problema5 {
    public static void problema5() {
        long fin = 999999999;

        for (int i = 0; i <=fin; i++){
            boolean comprobar;
            while(comprobar){
                for (int j=0;j<=i;j++){
                    if (i%j==0){
                        comprobar = true;
                    }else {
                        comprobar = false;
                    }
                }
            }
        }
    }
}

