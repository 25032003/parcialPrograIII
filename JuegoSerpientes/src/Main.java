//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//public class JuegoSerpientesEscaleras {
//    public static void main(String[] args) {
//        int[]A origenCasillasEspeciales = {7, 11, 31, 30, 40, 43, 50, 59};
//        int[] destinoCasillasEspeciales = {38, 37, 46, 2, 21, 60, 5, 42};
//
//        int[] tablero = new int[64];
//        Arrays.fill(tablero, -1); // Inicializar todo el tablero con -1
//
//        // Asignar destinos de casillas especiales en el tablero
//        for (int i = 0; i < origenCasillasEspeciales.length; i++) {
//            tablero[origenCasillasEspeciales[i] - 1] = destinoCasillasEspeciales[i] - 1;
//        }
//
//        // Inicializar juego
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//
//        int[] jugadores = {1, 1}; // Posiciones iniciales de los jugadores
//        int jugadorActual = 0; // Índice del jugador que juega actualmente
//
//        int consecutivosSeis = 0;
//
//        while (jugadores[jugadorActual] < tablero.length) {
//            // Turno del jugador
//            System.out.println("Turno del Jugador " + (jugadorActual + 1));
//            System.out.println("Presiona Enter para tirar el dado.");
//            scanner.nextLine();
//
//            // Tirar el dado
//            int dado = random.nextInt(6) + 1;
//            System.out.println("Resultado del dado: " + dado);
//
//            // Verificar si sacó un 6
//            if (dado == 6) {
//                consecutivosSeis++;
//                if (consecutivosSeis == 3) {
//                    System.out.println("¡Jugador " + (jugadorActual + 1) + " ha sacado 3 seis consecutivos! Vuelve a la posición 1 y queda bloqueado.");
//                    jugadores[jugadorActual] = 0;
//                    consecutivosSeis = 0;
//                }
//            } else {
//                consecutivosSeis = 0;
//            }
//
//            // Mover al jugador
//            jugadores[jugadorActual] += dado;
//
//            // Verificar si cayó en una casilla especial
//            if (tablero[jugadores[jugadorActual] - 1] != -1) {
//                jugadores[jugadorActual] = tablero[jugadores[jugadorActual] - 1] + 1;
//                System.out.println("¡Cayó en una casilla especial! Avanza a la posición " + jugadores[jugadorActual]);
//            }
//
//            // Verificar si se pasa de la última posición
//            if (jugadores[jugadorActual] > tablero.length) {
//                int retroceso = jugadores[jugadorActual] - tablero.length;
//                jugadores[jugadorActual] = tablero.length - retroceso;
//                System.out.println("Se pasó. Retrocede " + retroceso + " posiciones.");
//            }
//
//            System.out.println("Posición del Jugador " + (jugadorActual + 1) + ": " + jugadores[jugadorActual]);
//
//            // Cambiar al siguiente jugador
//            jugadorActual = (jugadorActual + 1) % jugadores.length;
//        }
//
//        // Finalizar juego
//        System.out.println("¡Jugador " + (jugadorActual + 1) + " ha ganado!");
//        scanner.close();
//    }
//}
