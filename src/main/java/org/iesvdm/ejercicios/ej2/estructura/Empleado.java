package org.iesvdm.ejercicios.ej2.estructura;

public class Empleado {

    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected String direccion;
    protected String telefono;

    public Empleado(String apellidos, String direccion, String dni, String nombre, String telefono) {
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
