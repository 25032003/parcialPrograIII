//FORMA INCORRECTA DE IMPLEMENTAR EL PRINCIPIO DE RESPONSABILIDAD ÚNICA
public class Empleado {

    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void calcularImpuestos() {
        // lógica para calcular impuestos basada en el salario
    }

    public void generarReporte() {
        // lógica para generar un reporte del empleado
    }
}
