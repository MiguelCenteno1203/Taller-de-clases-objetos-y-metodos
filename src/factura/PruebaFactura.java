
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
        System.out.println("\n--- Detalle de Factura ---");
        System.out.println("Número de pieza: "
                + factura1.obtenerNumeroPieza());

        System.out.println("Descripción: "
                + factura1.obtenerDescripcionPieza());

        System.out.println("Cantidad: "
                + factura1.obtenerCantidad());

        System.out.printf("Precio por artículo: $%.2f%n",
                factura1.obtenerPrecioPorArticulo());

        System.out.printf("Monto total de la factura: $%.2f%n",
                factura1.obtenerMontoFactura());

        entrada.close();
    }
}
