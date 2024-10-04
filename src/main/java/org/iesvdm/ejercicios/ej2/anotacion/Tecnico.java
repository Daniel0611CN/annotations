package org.iesvdm.ejercicios.ej2.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Tecnicos.class)
public @interface Tecnico {

    Empleado empleado();
    Operario operario();
    String perfil();

}
