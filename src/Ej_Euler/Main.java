package Ej_Euler;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        System.out.println("0. Problema inicial");
        System.out.println("1. Suma de los multiplos de 3 y 5");
        System.out.println("2. Serie de fibonacci hasta llegar a 4 millones");
        System.out.println("3. Numero primo más alto de ...");
        System.out.println("4. Palíndromo más grande de producto de dos números de 3 cifras");
        System.out.println("5. Menor número divisible entre todos los números (1-20)");
        System.out.println("6. Diferencia entre la suma de los cuadrados del 1 al 100 y el cuadrado de la suma del 1 al 100");
        System.out.println("7. Número primo 10001");
        System.out.println("8. Encuentra el mayor producto de trece dígitos consecutivos en el número de 1000 dígitos dado");
        System.out.println("9. Terna pitagórica");
        System.out.println("10. Primos debajo de 2 millones");
        System.out.println("11. ");
        System.out.println("12. Primer número triangular con 500 divisores");
        System.out.println("100. Ej_profe");

        System.out.println("Elija una opción: ");
        opcion = sc.nextInt();

        switch(opcion) {
            case 0:
                Problema_inicial.problema_inicial();
                break;
            case 1:
                Problema1.problema1();
                break;
            case 2:
                Problema2.problema2();
            case 3:
                Problema3.problema3();
                break;
            case 4:
                Problema4.problema4();
                break;
            case 5:
                Problema5.problema5();
                break;
            case 6:
                Problema6.problema6();
                break;
            case 7:
                Problema7.problema7();
                break;
            case 8:
                Problema8.problema8();
                break;
            case 9:
                Problema9.problema9();
                break;
            case 10:
                Problema10.problema10();
                break;
            case 11:
                Problema11.problema11();
                break;
            case 12:
                Problema12.problema12();
                break;
            case 100:
                Ej_profe.ej_profe();
                break;
            default:
                System.out.println("Opción no válida");
                break;
        }
    }
}

