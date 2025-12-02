package Ej_Euler;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercicio3profe {
    public static void cajeroAutomatico() {
        int billete500 =0;
        int billete200=0;
        int billete100 =0;
        int billete50=0;
        int billete20=0;
        int billete10=0;
        int billete5=0;
        int moneda2=0;
        int moneda1=0;
        int monedac50=0;
        int monedac20=0;
        int monedac10=0;
        int monedac5=0;
        int monedac2=0;
        int monedac1=0;
        int cambio500 =0;
        int cambio200=0;
        int cambio100 =0;
        int cambio50=0;
        int cambio20=0;
        int cambio10=0;
        int cambio5=0;
        int cambio2=0;
        int cambio1=0;
        int cambioc50=0;
        int cambioc20=0;
        int cambioc10=0;
        int cambioc5=0;
        int cambioc2=0;
        int cambioc1=0;
        int caja500=10;
        int caja200=10;
        int caja100=10;
        int caja50=10;
        int caja20=0;
        int caja10=10;
        int caja5=10;
        int caja2=10;
        int caja1=10;
        int caja05=10;
        int caja02=10;
        int caja01=10;
        int caja005=10;
        int caja002=10;
        int caja001=10;
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido al cajero automático Marvi");
        System.out.println("¿Ha comprado algo?(s/n)");
        String comprar = sc.next();
        if (comprar.equals("s")) {
            boolean continuar;
            do {
                System.out.println("Va a pagar en efectivo o tarjeta (e/t). Si no quedan clientes, pulse cualquier tecla diferente de 'e' o 't'");
                String pagar = sc.next();
                if (pagar.equals("e")) {
                    continuar = true;
                    System.out.println("Ingrese el coste total de su compra: ");
                    double coste = sc.nextDouble();
                    int coster = (int) Math.round(coste * 100);

                    System.out.println("Ingrese el dinero: ");
                    double dinero = sc.nextDouble();
                    int dineror = (int) Math.round(dinero * 100);

                    double cambio = (dinero -  coste);
                    int cambior = (int) Math.round(cambio * 100);


                    if (dineror >= coster) {
                        if (dineror >= 50000) {
                            billete500 = (dineror / 50000);
                            dineror -= billete500 * 50000;
                            caja500 += billete500;
                        }
                        if (dineror >= 20000) {
                            billete200 = (dineror / 20000);
                            dineror -= billete200 * 20000;
                            caja200 += billete200;
                        }
                        if (dineror >= 10000) {
                            billete100 = (dineror / 10000);
                            dineror -= billete100 * 10000;
                            caja100 += billete100;
                        }
                        if (dineror >= 5000) {
                            billete50 = (dineror / 5000);
                            dineror -= billete50 * 5000;
                            caja50 += billete50;
                        }
                        if (dineror >= 2000) {
                            billete20 = (dineror / 2000);
                            dineror -= billete20 * 2000;
                            caja20 += billete20;
                        }
                        if (dineror >= 1000) {
                            billete10 = (dineror / 1000);
                            dineror -= billete10 * 1000;
                            caja10 += billete10;
                        }
                        if (dineror >= 500) {
                            billete5 = (dineror / 500);
                            dineror -= billete5 * 500;
                            caja5 += billete5;
                        }
                        if (dineror >= 200) {
                            moneda2 = (dineror / 200);
                            dineror -= moneda2 * 200;
                            caja2 += moneda2;
                        }
                        if (dineror >= 100) {
                            moneda1 = (dineror / 100);
                            dineror -= moneda1 * 100;
                            caja1 += moneda1;
                        }
                        if (dineror >= 50) {
                            monedac50 = (dineror / 50);
                            dineror -= monedac50 * 50;
                            caja50 += monedac50;
                        }
                        if (dineror >= 20) {
                            monedac20 = (dineror / 20);
                            dineror -= monedac20 * 20;
                            caja20 += monedac20;
                        }
                        if (dineror >= 10) {
                            monedac10 = (dineror / 10);
                            dineror -= monedac10 * 10;
                            caja10 += monedac10;
                        }
                        if (dineror >= 5) {
                            monedac5 = (dineror / 5);
                            dineror -= monedac5 * 5;
                            caja5 += monedac5;
                        }
                        if (dineror >= 2) {
                            monedac2 = (dineror / 2);
                            dineror -= monedac2 * 2;
                            caja2 += monedac2;
                        }
                        if (dineror >= 1) {
                            monedac1 = (dineror);
                            caja1 += monedac1;
                        }
                        System.out.println("Ha utilizado " + billete500 + " billetes de 500, " + billete200 + " billetes de 200, " + billete100 + " billetes de 100, " + billete50 + " billetes de 50, " + billete20 + " billetes de 20, " + billete10 + " billetes de 10, " + billete5 + " billetes de 5, " + moneda2 + " monedas de 2, " + moneda1 + " monedas de 1, " + monedac50 + " monedas de 0.5, " + monedac20 + " monedas de 0.2, " + monedac10 + " monedas de 0.1, " + monedac5 + " monedas de 0.05, " + monedac2 + " monedas de 0.02 y " + monedac1 + " monedas de 0.01.");
                        System.out.println(caja500 + ", " +caja200+ ", " +caja100+ ", " +caja50+ ", " +caja20+ ", " +caja10+ ", " +caja5+ ", "+caja2+ ", " +caja1+ ", " +caja05+ ", " +caja02+ ", " +caja01+ ", " +caja005+ ", " +caja002+ ", " +caja001);
                        System.out.println("Su cambio es de "+cambio);
                    } else {
                        System.out.println("Dinero insuficiente");
                    }
                    if (cambior > 0) {
                        if (cambior >= 50000) {
                            cambio500 = (cambior / 50000);
                            if (caja500 >= cambio500) {
                                cambior -= cambio500 * 50000;
                                caja500 -= cambio500;
                            }
                        }
                        if (cambior >= 20000) {
                            cambio200 = (cambior / 20000);
                            if (caja200 >= cambio200) {
                                cambior -= cambio200 * 20000;
                                caja200 -= cambio200;
                            }
                        }
                        if (cambior >= 10000) {
                            cambio100 = (cambior / 10000);
                            if (caja100 >= cambio100) {
                                cambior -= cambio100 * 10000;
                                caja100 -= cambio100;
                            }
                        }
                        if (cambior >= 5000) {
                            cambio50 = (cambior / 5000);
                            if (caja50 <= cambio50) {
                                cambior -= cambio50 * 5000;
                                caja50 -= cambio50;
                            }
                        }
                        if (cambior >= 2000) {
                            cambio20 = (cambior / 2000);
                            if (caja20 >= cambio20) {
                                cambior -= cambio20 * 2000;
                                caja20 -= cambio20;
                            }
                        }
                        if (cambior >= 1000) {
                            cambio10 = (cambior / 1000);
                            if (caja10 >= cambio10) {
                                cambior -= cambio10 * 1000;
                                caja10 -= cambio10;
                            }
                        }
                        if (cambior >= 500) {
                            cambio5 = (cambior / 500);
                            if (caja5 <= cambio5) {
                                cambior -= cambio5 * 500;
                                caja5 -= cambio5;
                            }
                        }
                        if (cambior >= 200) {
                            cambio2 = (cambior / 200);
                            if (caja2 >= cambio2) {
                                cambior -= cambio2 * 200;
                                caja2 -= cambio2;
                            }
                        }
                        if (cambior >= 100) {
                            cambio1 = (cambior / 100);
                            if (caja1 <= cambio1) {
                                cambior -= cambio1 * 100;
                                caja1 -= cambio1;
                            }
                        }
                        if (cambior >= 50) {
                            cambioc50 = (cambior / 50);
                            if (caja50 <= cambioc50) {
                                cambior -= cambioc50 * 50;
                                caja50 -= cambioc50;
                            }
                        }
                        if (cambior >= 20) {
                            cambioc20 = (cambior / 20);
                            if (caja20 >= cambioc20) {
                                cambior -= cambioc20 * 20;
                                caja20 -= cambioc20;
                            }
                        }
                        if (cambior >= 10) {
                            cambioc10 = (cambior / 10);
                            if (caja10 >= cambioc10) {
                                cambior -= cambioc10 * 10;
                                caja10 -= cambioc10;
                            }
                        }
                        if (cambior >= 5) {
                            cambioc5 = (cambior / 5);
                            if (caja5 <= cambioc5) {
                                cambior -= cambioc5 * 5;
                                caja5 -= cambioc5;
                            }
                        }
                        if (cambior >= 2) {
                            cambioc2 = (cambior / 2);
                            if (caja2 >= cambioc2) {
                                cambior -= cambioc2 * 2;
                                caja2 -= cambioc2;
                            }
                        }
                        if (cambior >= 1) {
                            cambioc1 = (cambior);
                            if (caja1 <= cambioc1) {
                                caja1 -= cambioc1;
                            }
                        }
                        System.out.println("Su cambio es de: " + cambio500 + " billetes de 500, " + cambio200 + " billetes de 200, " + cambio100 + " billetes de 100, " + cambio50 + " billetes de 50, " + cambio20 + " billetes de 20, " + cambio10 + " billetes de 10, " + cambio5 + " billetes de 5, " + cambio2 + " monedas de 2, " + cambio1 + " monedas de 1, " + cambioc50 + " monedas de 0.5, " + cambioc20 + " monedas de 0.2, " + cambioc10 + " monedas de 0.1, " + cambioc5 + " monedas de 0.05, " + cambioc2 + " monedas de 0.02 y " + cambioc1 + " monedas de 0.01.");
                    } else {
                        System.out.println("Has dado el dinero justo");
                    }
                    System.out.println(caja500 + ", " +caja200+ ", " +caja100+ ", " +caja50+ ", " +caja20+ ", " +caja10+ ", " +caja5+ ", "+caja2+ ", " +caja1+ ", " +caja05+ ", " +caja02+ ", " +caja01+ ", " +caja005+ ", " +caja002+ ", " +caja001);

                } else if (pagar.equals("t")) {
                    continuar = true;
                    System.out.println("Tiene el cajero automático a su derecha, gracias.");
                } else {
                    continuar = false;
                    System.out.println("Tenga un buen día, adiós");
                }

            } while(continuar);
        }else {
            System.out.println("Vaya, que pena.... Que tengas un buen día");
        }
    }
}

