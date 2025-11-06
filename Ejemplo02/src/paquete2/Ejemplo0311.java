/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo0311 {
    public static void main(String[] args) {
        // Ingreso de datos por teclado
        // uso de la clase Scanner
        Scanner entrada = new Scanner(System.in);
        String nombre;
        String apellido;
        int nacimiento;
        int ciclo;
        String direccion;
        
        System.out.println("Ingrese el nombre del estudiante");
        nombre = entrada.nextLine(); // nextLine: obtiene una cadena ingresada
                                    // por teclado
        
        System.out.println("Ingrese el apellido del estudiante");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese su Dirección");
        direccion = entrada.nextLine();
        
        System.out.println("Ingrese el año de nacimiento del estudiante");
        nacimiento = entrada.nextInt();
        
        System.out.println("Ingrese su ciclo académico en número");
        ciclo = entrada.nextInt();
        
        System.out.printf("Datos del estudiante\n Nombre: %s\n Apellido:"
                + "%s\n Año de Nacimiento: %d\n Ciclo Academico: %s\n"
                + " Dirección: %s\n",
                nombre,
                apellido,
                nacimiento,
                ciclo,
                direccion);
        // hemos cambiado el porcentaje s a d porque es un dato entero
        
    }
}
