package org.iesvdm.ejercicios.ej4.estructura;

public class Principal {

    public static void main(String[] args) {
        cargadorDeContexto contexto = new cargadorDeContexto();
        contexto.cargadorDeContexto();

        Usuario user1 = Usuario.builder().nombre("Usuario 1").edad(18).curso("2").build();

    }

}
