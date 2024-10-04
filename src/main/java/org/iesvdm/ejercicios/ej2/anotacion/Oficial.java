package org.iesvdm.ejercicios.ej2.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Oficiales.class)
public @interface Oficial {

    Empleado empleado();
    Operario operario();
    String categoria();

}
