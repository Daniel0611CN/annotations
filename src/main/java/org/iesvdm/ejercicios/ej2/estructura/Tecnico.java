package org.iesvdm.ejercicios.ej2.estructura;

public final class Tecnico extends Operario { // No se puede heredar de esta clase;

    protected String perfil;

    public Tecnico(String apellidos, String direccion, String dni, String nombre, String telefono, int codigoTaller, String perfil) {
        super(apellidos, direccion, dni, nombre, telefono, codigoTaller);
        this.perfil = perfil;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
