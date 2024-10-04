package org.iesvdm.ejercicios.ej2.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Repeatable(Operarios.class)
public @interface Operario {

    int codigoTaller();

}