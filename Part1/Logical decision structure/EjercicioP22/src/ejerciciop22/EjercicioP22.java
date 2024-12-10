/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciop22;
import java.util.Scanner;

/**
 *
 * @author Wesly
 */
public class EjercicioP22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el salario básico por hora: ");
        double salarioPorHora = scanner.nextDouble();

        System.out.print("Ingrese el número de horas trabajadas en el mes: ");
        int horasTrabajadas = scanner.nextInt();

        // Calcular el resultado
        String resultado = Empleado.calcularSalario(nombre, salarioPorHora, horasTrabajadas);

        // Mostrar el resultado
        System.out.println(resultado);

        scanner.close();
    }
    
}
