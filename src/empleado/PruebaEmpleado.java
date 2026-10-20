package empleado;

import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        String nom1 = JOptionPane.showInputDialog("Empleado 1: Ingrese el primer nombre:");
        String ape1 = JOptionPane.showInputDialog("Empleado 1: Ingrese el apellido paterno:");
        double sal1 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 1: Ingrese el salario mensual:"));

        Empleado empleado1 = new Empleado(nom1, ape1, sal1);

        String nom2 = JOptionPane.showInputDialog("Empleado 2: Ingrese el primer nombre:");
        String ape2 = JOptionPane.showInputDialog("Empleado 2: Ingrese el apellido paterno:");
        double sal2 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 2: Ingrese el salario mensual:"));

        Empleado empleado2 = new Empleado(nom2, ape2, sal2);

        double anual1 = empleado1.obtenerSalarioMensual() * 12;
        double anual2 = empleado2.obtenerSalarioMensual() * 12;

        String reporteInicial = String.format(
                "=== SALARIOS ANUALES ACTUALES ===\n" +
                        "%s %s: $%.2f anual\n" +
                        "%s %s: $%.2f anual",
                empleado1.obtenerPrimerNombre(), empleado1.obtenerApellidoPaterno(), anual1,
                empleado2.obtenerPrimerNombre(), empleado2.obtenerApellidoPaterno(), anual2
        );
        JOptionPane.showMessageDialog(null, reporteInicial);

        // Aumento del 10% a cada empleado
        empleado1.establecerSalarioMensual(empleado1.obtenerSalarioMensual() * 1.10);
        empleado2.establecerSalarioMensual(empleado2.obtenerSalarioMensual() * 1.10);

        double anualConAumento1 = empleado1.obtenerSalarioMensual() * 12;
        double anualConAumento2 = empleado2.obtenerSalarioMensual() * 12;

        String reporteFinal = String.format(
                "=== SALARIOS TRAS EL AUMENTO DEL 10%% ===\n" +
                        "%s %s: $%.2f anual\n" +
                        "%s %s: $%.2f anual",
                empleado1.obtenerPrimerNombre(), empleado1.obtenerApellidoPaterno(), anualConAumento1,
                empleado2.obtenerPrimerNombre(), empleado2.obtenerApellidoPaterno(), anualConAumento2
        );
        JOptionPane.showMessageDialog(null, reporteFinal);
    }
}