package org.iesvdm.ejercicios.ej3.estructura;

import java.util.ArrayList;
import org.iesvdm.ejercicios.ej3.anotacion.Tarea;

public class AgendaSemana {

    public void leerTareas() {

        var listaTareas = Principal.class.getAnnotationsByType(Tarea.class);

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
