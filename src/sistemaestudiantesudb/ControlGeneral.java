/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaestudiantesudb;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author JC
 */
public class ControlGeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Map<Integer, String> mapaEmpleados = new HashMap<>();
        
        Scanner runscanner = new Scanner(System.in);
        
        System.out.println("***Opciones del Control de Empleados**");
        
         do {

            System.out.println("\n----- Menu de Opciones -----");
            System.out.println("1. Mostrar Todos los Empleados en Planilla");
            System.out.println("2. Agregar Empleado");
            System.out.println("3. Eliminar Empleado");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            int opcion = runscanner.nextInt();

            switch (opcion) {
                
                case 1:
                    System.out.println("Empleados de la Empresa:");
                    
                    mapaEmpleados.entrySet().forEach((entry) -> {
                        System.out.println("Codigo: " + entry.getKey() + ", Nombre: " + entry.getValue());
            });
                    break;

                case 2:
                    System.out.print("Ingrese el codigo del empleado: ");
                    int codigo = runscanner.nextInt();
                    runscanner.nextLine();  // Limpiar el buffer
                    System.out.print("Ingrese el nombre del empleado: ");
                    String nombre = runscanner.nextLine();

                    mapaEmpleados.put(codigo, nombre);
                    System.out.println("Empleado agregado con exito.");
                    break;

                case 3:
                    System.out.println("Ingrese el codigo del empleado a eliminar: ");
                    int codigoEliminar = runscanner.nextInt();

                    if (mapaEmpleados.containsKey(codigoEliminar)) {
                        mapaEmpleados.remove(codigoEliminar);
                        System.out.println("Empleado eliminado de planilla exitosamente");
                    } else {
                        System.out.println("Empleado no encontrado en planilla");
                    }
                    break;

                case 0:

                    System.out.println("Saliendo del programa...");
                    System.exit(0);
                    break;

                default:

                    System.out.println("Opcion no valida. Por favor, seleccione una opcion valida.");
                    break;
            }
        } while (true);
    }
}