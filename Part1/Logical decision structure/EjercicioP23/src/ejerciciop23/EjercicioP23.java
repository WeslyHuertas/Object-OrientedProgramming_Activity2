/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciop23;
import java.util.Scanner;

/**
 *
 * @author Wesly
 */
public class EjercicioP23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los coeficientes de la ecuación
        System.out.print("Ingrese el valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Ingrese el valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Ingrese el valor de C: ");
        double c = scanner.nextDouble();

        // Calcular las soluciones
        String resultado = EcuacionSegundoGrado.calcularSoluciones(a, b, c);

        // Mostrar el resultado
        System.out.println(resultado);

        scanner.close();
    }
    
}
