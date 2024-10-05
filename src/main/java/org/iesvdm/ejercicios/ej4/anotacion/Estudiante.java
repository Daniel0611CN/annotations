package org.iesvdm.ejercicios.ej4.anotacion;

import lombok.ToString;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Estudiantes.class)
public @interface Estudiante {

    String colegio();
    String nombre();
    String curso();
    int edad();

}
