/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicior10;

import java.util.Scanner;

/**
 *
 * @author Wesly
 */
public class EjercicioR10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del estudiante
        System.out.print("Ingrese el número de inscripción: ");
        String numeroInscripcion = scanner.nextLine();

        System.out.print("Ingrese los nombres del estudiante: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese el patrimonio del estudiante: ");
        double patrimonio = scanner.nextDouble();

        System.out.print("Ingrese el estrato social del estudiante: ");
        int estratoSocial = scanner.nextInt();

        // Crear objeto de la clase Estudiante
        Estudiante estudiante = new Estudiante(numeroInscripcion, nombres, patrimonio, estratoSocial);

        // Mostrar información del estudiante
        estudiante.mostrarInformacion();

        scanner.close();
        
        
    }
    
}
