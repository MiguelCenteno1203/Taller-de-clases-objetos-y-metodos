package empleado;

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    // Constructor que inicializa las variables
    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        // Si el salario mensual no es positivo, no se establece (queda en 0.0)
        if (salarioMensual > 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }
}
