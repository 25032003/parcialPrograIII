// QUE ES POO EN JAVA
class Libro {
    // Atributos
    private String titulo;
    private String autor;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método para mostrar información del libro
    public void mostrarInformacion() {
        System.out.println("Libro: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

// Clase principal que contiene el método main
public class EjemploPOO {
    public static void main(String[] args) {
        // Crear un libro
        Libro libro = new Libro("Don Quijote", "Miguel de Cervantes");

        // Mostrar información del libro
        libro.mostrarInformacion();
    }
}

