/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nombre;

/**
 *
 * @author gerar
 */
public class Estudiantes {
    public class Main {
    public static void main(String[] args) {
        
        String[] nombres = {"Daniel", "Monica"};
        int[] notas = {65, 89};

        
        for (int i = 0; i < nombres.length; i++) {
            String nombre = nombres[i];
            int nota = notas[i];

           
            String resultado = (nota >= 70) ? "Aprobado" : "Reprobado";

            
            System.out.println(nombre);
            System.out.println(nota);
            System.out.println(resultado);
            System.out.println(); 
        }
    }
}

}
