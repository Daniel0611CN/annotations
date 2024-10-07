package org.iesvdm.ejercicios.ej4;

public class Main {

    public static void main(String[] args) {


        Usuario user1 = Usuario.builder().nombre("Usuario 1").edad(18).curso("2").build();

        procesarDatos contexto = new procesarDatos();
        contexto.porPantalla();

    }

}
