package org.iesvdm.ejercicios.ej1.estructura;

public final class Oficial extends Operario { // No se puede heredar de esta clase;

    protected String categoria;

    public Oficial(String apellidos, String direccion, String dni, String nombre, String telefono, int codigoTaller, String categoria) {
        super(apellidos, direccion, dni, nombre, telefono, codigoTaller);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
