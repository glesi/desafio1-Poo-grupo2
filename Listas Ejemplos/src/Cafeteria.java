/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fab
 */
import java.util.*;
import java.util.List;
import java.util.Scanner;

class Cafe {
    private final String nombre;
    private final int precio;
    private int cantidad;

    Cafe(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

public class Cafeteria {
    public static void main(String[] args) {
        List<Cafe> menu = new ArrayList<>();
        menu.add(new Cafe("Mocca", 1, 10));
        menu.add(new Cafe("Latte", 3, 15));
        menu.add(new Cafe("Frappe", 3, 12));
        menu.add(new Cafe("Americano", 1, 20));
        menu.add(new Cafe("Capuccino", 1, 18));

        Scanner scanner = new Scanner(System.in);
        int total = 0;

        while (true) {
            System.out.println("====================================================");
            System.out.println("Bienvenido a Cafeteria Ataco - Seleccione la bebida:");
            System.out.println("====================================================");
            for (int i = 0; i < menu.size(); i++) {
                Cafe cafe = menu.get(i);
                System.out.println((i + 1) + " - " + cafe.getNombre() + " ($" + cafe.getPrecio() + ", " + cafe.getCantidad() + " disponibles)");
            }
            System.out.println("0 - Orden Completada");
            System.out.println("Total: $" + total);

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            if (opcion == 0) {
                System.out.println("Gracias por elegirnos, regresa pronto por más cafésito");
                break;
            }

            Cafe cafeSeleccionado = menu.get(opcion - 1);
            if (cafeSeleccionado.getCantidad() > 0) {
                System.out.println("====================================================");
                System.out.println("Gracias por ordenar con nosotros, disfruta tu " + cafeSeleccionado.getNombre());
                cafeSeleccionado.setCantidad(cafeSeleccionado.getCantidad() - 1);
                total += cafeSeleccionado.getPrecio();                
            } else {
                System.out.println("==============================================================================");
                System.out.println("Lo sentimos, ya no tenemos café de tu preferencia. Por favor elige otra opción");
                System.out.println("==============================================================================");
            }
        }
    }
}
 

