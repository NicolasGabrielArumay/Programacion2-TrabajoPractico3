
package Ejercicio3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class BuscarStringArchivos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String fileName = "src/main/resources/Texto.txt";
        PrintWriter fileOut = null;

        try {
            fileOut = new PrintWriter(new FileWriter(fileName));
            String s = "Hoy es viernes y esta soleado";
            fileOut.println(s);
            fileOut.flush();
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, no se encuentra el archivo");
        } catch (IOException ioe) {
            System.out.println("Error, disco protegido contra lectura");
        } finally {
            fileOut.close();
        }
        
        BufferedReader fileIn = null;
        
        System.out.println("\t-----ARCHIVOS-----");
        try {
            fileIn = new BufferedReader(new FileReader(fileName));
     
            System.out.println("Ingrese cualquier texto: ");
            String buscarTexto = sc.nextLine();
            String frase = fileIn.readLine();
            
            if(frase.contains(buscarTexto)){
                System.out.println("El texto SI se encuentra en el archivo");
            }else{
                System.out.println("El texto NO se encuentra en el archivo");
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println("Error, no se encuentra el archivo");
        } catch (IOException ioe) {
            System.out.println("Error, disco protegido contra lectura");
        } finally {
            if (fileIn != null) {
                try {
                    fileIn.close();
                } catch (IOException ioe) {
                    System.out.println("Error, el archivo sigue en uso");
                }
            }
        }
    }
}
