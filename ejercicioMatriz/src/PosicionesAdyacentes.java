import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PosicionesAdyacentes {

    public static List<int[]> obtenerPosicionesAdyacentes(int[][] matriz, int fila, int columna) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        List<int[]> adyacentes = new ArrayList<>();

        // Verificar posición arriba
        if (fila - 1 >= 0) {
            adyacentes.add(new int[]{fila - 1, columna});
        }

        // Verificar posición abajo
        if (fila + 1 < filas) {
            adyacentes.add(new int[]{fila + 1, columna});
        }

        // Verificar posición izquierda
        if (columna - 1 >= 0) {
            adyacentes.add(new int[]{fila, columna - 1});
        }

        // Verificar posición derecha
        if (columna + 1 < columnas) {
            adyacentes.add(new int[]{fila, columna + 1});
        }

        return adyacentes;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = obtenerNumeroValido(scanner);

        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = obtenerNumeroValido(scanner);

        int[][] matriz = new int[filas][columnas];

        System.out.println("Ingrese los elementos de la matriz:");

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.printf("Elemento en la posición (%d, %d): ", i, j);
                matriz[i][j] = obtenerNumeroValido(scanner);
            }
        }

        System.out.print("Ingrese la fila de la posición deseada: ");
        int filaPosicion = obtenerNumeroValido(scanner, filas);

        System.out.print("Ingrese la columna de la posición deseada: ");
        int columnaPosicion = obtenerNumeroValido(scanner, columnas);

        List<int[]> adyacentes = obtenerPosicionesAdyacentes(matriz, filaPosicion, columnaPosicion);

        System.out.println("\nMatriz:");
        mostrarMatriz(matriz);

        System.out.printf("\nPosiciones adyacentes a la posición (%d, %d) son:%n", filaPosicion, columnaPosicion);
        for (int[] posicion : adyacentes) {
            System.out.printf("[%d, %d]%n", posicion[0], posicion[1]);
        }
    }

    private static int obtenerNumeroValido(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Ingrese un número válido.");
            scanner.next(); // Limpiar el buffer del scanner
        }
        return scanner.nextInt();
    }

    private static int obtenerNumeroValido(Scanner scanner, int maximo) {
        int numero;
        do {
            numero = obtenerNumeroValido(scanner);
            if (numero < 0 || numero >= maximo) {
                System.out.printf("Ingrese un número entre 0 y %d (exclusivo).%n", maximo);
            }
        } while (numero < 0 || numero >= maximo);
        return numero;
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.printf("%4d", elemento);
            }
            System.out.println();
        }
    }
}
