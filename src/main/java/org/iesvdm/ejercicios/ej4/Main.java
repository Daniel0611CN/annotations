package org.iesvdm.ejercicios.ej4;

public class Main {

    public static void main(String[] args) {


        Usuario user1 = Usuario.builder().nombre("").edad(18).curso("2").build();

        System.out.println("\nUsuarios: ");
        System.out.println(user1);

    }

}
