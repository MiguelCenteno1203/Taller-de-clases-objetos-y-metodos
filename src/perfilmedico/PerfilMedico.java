package perfilmedico;

import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double alturaCm;
    private double pesoKg;

    public PerfilMedico(String primerNombre, String apellido, String sexo,
                        int diaNacimiento, int mesNacimiento, int anioNacimiento,
                        double alturaCm, double pesoKg) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.alturaCm = alturaCm;
        this.pesoKg = pesoKg;
    }

    // Métodos establecer y obtener (getters y setters)
    public void establecerPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String obtenerPrimerNombre() {
        return primerNombre;
    }

    public void establecerApellido(String apellido) {
        this.apellido = apellido;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public void establecerSexo(String sexo) {
        this.sexo = sexo;
    }

    public String obtenerSexo() {
        return sexo;
    }

    public void establecerDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int obtenerDiaNacimiento() {
        return diaNacimiento;
    }

    public void establecerMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int obtenerMesNacimiento() {
        return mesNacimiento;
    }

    public void establecerAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public int obtenerAnioNacimiento() {
        return anioNacimiento;
    }

    public void establecerAlturaCm(double alturaCm) {
        this.alturaCm = alturaCm;
    }

    public double obtenerAlturaCm() {
        return alturaCm;
    }

    public void establecerPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }

    public double obtenerPesoKg() {
        return pesoKg;
    }
    // Calcula la edad exacta en años
    public int calcularEdad() {
        LocalDate fechaNac = LocalDate.of(anioNacimiento, mesNacimiento, diaNacimiento);
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNac, fechaActual).getYears();
    }

    // Frecuencia cardiaca máxima: 220 - edad
    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    // Frecuencia esperada mínima: 50%
    public double calcularFrecuenciaEsperadaMinima() {
        return calcularFrecuenciaMaxima() * 0.50;
    }

    // Frecuencia esperada máxima: 85%
    public double calcularFrecuenciaEsperadaMaxima() {
        return calcularFrecuenciaMaxima() * 0.85;
    }
    // Calcula el índice de masa corporal convirtiendo cm a metros
    public double calcularBMI() {
        double alturaMetros = alturaCm / 100.0;
        return pesoKg / (alturaMetros * alturaMetros);
    }
}