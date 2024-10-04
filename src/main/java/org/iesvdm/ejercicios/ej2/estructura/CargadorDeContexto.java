package org.iesvdm.ejercicios.ej2.estructura;


import org.iesvdm.ejercicios.ej2.anotacion.Directivo;
import org.iesvdm.ejercicios.ej2.anotacion.Empleado;
import org.iesvdm.ejercicios.ej2.anotacion.Oficial;
import org.iesvdm.ejercicios.ej2.anotacion.Tecnico;

import java.util.ArrayList;
import java.util.List;

public class CargadorDeContexto {
    // Aquí es donde se procesan los datos, creando un mapa que tenga una clave y valor.

    // Se pone String como clave, porque los atributos de Directivo, Operario, y Tecnico, en la clase Empleado, son String;
    // Y se pone Empresa, como valor, ya que vamos a manejar las clases de Directivo, Oficial, Operario, y Tecnico, ya que son las que heredan de Empleado.

    // El cargador de contexto procesa los datos de tal manera que, al ejecutar el programa, solo es necesario añadir anotaciones a la clase;

    // 1º, debemos obtener las anotaciones de la clase Empresa;

    public void cargadorContexto() {

        Directivo[] directivosAnnotation = Empresa.class.getAnnotationsByType(Directivo.class);
        Oficial[] oficialesAnnotation = Empresa.class.getAnnotationsByType(Oficial.class);
        Tecnico[] tecnicosAnnotation = Empresa.class.getAnnotationsByType(Tecnico.class);
        // Esto se utiliza para obtener las anotaciones de la clase Empresa;

        System.out.println();

        List<String> directivo = new ArrayList<>();
        List<String> tecnico = new ArrayList<>();
        List<String> oficial = new ArrayList<>();

        for (Directivo directivoAnnotation : directivosAnnotation) {

            String codigoDespacho = String.valueOf(directivoAnnotation.codigoDespacho());
            String telefono = String.valueOf(directivoAnnotation.empleado().telefono());

            directivo.add(directivoAnnotation.empleado().nombre());
            directivo.add(directivoAnnotation.empleado().apellidos());
            directivo.add(directivoAnnotation.empleado().dni());
            directivo.add(directivoAnnotation.empleado().direccion());
            directivo.add(telefono);

            directivo.add(codigoDespacho);

        }

        for (Tecnico tecnicoAnnotation : tecnicosAnnotation) {

            String codigoTaller = String.valueOf(tecnicoAnnotation.operario().codigoTaller());
            String telefono = String.valueOf(tecnicoAnnotation.empleado().telefono());

            tecnico.add(tecnicoAnnotation.empleado().nombre());
            tecnico.add(tecnicoAnnotation.empleado().apellidos());
            tecnico.add(tecnicoAnnotation.empleado().dni());
            tecnico.add(tecnicoAnnotation.empleado().direccion());
            tecnico.add(telefono);

            tecnico.add(codigoTaller);
            tecnico.add(tecnicoAnnotation.perfil());

        }

        for (Oficial oficialAnnotation : oficialesAnnotation) {

            String codigoTaller = String.valueOf(oficialAnnotation.operario().codigoTaller());
            String telefono = String.valueOf(oficialAnnotation.empleado().telefono());

            oficial.add(oficialAnnotation.empleado().nombre());
            oficial.add(oficialAnnotation.empleado().apellidos());
            oficial.add(oficialAnnotation.empleado().dni());
            oficial.add(oficialAnnotation.empleado().direccion());
            oficial.add(telefono);

            oficial.add(codigoTaller);
            oficial.add(oficialAnnotation.categoria());

        }

        if (directivo.size() != 0) {
            System.out.println("Directivo");
            System.out.println(directivo);
        }
        if (tecnico.size()!=0) {
            System.out.println("Oficial");
            System.out.println(tecnico);
        }
        if (oficial.size() != 0) {
            System.out.println("Técnico");
            System.out.println(oficial);
        }

    }
}
