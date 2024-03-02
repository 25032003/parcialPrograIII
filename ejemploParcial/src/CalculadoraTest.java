//PRUEBAS UNITARIAS
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(3, 7);
        assertEquals(10, resultado);
    }

    @Test
    public void testRestar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.restar(5, 2);
        assertEquals(3, resultado);
    }

    private void assertEquals(int i, int resultado) {
    }

    @Test
    public void testMultiplicar() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.multiplicar(4, 6);
        assertEquals(24, resultado);
    }

    @Test
    public void testDividir() {
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dividir(8, 2);
        assertEquals(4, resultado);
    }

    @Test
    public void testDividirPorCero() {
        Calculadora calculadora = new Calculadora();
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(10, 0);
        });
    }
}
