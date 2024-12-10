/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicior12;

/**
 *
 * @author Wesly
 */
public class Trabajador {
    
    // Método para calcular el salario
    public static double calcularSalario(String nombre, int horasTrabajadas, double valorHoraNormal) {
        double salario;
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            if (horasExtras > 8) {
                int horasExtrasExcedentes = horasExtras - 8;
                salario = 40 * valorHoraNormal + 16 * valorHoraNormal + horasExtrasExcedentes * 3 * valorHoraNormal;
            } else {
                salario = 40 * valorHoraNormal + horasExtras * 2 * valorHoraNormal;
            }
        } else {
            salario = horasTrabajadas * valorHoraNormal;
        }
        return salario;
    }
    
}
