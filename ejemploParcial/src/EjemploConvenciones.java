public class EjemploConvenciones {

    // Variables de instancia
    private int contador;

    // Constantes
    public static final int MAXIMO_INTENTOS = 3;

    // Constructor
    public EjemploConvenciones() {
        this.contador = 0;
    }

    // Método público
    public void incrementarContador() {
        if (contador < MAXIMO_INTENTOS) {
            contador++;
        }
    }

    // Método privado
    private void reiniciarContador() {
        contador = 0;
    }
}
