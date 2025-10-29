/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombreEstudiante = "Jean Paul";
        String apellidoEstudiante = "Aguilar Morocho";
        String edadEstudiante = "19 años";
        String direccionEstudiante = "Cll. Manaos";
        String universidad = "UTPL";
        String ciclo = "Primer ciclo";
        String asignatura = "Introducción a la programación";
        String paralelo = "paralelo A";
        
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        /* System.out.printf("Nombre:%s\n\n%s\n\n%s\n", nombreEstudiante, 
         apellidoEstudiante); */
        
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad: %s\nDirección:"
                    + "\n\n\t%s\n----\nUniversidad: %s\nCiclo: %s\nAsignatura: "
                    + "%s\nParalelo:\n\t%s\n", nombreEstudiante, 
        apellidoEstudiante, edadEstudiante, direccionEstudiante, universidad, 
        ciclo, asignatura, paralelo);
    }
}
