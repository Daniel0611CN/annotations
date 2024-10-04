package org.iesvdm.ejercicios.ej2.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Directivos.class)
public @interface Directivo {

    Empleado empleado();
    int codigoDespacho();

}
