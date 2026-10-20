package perfilmedico;

public class PerfilMedico {
    // Atributos privados según el diagrama UML
    private String primerNombre;
    private String apellido;
    private String sexo;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;
    private double alturaCm;
    private double pesoKg;

    // Constructor que inicializa los atributos requeridos
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
}