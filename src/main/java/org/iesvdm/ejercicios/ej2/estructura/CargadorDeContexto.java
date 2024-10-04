package org.iesvdm.ejercicios.ej2.estructura;


import org.iesvdm.ejercicios.ej2.anotacion.Directivo;
import org.iesvdm.ejercicios.ej2.anotacion.Oficial;
import org.iesvdm.ejercicios.ej2.anotacion.Tecnico;

import java.util.ArrayList;

public class CargadorDeContexto {
    // Aquí es donde se procesan los datos, creando un mapa que tenga una clave y valor.

    // Se pone String como clave, porque los atributos de Directivo, Operario, y Tecnico, en la clase Empleado, son String;
    // Y se pone Empresa, como valor, ya que vamos a manejar las clases de Directivo, Oficial, Operario, y Tecnico, ya que son las que heredan de Empleado.

    // El cargador de contexto procesa los datos de tal manera que, al ejecutar el programa, solo es necesario añadir anotaciones a la clase;

    // 1º, debemos obtener las anotaciones de la clase Empresa;

    public void cargadorContexto() {

        var directivosAnnotation = Empresa.class.getAnnotationsByType(Directivo.class);
        var oficialesAnnotation = Empresa.class.getAnnotationsByType(Oficial.class);
        var tecnicosAnnotation = Empresa.class.getAnnotationsByType(Tecnico.class);
        // Esto se utiliza para obtener las anotaciones de la clase Empresa;

        System.out.println();

        var directivo = new ArrayList<>();
        var tecnico = new ArrayList<>();
        var oficial = new ArrayList<>();

//        -------------------------------------------------------------------------------------
//
//        Imprimir los resultados con listas;
//
//        for (Directivo directivoAnnotation : directivosAnnotation) {
//
//            var codigoDespacho = String.valueOf(directivoAnnotation.codigoDespacho());
//            var telefono = String.valueOf(directivoAnnotation.empleado().telefono());
//
//            directivo.add(directivoAnnotation.empleado().nombre());
//            directivo.add(directivoAnnotation.empleado().apellidos());
//            directivo.add(directivoAnnotation.empleado().dni());
//            directivo.add(directivoAnnotation.empleado().direccion());
//            directivo.add(telefono);
//
//            directivo.add(codigoDespacho);
//
//        }
//
//        for (Tecnico tecnicoAnnotation : tecnicosAnnotation) {
//
//            var codigoTaller = String.valueOf(tecnicoAnnotation.operario().codigoTaller());
//            var telefono = String.valueOf(tecnicoAnnotation.empleado().telefono());
//
//            tecnico.add(tecnicoAnnotation.empleado().nombre());
//            tecnico.add(tecnicoAnnotation.empleado().apellidos());
//            tecnico.add(tecnicoAnnotation.empleado().dni());
//            tecnico.add(tecnicoAnnotation.empleado().direccion());
//            tecnico.add(telefono);
//
//            tecnico.add(codigoTaller);
//            tecnico.add(tecnicoAnnotation.perfil());
//
//        }
//
//        for (Oficial oficialAnnotation : oficialesAnnotation) {
//
//            var codigoTaller = String.valueOf(oficialAnnotation.operario().codigoTaller());
//            var telefono = String.valueOf(oficialAnnotation.empleado().telefono());
//
//            oficial.add(oficialAnnotation.empleado().nombre());
//            oficial.add(oficialAnnotation.empleado().apellidos());
//            oficial.add(oficialAnnotation.empleado().dni());
//            oficial.add(oficialAnnotation.empleado().direccion());
//            oficial.add(telefono);
//
//            oficial.add(codigoTaller);
//            oficial.add(oficialAnnotation.categoria());
//
//        }

//        --------------------------------------------------------------------------------
//        Imprimir los resultados con cada uno de los atributos;

        System.out.println("\nDirectivos");
        System.out.println("--------------");

        for (Directivo directivoAnnotation : directivosAnnotation) {
            System.out.println("Nombre: " + directivoAnnotation.empleado().nombre());
            System.out.println("Apellidos: " + directivoAnnotation.empleado().apellidos());
            System.out.println("Dirección: " + directivoAnnotation.empleado().direccion());
            System.out.println("DNI: " + directivoAnnotation.empleado().dni());
            System.out.println("Teléfono: " + directivoAnnotation.empleado().telefono());
            System.out.println("Código Despacho: " + directivoAnnotation.codigoDespacho());
            System.out.println("--------------------");
        }

        System.out.println("\nTécnicos");
        System.out.println("--------------");

        for (Tecnico tecnicoAnnotation : tecnicosAnnotation) {
            System.out.println("Nombre: " + tecnicoAnnotation.empleado().nombre());
            System.out.println("Apellidos: " + tecnicoAnnotation.empleado().apellidos());
            System.out.println("Dirección: " + tecnicoAnnotation.empleado().direccion());
            System.out.println("DNI: " + tecnicoAnnotation.empleado().dni());
            System.out.println("Teléfono: " + tecnicoAnnotation.empleado().telefono());
            System.out.println("Código Taller: " + tecnicoAnnotation.operario().codigoTaller());
            System.out.println("Perfil: " + tecnicoAnnotation.perfil());
            System.out.println("--------------------");
        }

        System.out.println("\nOficiales");
        System.out.println("--------------");

        for (Oficial oficialAnnotation : oficialesAnnotation) {
            System.out.println("Nombre: " + oficialAnnotation.empleado().nombre());
            System.out.println("Apellidos: " + oficialAnnotation.empleado().apellidos());
            System.out.println("Dirección: " + oficialAnnotation.empleado().direccion());
            System.out.println("DNI: " + oficialAnnotation.empleado().dni());
            System.out.println("Teléfono: " + oficialAnnotation.empleado().telefono());
            System.out.println("Código Taller: " + oficialAnnotation.operario().codigoTaller());
            System.out.println("Categoría: " + oficialAnnotation.categoria());
            System.out.println("--------------------");
        }

//        --------------------------------------------------------------------------------

    }
}
