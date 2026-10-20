


package factura;

import java.util.Scanner;

public class PruebaFactura {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== SISTEMA DE FACTURACIÓN (EJERCICIO 3.12) ===");

        System.out.print("Ingrese el número de pieza: ");
        String numero = entrada.nextLine();

        System.out.print("Ingrese la descripción de la pieza: ");
        String descripcion = entrada.nextLine();

        System.out.print("Ingrese la cantidad: ");
        int cantidad = entrada.nextInt();

        System.out.print("Ingrese el precio unitario: ");
        double precio = entrada.nextDouble();

        // Crear el objeto Factura
        Factura factura1 = new Factura(
                numero, descripcion, cantidad, precio
        );

        // Mostrar los datos de la factura
        System.out.println("\n--- Detalle de Factura 1 ---");

        System.out.println("Número de pieza: "
                + factura1.obtenerNumeroPieza());

        System.out.println("Descripción: "
                + factura1.obtenerDescripcionPieza());

        System.out.println("Cantidad: "
                + factura1.obtenerCantidad());

        // Precios con dos decimales
        System.out.printf("Precio por artículo: $%.2f%n",
                factura1.obtenerPrecioPorArticulo());

        System.out.printf("Monto total de la factura: $%.2f%n",
                factura1.obtenerMontoFactura());

        // Prueba 2: Valores inválidos o negativos
        System.out.println("\n--- Prueba 2 (Valores Inválidos / Negativos) ---");

        Factura facturaInvalida = new Factura(
                "DEF-999", "Tornillo defectuoso", -5, -2.50
        );

        System.out.println("Cantidad configurada con -5: "
                + facturaInvalida.obtenerCantidad());

        // Mostrar precios con dos decimales
        System.out.printf("Precio configurado con -2.50: $%.2f%n",
                facturaInvalida.obtenerPrecioPorArticulo());

        System.out.printf("Monto resultante: $%.2f%n",
                facturaInvalida.obtenerMontoFactura());

        entrada.close();
    }
}
