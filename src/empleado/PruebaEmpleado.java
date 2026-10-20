package empleado;

import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        // Ingreso de datos para Empleado 1 mediante ventanas emergentes
        String nom1 = JOptionPane.showInputDialog("Empleado 1: Ingrese el primer nombre:");
        String ape1 = JOptionPane.showInputDialog("Empleado 1: Ingrese el apellido paterno:");
        double sal1 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 1: Ingrese el salario mensual:"));

        Empleado empleado1 = new Empleado(nom1, ape1, sal1);

        // Ingreso de datos para Empleado 2
        String nom2 = JOptionPane.showInputDialog("Empleado 2: Ingrese el primer nombre:");
        String ape2 = JOptionPane.showInputDialog("Empleado 2: Ingrese el apellido paterno:");
        double sal2 = Double.parseDouble(JOptionPane.showInputDialog("Empleado 2: Ingrese el salario mensual:"));

        Empleado empleado2 = new Empleado(nom2, ape2, sal2);
    }
}