package org.iesvdm.ejercicios.ej3.estructura;

import org.iesvdm.ejercicios.ej3.anotacion.Tarea;

@Tarea(
        title = "Ejercicios Anotaciones",
        description = "6 Ejercicios del Tema",
        dia = "Día de Entraga Lunes",
        hora = "Hora de Entrega 23:59 P.M"
)
@Tarea(
        title = "Ejercicios Docker 3",
        description = "Docker en Ubuntu",
        dia = "Día de Entrega Viernes",
        hora = "Hora de Entrega 11:15 A.M")
public class Principal {
    @Override
    public String toString() {
        return "Principal{}";
    }
}
