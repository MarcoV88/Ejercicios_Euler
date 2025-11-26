package Ej_Euler;

import java.util.ArrayList;
import java.util.List;

//Tienes 2 robots donde en cada robot puedes hacer tres acciones: 1. moverse, 2. esperar, 3. terminar. Hay 100 posiciones, ellos parten desde el 0. Van por turnos (le dices que se mueva a x
//  pos y por cada cambio de pos se le suma un turno) y hay que hacerlo de la forma mas efectiva
//N6 A4 N8 A3 N2 N7
public class Ejercicio2profe {
    public static void main(String[] args) {
        int pos1=0;
        int pos2=0;
        List<Integer> robot1 = new ArrayList<Integer>();
        List<Integer> robot2 = new ArrayList<Integer>();

            robot1.add(2);
            robot1.add(9);
            robot1.add(37);
            robot1.add(27);
            robot1.add(56);

            robot2.add(4);
            robot2.add(31);
            robot2.add(9);
            robot2.add(64);
            robot2.add(86);


            for (int i = 0; i < Math.max(robot1.size(), robot2.size()); i++) {
                int rob1 = i < robot1.size() ? robot1.get(i) : robot1.get(robot1.size() - 1);
                int rob2 = i < robot2.size() ? robot2.get(i) : robot2.get(robot2.size() - 1);

                System.out.println("Robot1 -> " + rob1 + ", Robot2 -> " + rob2);

                while (pos1 != rob1 || pos2 != rob2) {
                    if (pos1 < rob1 && pos2 < rob2) {
                        pos1++;
                        pos2++;
                    }
                    else if (pos1 < rob1 && pos2 > rob2) {
                        pos2--;
                        pos1++;
                    }
                    else if (pos1 > rob1 && pos2 < rob2) {
                        pos1--;
                        pos2++;
                    }
                    else if (pos1 > rob1 && pos2 > rob2) {
                        pos2--;
                        pos1--;
                    }

                    System.out.println("Robot1 en " + pos1 + ", Robot2 en " + pos2);
                }
            }

            System.out.println("¡Finalizado!");
            System.out.println("Posición final Robot1: " + pos1);
            System.out.println("Posición final Robot2: " + pos2);

    }
}
