/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicior12;
import java.util.Scanner;

/**
 *
 * @author Wesly
 */
public class EjercicioR12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar datos del trabajador
        System.out.print("Ingrese el nombre del trabajador: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el número de horas trabajadas en la semana: ");
        int horasTrabajadas = scanner.nextInt();

        System.out.print("Ingrese el valor por hora normal trabajada: ");
        double valorHoraNormal = scanner.nextDouble();

        // Calcular el salario
        double salario = Trabajador.calcularSalario(nombre, horasTrabajadas, valorHoraNormal);

        // Mostrar el resultado
        System.out.println("EL TRABAJADOR " + nombre + " DEVENGO: $" + salario);

        scanner.close();
    }
    
}
