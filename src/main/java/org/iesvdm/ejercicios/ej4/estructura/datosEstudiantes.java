package org.iesvdm.ejercicios.ej4.estructura;

import lombok.ToString;
import org.iesvdm.ejercicios.ej4.anotacion.Estudiante;

@org.iesvdm.ejercicios.ej4.anotacion.Estudiante(
        colegio = "Albero",
        nombre = "Javier",
        curso = "4º",
        edad = 12
)
@Estudiante(
        colegio = "Virgen de la Peña",
        nombre = "Paula",
        curso = "2º",
        edad = 9
)
@ToString
public class datosEstudiantes {
}
