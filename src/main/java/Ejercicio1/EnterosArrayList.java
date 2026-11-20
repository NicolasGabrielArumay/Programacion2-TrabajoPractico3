
package Ejercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class EnterosArrayList {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> enteros = new ArrayList<>();
        
        int opcion;
        do {
            System.out.println("\n--- MENU ARRAY DE ENTEROS ---");
            System.out.println("1. Agregar un numero");
            System.out.println("2. Eliminar un numero");
            System.out.println("3. Buscar un entero");
            System.out.println("4. Mostrar Array de enteros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1 -> {
                    System.out.print("Ingrese un numero: ");
                    int numero = sc.nextInt();

                    enteros.add(numero);

                    System.out.println("Numero agregado correctamente.");
                }

                case 2 -> {
                    System.out.print("Ingrese el numero que desea eliminar: ");
                    int numero = sc.nextInt();

                    if (enteros.remove(Integer.valueOf(numero))) {
                        System.out.println("Numero eliminado correctamente.");
                    } else {
                        System.out.println("El numero no se encuentra en la lista.");
                    }
                }

                case 3 -> {
                    System.out.print("Ingrese el numero que desea buscar: ");
                    int numero = sc.nextInt();

                    if (enteros.contains(numero)) {
                        System.out.println("El numero se encuentra en la lista.");
                    } else {
                        System.out.println("El numero no se encuentra en la lista.");
                    }
                }

                case 4 -> {
                    System.out.println("\nElementos de la lista:");

                    if (enteros.isEmpty()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        for (int i = 0; i < enteros.size(); i++) {
                            System.out.println(enteros.get(i));
                        }
                    }
                }

                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 0);
    }
}
