
package Ejercicio4;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class AgendaInput {
    private ObjectInputStream entrada;

    public void abrir() throws IOException {
        entrada = new ObjectInputStream(new FileInputStream("src/main/resources/Agenda.txt"));
    }

    public Agenda Leer() throws IOException, ClassNotFoundException {

        Agenda a = null;
        if (entrada != null) {
            try {
                a = (Agenda) entrada.readObject();
                //System.out.println("el nombre es: " + a.getNombre());
                System.out.println(a.toString());
            } catch (EOFException eof) {
                System.out.println("Entro en el catch por no haber mas datos");
            } catch (IOException e) {
                System.err.println("Error al leer el archivo.");
                System.exit(1);
            }
        }
        
        return a;
    }

    public void cerrar() throws IOException {
        if (entrada != null) {
            entrada.close();
        }
    }
}
