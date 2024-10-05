package org.iesvdm.ejercicios.ej4.estructura;

import lombok.*;
import org.iesvdm.ejercicios.ej4.anotacion.Estudiante;

@NonNull
public class cargadorDeContexto {

    // La anotación Data, implementa las anotaciones:
    // toString, equalsAndHasCode, Getter, Setter, Constructor
    // Estas anteriores permiten realizar las acciones que indican, sin la necesidad del código en la clase;

    // La anotación Value, genera una clase inmutable,
    // hace que los atributos sean private, y final;

    // La anotación Builder, permite una construcción legible de
    // los atributos, sin la necesidad de getters y setters;

    // La anotación NonNull, lo que hace es que si un valor es
    // null, lanzará la excepción NullPointerException;

    public void cargadorDeContexto() {


        var estudiantesAnnotation = datosEstudiantes.class.getAnnotationsByType(Estudiante.class);

        Usuario user1 = null;

//      user1.setCurso("");
//      user1.setNombre("");
//      user1.setEdad(0);

        System.out.println();

        for (Estudiante estudianteAnnotation : estudiantesAnnotation) {
            user1 = Usuario.builder().nombre(estudianteAnnotation.nombre()).edad(estudianteAnnotation.edad()).curso(estudianteAnnotation.curso()).build();
            System.out.println("Colegio: " + estudianteAnnotation.colegio());
            System.out.println("-----------------");
            System.out.println("Nombre: " + user1.getNombre());
            System.out.println("Edad: " + user1.getEdad());
            System.out.println("Curso: " + user1.getCurso());
            System.out.println("-----------------");

            System.out.println(user1 + "\n");
//          System.out.println(estudianteAnnotation.toString());
        }
    }

}
