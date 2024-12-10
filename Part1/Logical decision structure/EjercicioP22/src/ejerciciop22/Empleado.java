/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciop22;

/**
 *
 * @author Wesly
 */
public class Empleado {
    // Método para calcular el salario mensual y determinar el mensaje a mostrar
    public static String calcularSalario(String nombre, double salarioPorHora, int horasTrabajadas) {
        double salarioMensual = salarioPorHora * horasTrabajadas;
        if (salarioMensual > 450000) {
            return "Nombre: " + nombre + ", Salario mensual: $" + salarioMensual;
        } else {
            return "Nombre: " + nombre;
        }
    }
}
