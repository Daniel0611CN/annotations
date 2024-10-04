package org.iesvdm.ejercicios.ej3.estructura;

public class Tarea {

    protected String title;
    protected String descripcion;
    protected String Dia;
    protected String Hora;

    public Tarea(String descripcion, String dia, String hora, String title) {
        this.descripcion = descripcion;
        Dia = dia;
        Hora = hora;
        this.title = title;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String hora) {
        Hora = hora;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
