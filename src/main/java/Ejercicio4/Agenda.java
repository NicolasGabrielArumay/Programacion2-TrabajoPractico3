
package Ejercicio4;

import java.io.Serializable;

public class Agenda implements Serializable{
    
    private String nombre;
    private String apellido;
    private String telfLinea;
    private String celular;
    private String telfTrabajo;
    private String email;
    private String conocerMedio;

    public Agenda() {
    }

    public Agenda(String nombre, String apellido, String telfLinea, String celular, String telfTrabajo, String email, String conocerMedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telfLinea = telfLinea;
        this.celular = celular;
        this.telfTrabajo = telfTrabajo;
        this.email = email;
        this.conocerMedio = conocerMedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelfLinea() {
        return telfLinea;
    }

    public void setTelfLinea(String telfLinea) {
        this.telfLinea = telfLinea;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelfTrabajo() {
        return telfTrabajo;
    }

    public void setTelfTrabajo(String telfTrabajo) {
        this.telfTrabajo = telfTrabajo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getConocerMedio() {
        return conocerMedio;
    }

    public void setConocerMedio(String conocerMedio) {
        this.conocerMedio = conocerMedio;
    }

    @Override
    public String toString() {
        return "\tAGENDA\n" 
                + "Nombre: " + nombre  
                + "\nApellido: " + apellido
                + "\nEmail: " + email 
                + "\nMedio de conocimiento: " + conocerMedio;
    }
    
    
    
}
