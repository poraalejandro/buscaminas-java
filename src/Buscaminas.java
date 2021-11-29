import java.util.*;

public class Buscaminas {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int[][] tablero = new int[8][8];

        int ntminas = 0;

        int intento = 75;

        int minasRestantes = 10;

        generarMinas(tablero, ntminas);

        System.out.println("\n-x----------------------------------------------------x-");
        System.out.println("  Ingresa las coordenas en el rango del 1 al 8");

        do {
            int x, y;
            int nminas = 0;

            do {
                System.out.println("\n-x----------------------------------------------------x-");
                System.out.println("\n	Intento :" + intento + " , Cual es su coordenada? \n");

                System.out.print("\n		Fila:  ");
                x = leer.nextInt();

                System.out.print("\n		Columna:  ");
                y = leer.nextInt();

                if (x == 0 || y == 0 || x > 8 || y > 8)
                    System.out.println("\n	¡Coordenadas incorrectas! \n");
            } while (x == 0 || y == 0 || x > 8 || y > 8);

            x = x - 1;
            y = y - 1;

            if (tablero[x][y] == 0) {

                if (x == 0 && y == 0) {
                    nminas = nminas + tablero[x + 1][y];
                    nminas = nminas + tablero[x + 1][y + 1];
                    nminas = nminas + tablero[x][y + 1];
                } else {
                    if (y == 0) {
                        if (x + 1 < 8)
                            nminas = nminas + tablero[x + 1][y];
                        nminas = nminas + tablero[x - 1][y];
                        nminas = nminas + tablero[x - 1][y + 1];
                        nminas = nminas + tablero[x][y + 1];
                        nminas = nminas + tablero[x + 1][y + 1];

                    } else {

                        if (x - 1 >= 0)
                            nminas = nminas + tablero[x - 1][y - 1];
                        nminas = nminas + tablero[x][y - 1];
                        if (x + 1 < 8)
                            nminas = nminas + tablero[x + 1][y - 1];
                        if (x + 1 < 8)
                            nminas = nminas + tablero[x + 1][y];
                        if (x - 1 >= 0)
                            nminas = nminas + tablero[x - 1][y];
                        if (x - 1 >= 0 && y + 1 < 8)
                            nminas = nminas + tablero[x - 1][y + 1];
                        if (y + 1 < 8)
                            nminas = nminas + tablero[x][y + 1];
                        if (x + 1 < 8 && y + 1 < 8)
                            nminas = nminas + tablero[x + 1][y + 1];
                    }
                }

                System.out.print("\n	Mina no encontrada. ");

                if (intento > minasRestantes)
                    System.out.print("	Alrededor hay: " + nminas);
            } else {
                minasRestantes = minasRestantes - 1;
                System.out.println("\n	¡Acertaste!, Mina Eliminada, quedan " + minasRestantes + " minas");
            }
            System.out.println("\n	Intentos restantes: " + (intento - 1));

            intento = intento - 1;
        } while (intento >= minasRestantes && intento > 0 && minasRestantes > 0);

        if (minasRestantes == 0)
            System.out.println("		¡GANASTE!");

        if (minasRestantes > intento)
            System.out.println("		¡PERDISTE!    (Exceso de minas restantes " + minasRestantes + ")\n\n");

        if (intento == 0)
            System.out.println("		¡PERDISTE!");
    }

    private static void generarMinas(int[][] tablero, int ntminas) {
        double z;
        double w;

        do {
            w = (int) (Math.random() * 8);
            z = (int) (Math.random() * 8);

            if (z != 0 && w != 0 && z != 8 - 1 && w != 8 - 1) {
                tablero[(int) w][(int) z] = 1;
                ntminas++;
            }
        } while (ntminas <= 10);
    }
}