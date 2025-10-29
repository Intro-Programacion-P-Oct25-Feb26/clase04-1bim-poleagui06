/*
René Rolando

Elizalde Solano

1983
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo051 {

    public static void main(String[] args) {
        // Secuencia de escape \n y \t
        String nombreEstudiante = "René Rolando";
        String apellidoEstudiante = "Elizalde Solano";
        int nacimiento = 1983;

        System.out.println(nombreEstudiante + "\n" + apellidoEstudiante + "\n"
                + nacimiento);

        System.out.println(nombreEstudiante + "\n\n" + apellidoEstudiante + "\n\n"
                + nacimiento);

        System.out.println(nombreEstudiante + "\n" + "\n" + apellidoEstudiante + "\n"
                + "\n" + nacimiento);

        // "\t"   => representa un tab = 4 espacios por defecto.
        // "\n"   => representa un cambio de linea.
        // "\n\t" => representa un un cambio de linea y 4 espacios(tab).
        /* 
        System.out.println(nombreEstudiante+"\t"+apellidoEstudiante);   
        System.out.println(nombreEstudiante+"\n\t"+apellidoEstudiante);  
         */
    }
}
