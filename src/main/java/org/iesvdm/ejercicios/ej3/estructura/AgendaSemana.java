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
            org.iesvdm.ejercicios.ej3.estructura.Tarea tarea1 = new org.iesvdm.ejercicios.ej3.estructura.Tarea(
                    tarea.title(),
                    tarea.dia(),
                    tarea.hora(),
                    tarea.description()
            );

            tarea1.getTitle();
            tarea1.getDia();
            tarea1.getHora();
            tarea1.getDescripcion();

            // pasarle estos datos a agendasemana;


            System.out.println(tarea1.toString());
        }


    }

}
