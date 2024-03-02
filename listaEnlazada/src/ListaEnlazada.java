import java.util.Scanner;


public class ListaEnlazada {
    public static Nodo ordenarListaEnlazada(Nodo cabeza) {
        if (cabeza == null || cabeza.siguiente == null) {
            return cabeza;
        }

        Nodo[] mitades = dividirLista(cabeza);
        mitades[0] = ordenarListaEnlazada(mitades[0]);
        mitades[1] = ordenarListaEnlazada(mitades[1]);

        return fusionarListas(mitades[0], mitades[1]);
    }

    public static Nodo[] dividirLista(Nodo cabeza) {
        Nodo tortuga = cabeza;
        Nodo liebre = cabeza.siguiente;

        while (liebre != null && liebre.siguiente != null) {
            tortuga = tortuga.siguiente;
            liebre = liebre.siguiente.siguiente;
        }

        Nodo mitad1 = cabeza;
        Nodo mitad2 = tortuga.siguiente;
        tortuga.siguiente = null;

        return new Nodo[]{mitad1, mitad2};
    }

    public static Nodo fusionarListas(Nodo lista1, Nodo lista2) {
        Nodo cabezaFusionada = new Nodo(0);
        Nodo actual = cabezaFusionada;

        while (lista1 != null && lista2 != null) {
            if (lista1.valor < lista2.valor) {
                actual.siguiente = lista1;
                lista1 = lista1.siguiente;
            } else {
                actual.siguiente = lista2;
                lista2 = lista2.siguiente;
            }
            actual = actual.siguiente;
        }

        actual.siguiente = (lista1 != null) ? lista1 : lista2;

        return cabezaFusionada.siguiente;
    }

    public static void imprimirListaEnlazada(Nodo cabeza) {
        Nodo actual = cabeza;

        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prueba 1
        Nodo cabeza1 = new Nodo(4);
        cabeza1.siguiente = new Nodo(2);
        cabeza1.siguiente.siguiente = new Nodo(1);
        cabeza1.siguiente.siguiente.siguiente = new Nodo(3);

        // Prueba 2
        Nodo cabeza2 = new Nodo(-1);
        cabeza2.siguiente = new Nodo(5);
        cabeza2.siguiente.siguiente = new Nodo(3);
        cabeza2.siguiente.siguiente.siguiente = new Nodo(4);
        cabeza2.siguiente.siguiente.siguiente.siguiente = new Nodo(0);

        // Prueba 3 - El usuario ingresa los datos
        System.out.println("Ingrese los valores de la lista para la prueba 3 (separados por espacios): ");
        String input = scanner.nextLine();
        String[] valores = input.split(" ");
        Nodo cabeza3 = null;
        Nodo actualCabeza3 = null;

        for (String valor : valores) {
            int num = Integer.parseInt(valor);
            Nodo nuevoNodo = new Nodo(num);
            if (cabeza3 == null) {
                cabeza3 = nuevoNodo;
                actualCabeza3 = cabeza3;
            } else {
                actualCabeza3.siguiente = nuevoNodo;
                actualCabeza3 = actualCabeza3.siguiente;
            }
        }

        // Imprimir resultados
        System.out.print("Prueba 1 - Entrada (Descendente): ");
        imprimirListaEnlazadaDescendente(cabeza1);
        System.out.print("Prueba 1 - Salida (Ascendente): ");
        imprimirListaEnlazada(ordenarListaEnlazada(cabeza1));

        System.out.print("Prueba 2 - Entrada (Descendente): ");
        imprimirListaEnlazadaDescendente(cabeza2);
        System.out.print("Prueba 2 - Salida (Ascendente): ");
        imprimirListaEnlazada(ordenarListaEnlazada(cabeza2));

        System.out.print("Prueba 3 - Entrada (Descendente): ");
        imprimirListaEnlazadaDescendente(cabeza3);
        System.out.print("Prueba 3 - Salida (Ascendente): ");
        imprimirListaEnlazada(ordenarListaEnlazada(cabeza3));
    }

    public static void imprimirListaEnlazadaDescendente(Nodo cabeza) {
        // Imprime la lista en orden descendente
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.print(actual.valor + " ");
            actual = actual.siguiente;
        }
        System.out.println();
    }
}