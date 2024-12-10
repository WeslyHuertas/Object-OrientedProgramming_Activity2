/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicior15;
import java.util.Scanner;

/**
 *
 * @author Wesly
 */
public class EjercicioR15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los pesos de las esferas
        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera D: ");
        double pesoD = scanner.nextDouble();

        // Determinar cuál es la esfera diferente
        String resultado = EsferaDiferente.determinarEsferaDiferente(pesoA, pesoB, pesoC, pesoD);

        // Mostrar el resultado
        System.out.println(resultado);

        scanner.close();
    }
    
}
