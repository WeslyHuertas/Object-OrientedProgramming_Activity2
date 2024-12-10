/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciop24;
import java.util.Scanner;

/**
 *
 * @author Wesly
 */
public class EjercicioP24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar pesos de las esferas
        System.out.print("Ingrese el peso de la esfera A: ");
        double pesoA = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera B: ");
        double pesoB = scanner.nextDouble();

        System.out.print("Ingrese el peso de la esfera C: ");
        double pesoC = scanner.nextDouble();

        // Determinar la esfera de mayor peso
        String resultado = EsferaMayorPeso.determinarMayorPeso(pesoA, pesoB, pesoC);

        // Mostrar el resultado
        System.out.println(resultado);

        scanner.close();
    }
    
}
