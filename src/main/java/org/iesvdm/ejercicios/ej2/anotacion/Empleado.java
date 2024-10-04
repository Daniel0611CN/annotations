package org.iesvdm.ejercicios.ej2.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Empleados.class)
public @interface Empleado {

    String nombre();
    String apellidos();
    String dni();
    String direccion();
    int telefono();

}
