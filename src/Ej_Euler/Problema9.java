package Ej_Euler;

public class Problema9 {
    public static void problema9(){
        int a;
        int b;
        int c;
        int resultado;

        for (a=1; a<=1000; a++) {
            for (b=1; b<=1000; b++) {
                for (c=1; c<=1000; c++) {
                    if (a*a + b*b == c*c && a+b+c==1000 && a<b) {
                        resultado=a*b*c;
                        System.out.println(resultado);
                    }
                }
            }
        }
    }
}
