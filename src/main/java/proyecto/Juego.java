package proyecto;

import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// Creacion de un mazo y se barajan las cartas
        Mazo mazo = new Mazo();
        mazo.barajar();
// Creacion de una mano para el jugador
        Mano jugador = new Mano();

        while (true) {
            System.out.println("¿Quieres una carta? (si / no)");
            String respuesta = scanner.nextLine();

            if (respuesta.equalsIgnoreCase("si")) {
            // Con esto pediremos una carta al mazo y se mostrara la mano actual del jugador
                jugador.pedirCarta(mazo);
                System.out.println("Tu mano:\n" + jugador);
            // Con esto verificaremos si el jugador se ha pasado de la puntuacion
                if (jugador.finDeJuego()) {
                    System.out.println("¡Te has pasado de 21! Has perdido :( ");
                    break;
                }
            } else if (respuesta.equalsIgnoreCase("no")) {
                // Se indicara si el jugador se ha plantado y se mostrara su puntuacion final
                System.out.println("Te has plantado. Puntuación final: " + jugador.valorMano());
                break;
            } else {
                System.out.println("Respuesta no válida. Introduce 'si' o 'no'.");
            }
        }
        // Cerramos el escaner
        scanner.close();
    }
}
