/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicior11;
import java.util.Scanner;


/**
 *
 * @author Wesly
 */
public class EjercicioR11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres números al usuario
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int numero3 = scanner.nextInt();

        // Usar la clase MayorDeTres para encontrar el mayor número
        int mayor = MayorDeTres.encontrarMayor(numero1, numero2, numero3);

        // Mostrar el resultado
        System.out.println("El valor mayor entre " + numero1 + ", " + numero2 + " y " + numero3 + " es: " + mayor);

        scanner.close();
    }
    
}
