/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicior14;

/**
 *
 * @author Wesly
 */
public class Empresa {
    public static double calcularSalarioFinal(double ventasDepartamento, double totalVentas, double salarioBase) {
        double porcentajeVentas = totalVentas * 0.33;
        if (ventasDepartamento > porcentajeVentas) {
            return salarioBase + salarioBase * 0.2;
        } else {
            return salarioBase;
        }
    }
}
