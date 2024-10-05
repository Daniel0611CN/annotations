package org.iesvdm.ejercicios.ej4.estructura;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Value
@Builder
@AllArgsConstructor
public class Usuario {
    String nombre;
    int edad;
    String curso;
}
