/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package benedicto;

import java.util.Date;

/**
 *
 * @author ABERT
 */
public class Prospecto {
    private String nombre;
    private String apellido_paterno;
    private String apellido_materno;
    private String email;
    private String dni;
    private String telefono;
    private String fecha;

    public Prospecto () {
        
    }
    
    public Prospecto(String nombre,  String apellido_paterno, String apellido_materno, String email, String dni,
        String telefono,  Date fecha) {
       this.nombre = nombre;
       this.apellido_paterno = apellido_paterno;
       this.apellido_materno = apellido_materno;
       this.email = email;
       this.dni = dni;
       this.telefono = telefono;
       this.fecha = fecha;

    }
    
    
    public String getApellido_materno() {
        return apellido_materno;
    }

    public String getApellido_paterno() {
        return apellido_paterno;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
    
    
}

