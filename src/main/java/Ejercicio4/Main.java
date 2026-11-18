
package Ejercicio4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

    public static void main(String[] args) {
        try {

            FileOutputStream f = new FileOutputStream("src/main/resources/agenda.txt");
            ObjectOutputStream ost = new ObjectOutputStream(f);
            Agenda a1 = new Agenda("Nicolas", "Arumay", "1-1111-1",
                    "15468942", "11654987", "nico@gmail.com", "Colegio");

            AgendaOutput salida;
            salida = new AgendaOutput();
            salida.abrir();
            salida.escribir(a1);
            salida.cerrar();
            
            AgendaInput entrada;
            entrada = new AgendaInput();
            entrada.abrir();
            a1 = entrada.Leer();
            entrada.cerrar();

        } catch (IOException e) {
            System.err.println(e);
        } catch (ClassNotFoundException cfe) {
            System.err.println(cfe);
        }
    }
}

