
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.desafio;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author glesi
 */
public class SistemaEstudiantesUdb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String nombreEstudiante = "";
        String carnet = "";
        int opcion = 0;
        Map<String, String> estudiantesMap = new HashMap<String, String>();

       
        Scanner objScanner = new Scanner(System.in);
        
        System.out.println("*************Bienvenido a UDB Virtual**************.\n");
        
        while (opcion != 5) {
            System.out.println("\n*********************************************************");
            System.out.println("Seleccione una de las siguientes opciones del Menu.\n");
            System.out.println("1. Ingresar Alumnos");
            System.out.println("2. Buscar Alumnos");
            System.out.println("3. Eliminar Alumnos");
            System.out.println("4. Mostrar todos los Alumnos");
            System.out.println("5. Salir del Sistema");
            System.out.print("\nSeleccione una opcion del menu: ");

            opcion = objScanner.nextInt();
            objScanner.nextLine();

            switch (opcion) {
                case 1:
                    
                    System.out.print("Ingrese su numero de Carnet: ");
                    carnet = objScanner.nextLine();

                    System.out.print("Ingrese su nombre completo: ");
                    nombreEstudiante = objScanner.nextLine();

                    estudiantesMap.put(carnet, nombreEstudiante);

                    System.out.println("\n*********************************************************");
                    System.out.println("Alumno ingresado exitosamente");
                    break;
                case 2:
                    System.out.print("Ingrese el numero de Carnet del Alumno que desea encontrar: ");
                    carnet = objScanner.nextLine();
                    String estudiante = estudiantesMap.get(carnet);

                    if (estudiante != null) {
                        System.out.println("\n*********************************************************");
                        System.out.println("Alumno:" + estudiante);
                    } else {
                        System.out.println("\n*********************************************************");
                        System.out.println("Alumno no encontrado, no se puede Mostrar");
                    }

                    break;
                case 3:
                    System.out.println("Ingrese el numero de Carnet del Alumno que desea eliminar: ");
                    carnet = objScanner.nextLine();

                    String estudianteEliminar = estudiantesMap.get(carnet);

                    if (estudianteEliminar != null) {
                        estudiantesMap.remove(carnet);
                        System.out.println("\n*********************************************************");
                        System.out.println("Alumno eliminado con exitos");
                    } else {
                        System.out.println("\n*********************************************************");
                        System.out.println("Alumno no encontrado, no se puede Eliminar");
                    }
                    break;
                case 4:
                    System.out.println("\n*********************************************************");
                    System.out.println("*********Listado de todos los Estudiantes**********");
                    estudiantesMap.forEach(
                            (car, nombreAlumno) -> System.out.println("Carnet: " + car + " Estudiante: " + nombreAlumno)
                    );
                    break;
                case 5:
                    System.out.println("\n*********************************************************");
                    System.out.println("Gracias por usar UDB Virtual");
                    break;
                default:
                    System.out.println("\n*********************************************************");
                    System.out.println("La opcion ingresada no es valida");
            }

        }

    }

}
