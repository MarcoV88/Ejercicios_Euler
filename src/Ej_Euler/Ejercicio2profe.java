package Ej_Euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//Generador de DNI
public class Ejercicio2profe {
    public static void ejercicio2profe() {

        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();
        List<String> letra = new ArrayList<>(Arrays.asList( "T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"));
        System.out.println("Bienvenido al comprobador de DNI");

        System.out.println("Ingrese su DNI: ");
        String dni = sc.nextLine();

        dni=dni.toUpperCase();

        boolean comprobar = dni.length() == 9;
        int numero=0;

        if (comprobar) {
            System.out.println(dni);
            int[] digitos = new int[dni.length()];
            for (int i = 0; i < dni.length() - 1; i++) {
                char c = dni.charAt(i);
                if (Character.isDigit(c)) {
                    digitos[i] = Character.getNumericValue(c);
                    lista.add(digitos[i]);
                    numero = numero * 10 + digitos[i];
                } else {
                    System.out.println("El DNI debe tener 8 números antes de poner una letra");
                }
            }
            int resto = numero % 23;

            String ultimo = dni.substring(dni.length() - 1);;
            String letrilla = letra.get(resto);
            if (letrilla.equals(ultimo)) {
                System.out.println("Su DNI es correcto");
            }else {
                System.out.println("El DNI es incorrecto");
            }
        }
        else{
            System.out.println("El DNI no existe");
        }
    }
}
