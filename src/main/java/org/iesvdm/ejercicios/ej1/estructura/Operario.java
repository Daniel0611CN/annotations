package org.iesvdm.ejercicios.ej1.estructura;

public abstract class Operario extends Empleado { // No se puede instanciar la clase;

    protected int codigoTaller;

    public Operario(String apellidos, String direccion, String dni, String nombre, String telefono, int codigoTaller) {
        super(apellidos, direccion, dni, nombre, telefono);
        this.codigoTaller = codigoTaller;
    }

    public int getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(int codigoTaller) {
        this.codigoTaller = codigoTaller;
    }
}
