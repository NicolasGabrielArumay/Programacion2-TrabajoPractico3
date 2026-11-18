
package Ejercicio4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class AgendaOutput {
    private FileOutputStream file;
    private ObjectOutputStream output;

    // abrir el archivo
    public void abrir() throws IOException {
        file = new FileOutputStream("src/main/resources/agenda.txt");
        output = new ObjectOutputStream(file);
    }
    
    public void cerrar() throws IOException {
        if (output != null) {
            output.close();
        }

    }
    // Escribir en el archivo
    public void escribir(Agenda agenda) throws IOException {
        if (output != null) {
            output.writeObject(agenda);
        }

    }
}
