package org.iesvdm.ejercicios.ej2.estructura;

public class Directivo extends Empleado {

    protected int codigoDespacho;

    public Directivo(String apellidos, String direccion, String dni, String nombre, String telefono, int codigoDespacho) {
        super(apellidos, direccion, dni, nombre, telefono);
        this.codigoDespacho = codigoDespacho;
    }

    public int getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(int codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }
}
