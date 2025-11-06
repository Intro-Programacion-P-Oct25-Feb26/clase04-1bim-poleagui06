/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo11 {

    public static void main(String[] args) {
        // Ingreso de valores por teclado
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US); // para ingresar los decimales con 
                                        // punto
                                        // no con coma
        // declarar las variables
        String nombreAsignatura1;
        String nombreAsignatura2;
        double notaAsignatura1;
        double notaAsignatura2;
        
        System.out.println("Ingrese nombre de asignatura 1");
        nombreAsignatura1 = entrada.nextLine(); // nextLine me permite escribir 
                                                // una cadena
        System.out.println("Ingrese nota de asignatura 1");
        notaAsignatura1 = entrada.nextDouble(); 

        // %.2f Significa que voy a recibir un decimal y q ese decimal lo voy a 
        // representar con 2
        System.out.printf("Asignatura 1:"
                + " %s\nNota 1:%.2f", 
                nombreAsignatura1, 
                notaAsignatura1);

   
    }
    
}
