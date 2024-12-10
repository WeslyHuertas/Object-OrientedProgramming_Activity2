/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicior13;
import java.util.Scanner;

/**
 *
 * @author Wesly
 */
public class EjercicioR13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos de la compra
        System.out.print("Ingrese el valor de la compra: ");
        double valorCompra = scanner.nextDouble();

        System.out.print("Ingrese el color de la bolita (Blanco, Verde, Amarillo, Azul, Roja): ");
        String colorBolita = scanner.next();

        // Calcular el valor a pagar
        double valorPagar = Almacen.calcularValorPagar(valorCompra, colorBolita);

        // Mostrar el resultado
        System.out.println("EL CLIENTE DEBE PAGAR: $" + valorPagar);

        scanner.close();
    }
    
}
