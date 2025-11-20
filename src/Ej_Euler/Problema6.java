package Ej_Euler;

public class Problema6 {
    public static void problema6() {
        int sum=0;
        int sum_cuadrado=0;
        int resta;
        int cuadrado;
        int suma=0;


        for (int i=1;i<=100;i++) {
            cuadrado=i*i;
            sum +=cuadrado;
            suma +=i;
        }
        for (int j=1;j<=100;j++) {
            sum_cuadrado= suma * suma;
        }
        resta = sum_cuadrado - sum;
        System.out.println(sum_cuadrado);
        System.out.println(sum);
        System.out.println(resta);
    }
}
