package perfilmedico;

import java.util.Scanner;

public class PruebaPerfilMedico {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SISTEMA DE REGISTRO MÉDICO (EJERCICIO 3.17) ===");
        System.out.print("Primer nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Apellido: ");
        String apellido = entrada.nextLine();

        System.out.print("Sexo: ");
        String sexo = entrada.nextLine();

        System.out.print("Día de nacimiento (1-31): ");
        int dia = entrada.nextInt();

        System.out.print("Mes de nacimiento (1-12): ");
        int mes = entrada.nextInt();

        System.out.print("Año de nacimiento (ej. 2004): ");
        int anio = entrada.nextInt();

        System.out.print("Altura en centímetros (ej. 175): ");
        double altura = entrada.nextDouble();

        System.out.print("Peso en kilogramos (ej. 70.5): ");
        double peso = entrada.nextDouble();

        // Instanciación del objeto
        PerfilMedico perfil = new PerfilMedico(nombre, apellido, sexo, dia, mes, anio, altura, peso);

        // Despliegue de información y resultados
        System.out.println("\n==============================================");
        System.out.println("             PERFIL MÉDICO REGISTRADO         ");
        System.out.println("==============================================");
        System.out.println("Nombre: " + perfil.obtenerPrimerNombre() + " " + perfil.obtenerApellido());
        System.out.println("Sexo: " + perfil.obtenerSexo());
        System.out.printf("Fecha de Nacimiento: %02d/%02d/%d%n",
                perfil.obtenerDiaNacimiento(), perfil.obtenerMesNacimiento(), perfil.obtenerAnioNacimiento());
        System.out.printf("Estatura: %.1f cm (%.2f m)%n", perfil.obtenerAlturaCm(), perfil.obtenerAlturaCm() / 100.0);
        System.out.printf("Peso: %.1f kg%n", perfil.obtenerPesoKg());
        System.out.println("----------------------------------------------");
        System.out.println("Edad: " + perfil.calcularEdad() + " años");
        System.out.println("Frecuencia Cardíaca Máxima: " + perfil.calcularFrecuenciaMaxima() + " bpm");
        System.out.printf("Rango Frecuencia Cardíaca Esperada (50%% - 85%%): %.1f - %.1f bpm%n",
                perfil.calcularFrecuenciaEsperadaMinima(), perfil.calcularFrecuenciaEsperadaMaxima());
        System.out.printf("Índice de Masa Corporal (BMI): %.2f%n", perfil.calcularBMI());
        System.out.println("----------------------------------------------");

        entrada.close();
    }
}