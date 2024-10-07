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

public class AgendaSemana {

    public void cargadorDeContexto() {

        var listaTareas = AgendaSemana.class.getAnnotationsByType(Tarea.class);

        System.out.println("\nLista de Tareas");
        System.out.println("---------------");

        for (Tarea tarea : listaTareas) {
            System.out.println("Título: " + tarea.title());
            System.out.println("Descripción: " + tarea.description());
            System.out.println("Día: " + tarea.dia());
            System.out.println("Hora: " + tarea.hora());
            System.out.println("----------------------------");
        }

    }

}
