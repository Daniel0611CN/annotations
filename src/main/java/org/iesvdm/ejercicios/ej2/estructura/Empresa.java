package org.iesvdm.ejercicios.ej2.estructura;

import org.iesvdm.ejercicios.ej2.anotacion.Directivo;
import org.iesvdm.ejercicios.ej2.anotacion.Empleado;
import org.iesvdm.ejercicios.ej2.anotacion.Oficial;
import org.iesvdm.ejercicios.ej2.anotacion.Operario;
import org.iesvdm.ejercicios.ej2.anotacion.Tecnico;

@Directivo(
        empleado = @Empleado(
                nombre = "Cris",
                apellidos = "Ortega",
                dni = "66554433F",
                direccion = "Madrid",
                telefono = 981185596
        ),
        codigoDespacho = 1
)

@Tecnico(
        empleado = @Empleado(
                nombre = "Álvaro",
                apellidos = "Gaset",
                dni = "13225360F",
                direccion = "Asturias",
                telefono = 943821773
        ),
        operario = @Operario(
                codigoTaller = 2
        ),
        perfil = "Experto"
)

@Oficial(
        empleado = @Empleado(
                nombre = "Manuel",
                apellidos = "Pérez",
                dni = "55663424F",
                direccion = "Malaga",
                telefono = 981394813
        ),
        operario = @Operario(
                codigoTaller = 3
        ),
        categoria = "Capitán"
)

public class Empresa {
    @Override
    public String toString() {
        return super.toString();
    }
}
