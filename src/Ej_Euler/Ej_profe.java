package Ej_Euler;

import java.util.Scanner;

public class Ej_profe {
    public static void ej_profe() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número del cuál quiera saber su factorial: ");
        int factorial = sc.nextInt();
        int fact = factorial;

        for (int i = factorial-1; i >1; i--) {
            fact *= i;
        }
        System.out.println("El resultado es: " + fact);
    }
}
