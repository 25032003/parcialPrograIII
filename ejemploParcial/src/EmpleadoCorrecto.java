public class EmpleadoCorrecto {

    private String nombre;
    private double salario;

    public EmpleadoCorrecto(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // getters y setters

    // Restringimos la lógica de cálculo de impuestos a una clase separada
    public double calcularImpuestos() {
        return CalculadoraImpuestos.calcular(this.salario);
    }

    // Restringimos la lógica de generación de reporte a una clase separada
    public String generarReporte() {

        //  return GeneradorReportes.generar(this);
        return "Reporte generado";
    }
}

