/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nombre;

/**
 *
 * @author gerar
 */
public class NewClass {
    public class Main {
    public static void main(String[] args) {
        
        int num1 = 8;
        int num2 = 4;
        
        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + (num1 / num2));
        System.out.println("Módulo: " + (num1 % num2));

        
        int M = 6, T = 1, K = -10;

        System.out.println("\nEvaluación de expresiones:");
        System.out.println("M > T: " + (M > T));               
        System.out.println("T / K == -5: " + (T / K == -5));   
        System.out.println("(M + T == 7) || (M - T == 5): " + ((M + T == 7) || (M - T == 5)));  

        
        String[] nombresCompañeros = {"Luis", "Ana", "Carlos", "Maria", "Juan", "Pedro", "Sofia", "David", "Laura", "Isabel"};
        
        System.out.println("\nNombres de 10 compañeros:");
        for (String nombre : nombresCompañeros) {
            System.out.println(nombre);
        }

        
        String[][] datosCompañeros = {
            {"Luis", "Perez", "Ingeniería", "ABC Corp"},
            {"Ana", "Gonzalez", "Medicina", "Hospital XYZ"},
            {"Carlos", "Martinez", "Derecho", "Bufete Legal"},
            {"Maria", "Lopez", "Arquitectura", "Construcciones SA"},
            {"Juan", "Hernandez", "Informática", "Tech Solutions"}
        };

        System.out.println("\nDatos de compañeros (nombre, apellido, carrera, lugar de trabajo):");
        for (String[] compañero : datosCompañeros) {
            System.out.println("Nombre: " + compañero[0] + ", Apellido: " + compañero[1] +
                               ", Carrera: " + compañero[2] + ", Lugar de Trabajo: " + compañero[3]);
        }
    }
}

}
