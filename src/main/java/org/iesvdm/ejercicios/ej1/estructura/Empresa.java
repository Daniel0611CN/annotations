package org.iesvdm.ejercicios.ej1.estructura;


import org.iesvdm.ejercicios.ej1.anotacion.Empleado;

@Empleado(
        nombre = "Cris",
        apellidos = "Ortega",
        dni = "66554433F",
        direccion = "Alicante",
        telefono = 981185596,
        clase = "Directivo",
        codigoDespacho = 1
)

@Empleado(
        nombre = "Álvaro",
        apellidos = "Gaset",
        dni = "13225360F",
        direccion = "Asturias",
        telefono = 943821773,
        clase = "Técnico",
        codigoDespacho = 2
)

@Empleado(
        nombre = "Manuel",
        apellidos = "Pérez",
        dni = "55663424F",
        direccion = "Malaga",
        telefono = 981394813,
        clase = "Oficial",
        codigoDespacho = 3
)

public class Empresa {
    @Override
    public String toString() {
        return super.toString();
    }
}
