
package Ejercicio2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class EnterosIterator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        numeros.add(5);
        numeros.add(10);
        numeros.add(1);
        numeros.add(4);
        
        int opcion;
        do {
            
            System.out.println("\n--- MENU DE ENTEROS CON ITERADOR ---");
            System.out.println("1. Agregar un entero");
            System.out.println("2. Eliminar un entero");
            System.out.println("3. Buscar un numero");
            System.out.println("4. Mostrar todos los numeros");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");

            opcion = sc.nextInt();
            switch (opcion) {
                case 1 -> {
                    
                    System.out.print("Ingrese un numero: ");
                    int numero = sc.nextInt();

                    numeros.add(numero);

                    System.out.println("Numero agregado correctamente.");
                }

                case 2 -> {

                    System.out.print("Ingrese el numero que desea eliminar: ");
                    int numeroEliminar = sc.nextInt();

                    Iterator<Integer> iteradorRemove = numeros.iterator();
                    boolean eliminado = false;
                    while (iteradorRemove.hasNext() || eliminado) {
                        
                        int entero = iteradorRemove.next();
                        if (numeroEliminar == entero) {
                            iteradorRemove.remove();
                            eliminado = true;
                        }
                    } 
                    
                    if (eliminado) {
                        System.out.println("Numero eliminado correctamente.");
                    } else {
                        System.out.println("El numero no se encuentra en la lista.");
                    }
                    break;
                }

                case 3 -> {
                    System.out.print("Ingrese el numero que desea buscar: ");
                    int numeroBuscado = sc.nextInt();

                    Iterator<Integer> iteradorBusqueda = numeros.iterator();
                    boolean encontrado = false;
                    
                    while (iteradorBusqueda.hasNext() || encontrado) {

                        int entero = iteradorBusqueda.next();

                        if (numeroBuscado == entero) {
                            encontrado = true;
                        }
                    }

                    if (encontrado) {
                        System.out.println("El numero se encuentra en la lista.");
                    } else {
                        System.out.println("El numero no se encuentra en la lista.");
                    }
                }

                case 4 -> {
                    System.out.println("\nElementos de la lista:");

                    Iterator<Integer> iteradorRecorrido = numeros.iterator();

                    if (!iteradorRecorrido.hasNext()) {
                        System.out.println("La lista esta vacia.");
                    } else {
                        while (iteradorRecorrido.hasNext()) {
                            System.out.println(iteradorRecorrido.next());
                        }
                    }
                }

                case 0 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 0);
    }
}
