package org.iesvdm.ejercicios.ej1.estructura;


import org.iesvdm.ejercicios.ej1.anotacion.Empleado;

import java.util.*;

public class CargadorDeContexto {
    // Aquí es donde se procesan los datos, creando un mapa que tenga una clave y valor.

    // Se pone String como clave, porque los atributos de Directivo, Operario, y Tecnico, en la clase Empleado, son String;
    // Y se pone Empresa, como valor, ya que vamos a manejar las clases de Directivo, Oficial, Operario, y Tecnico, ya que son las que heredan de Empleado.

    // El cargador de contexto procesa los datos de tal manera que, al ejecutar el programa, solo es necesario añadir anotaciones a la clase;

    // 1º, debemos obtener las anotaciones de la clase Empresa;

    public void cargadorContexto() {

        var empleadosAnnotation = Empresa.class.getAnnotationsByType(Empleado.class);
        // Esto se utiliza para obtener las anotaciones de la clase Empresa;

        System.out.println();

        var emp1 = new ArrayList<>();
        var emp2 = new ArrayList<>();
        var emp3 = new ArrayList<>();

//        for (Empleado empleadoAnnotation : empleadosAnnotation) {
//
//            // Recorremos la clase Empleado
//            // Por cada recorrido del bucle, el objeto empleadoAnnotation, toma el objeto de empleadosAnnotation, del array Empleado, que a su misma vez,
//            // recoge las anotaciones de la clase Empresa
//
//            var telefono = String.valueOf(empleadoAnnotation.telefono());
//            var codDespacho = String.valueOf(empleadoAnnotation.codigoDespacho());
//
//            if (empleadoAnnotation.clase().equals("Directivo")) {
//                emp1.add(empleadoAnnotation.nombre());
//                emp1.add(empleadoAnnotation.apellidos());
//                emp1.add(empleadoAnnotation.dni());
//                emp1.add(empleadoAnnotation.direccion());
//                emp1.add(telefono);
//                emp1.add(codDespacho);
//
//            } else if (empleadoAnnotation.clase().equals("Técnico")) {
//                emp2.add(empleadoAnnotation.nombre());
//                emp2.add(empleadoAnnotation.apellidos());
//                emp2.add(empleadoAnnotation.dni());
//                emp2.add(empleadoAnnotation.direccion());
//                emp2.add(telefono);
//                emp2.add(codDespacho);
//
//            } else if (empleadoAnnotation.clase().equals("Oficial")) {
//                emp3.add(empleadoAnnotation.nombre());
//                emp3.add(empleadoAnnotation.apellidos());
//                emp3.add(empleadoAnnotation.dni());
//                emp3.add(empleadoAnnotation.direccion());
//                emp3.add(telefono);
//                emp3.add(codDespacho);
//
//            }
//
//            // Ahora necesitamos comprobar si el Empleado de la anotación es Directivo, Tecnico, u Oficial;
//            // Para ello volcamos todos las anotaciones de la clase Empresa, en la lista empleadosAnnotation;
//
//        }
//
//        if (emp1.size() != 0) {
//            System.out.println("Directivo");
//            System.out.println(emp1);
//        }
//        if (emp2.size()!=0) {
//            System.out.println("Técnico");
//            System.out.println(emp2);
//        }
//        if (emp3.size() != 0) {
//            System.out.println("Oficial");
//            System.out.println(emp3);
//        }


        for (Empleado emp : empleadosAnnotation) {
            if (emp.clase().equals("Directivo")) {
                System.out.println("\n" + emp.clase());
                System.out.println("-----------------");
                System.out.println("Nombre: " + emp.nombre());
                System.out.println("Apellidos: " + emp.apellidos());
                System.out.println("Dirección: " + emp.direccion());
                System.out.println("DNI: " + emp.dni());
                System.out.println("Teléfono: " + emp.telefono());
                System.out.println("Código Despacho: " + emp.codigoDespacho());
                System.out.println("-----------------");
            }
            if (emp.clase().equals("Técnico")) {
                System.out.println("\n" + emp.clase());
                System.out.println("-----------------");
                System.out.println("Nombre: " + emp.nombre());
                System.out.println("Apellidos: " + emp.apellidos());
                System.out.println("Dirección: " + emp.direccion());
                System.out.println("DNI: " + emp.dni());
                System.out.println("Teléfono: " + emp.telefono());
                System.out.println("Código Despacho: " + emp.codigoDespacho());
                System.out.println("-----------------");
            }
            if (emp.clase().equals("Oficial")) {
                System.out.println("\n" + emp.clase());
                System.out.println("-----------------");
                System.out.println("Nombre: " + emp.nombre());
                System.out.println("Apellidos: " + emp.apellidos());
                System.out.println("Dirección: " + emp.direccion());
                System.out.println("DNI: " + emp.dni());
                System.out.println("Teléfono: " + emp.telefono());
                System.out.println("Código Despacho: " + emp.codigoDespacho());
                System.out.println("-----------------");
            }
        }


    }
}
