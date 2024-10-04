package org.iesvdm.ejercicios.ej3.anotacion;


import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Tareas.class)
public @interface Tarea {

    String title();
    String description();
    String dia();
    String hora();

}
