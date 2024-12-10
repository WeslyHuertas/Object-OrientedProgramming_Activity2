/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicior14;
import java.util.Scanner;

/**
 *
 * @author Wesly
 */
public class EjercicioR14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos de la empresa
        System.out.print("Ingrese las ventas del departamento 1: ");
        double ventasDepto1 = scanner.nextDouble();

        System.out.print("Ingrese las ventas del departamento 2: ");
        double ventasDepto2 = scanner.nextDouble();

        System.out.print("Ingrese las ventas del departamento 3: ");
        double ventasDepto3 = scanner.nextDouble();

        System.out.print("Ingrese el salario base de los vendedores: ");
        double salarioBase = scanner.nextDouble();

        // Calcular total de ventas y salarios finales
        double totalVentas = ventasDepto1 + ventasDepto2 + ventasDepto3;

        double salarioDepto1 = Empresa.calcularSalarioFinal(ventasDepto1, totalVentas, salarioBase);
        double salarioDepto2 = Empresa.calcularSalarioFinal(ventasDepto2, totalVentas, salarioBase);
        double salarioDepto3 = Empresa.calcularSalarioFinal(ventasDepto3, totalVentas, salarioBase);

        // Mostrar resultados
        System.out.println("SALARIO VENDEDORES DEPTO. 1: $" + salarioDepto1);
        System.out.println("SALARIO VENDEDORES DEPTO. 2: $" + salarioDepto2);
        System.out.println("SALARIO VENDEDORES DEPTO. 3: $" + salarioDepto3);

        scanner.close();
    }
    
}
