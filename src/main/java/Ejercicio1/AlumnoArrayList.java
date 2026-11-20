
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class AlumnoArrayList {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();
        
        int opcion;
        do {
            System.out.println("\n--- MENU ARRAY DE ALUMNOS ---");
            System.out.println("1. Agregar un alumno");
            System.out.println("2. Eliminar un alumno");
            System.out.println("3. Buscar un alumno por su legajo");
            System.out.println("4. Mostrar Array de alumnos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1 -> {
                    System.out.print("Ingrese el legajo: ");
                    int legajo = sc.nextInt();

                    System.out.print("Ingrese el nombre: ");
                    String nombre = sc1.nextLine();

                    System.out.print("Ingrese el apellido: ");
                    String apellido = sc1.nextLine();

                    Alumno nuevo = new Alumno(legajo, nombre, apellido);
                    alumnos.add(nuevo);
                    
                    System.out.println("Alumno agregado correctamente.");
                }

                case 2 -> {
                    System.out.print("Ingrese el legajo del alumno que desea eliminar: ");
                    int legajo = sc.nextInt();

                    boolean eliminado = false;
                    int i = 0;
                    while(i < alumnos.size() || eliminado){
                    
                        if (alumnos.get(i).getLegajo() == legajo) {
                            alumnos.remove(i);
                            eliminado = true;
                        }
                        i++;
                    
                    } 

                    if (eliminado) {
                        System.out.println("Alumno eliminado correctamente.");
                    } else {
                        System.out.println("No se encontro el alumno.");
                    }
                }

                case 3 -> {
                    System.out.print("Ingrese el legajo que desea buscar: ");
                    int legajo = sc.nextInt();

                    boolean encontrado = false;
                    int i=0;
                    
                    while(i < alumnos.size() || encontrado){ 
                        if (alumnos.get(i).getLegajo() == legajo) {
                            System.out.println("\nAlumno encontrado:");
                            System.out.println(alumnos.get(i));
                            encontrado = true;
                        }
                    }   

                    if (!encontrado) {
                        System.out.println("No se encontro el alumno.");
                    }
                }

                case 4 -> {
                    System.out.println("\nListado de alumnos:");

                    if (alumnos.isEmpty()) {
                        System.out.println("No hay alumnos registrados.");
                    } else {
                        for (int i = 0; i < alumnos.size(); i++) {
                            System.out.println(alumnos.get(i));
                        }
                    }
                }

                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 0);
    }
}
