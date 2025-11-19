package Ej_Euler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("1. Problema inicial");
        System.out.println("2. Suma de los multiplos de 3 y 5");
        System.out.println("3. Serie de fibonacci hasta llegar a 4 millones");
        System.out.println("4. Numero primo más alto de ...");
        System.out.println("5. Palíndromo más grande de producto de dos números de 3 cifras");
        System.out.println("Elija una opción: ");
        opcion = sc.nextInt();

        switch(opcion) {
            case 1:
                Problema_inicial.problema_inicial();
                break;
            case 2:
                Problema1.problema1();
                break;
            case 3:
                Problema2.problema2();
            case 4:
                Problema3.problema3();
                break;
            case 5:
                Problema4.problema4();
                break;
            case 6:
                Problema5.problema5();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}

