package org.iesvdm.ejercicios.ej4.estructura;

import lombok.*;
import org.iesvdm.ejercicios.ej4.anotacion.Estudiante;

@Data
@Value
@NonNull
@Builder
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
        System.out.println("Cargando Contexto");

        var estudiantesAnnotation = Datos.class.getAnnotationsByType(Estudiante.class);


    }


}
