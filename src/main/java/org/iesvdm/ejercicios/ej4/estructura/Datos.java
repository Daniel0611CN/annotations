package org.iesvdm.ejercicios.ej4.estructura;

import lombok.ToString;
import org.iesvdm.ejercicios.ej4.anotacion.Estudiante;

@org.iesvdm.ejercicios.ej4.anotacion.Estudiante(
        colegio = "1",
        nombre = "Andres",
        curso = "4",
        edad = 12
)
@Estudiante(
        colegio = "1",
        nombre = "Paula",
        curso = "2",
        edad = 9
)
@ToString
public class Datos {
}
