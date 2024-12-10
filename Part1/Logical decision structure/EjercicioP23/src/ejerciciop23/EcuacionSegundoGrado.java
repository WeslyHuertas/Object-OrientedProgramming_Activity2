/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciop23;

/**
 *
 * @author Wesly
 */
public class EcuacionSegundoGrado {
    // Método para calcular las soluciones de la ecuación de segundo grado
    public static String calcularSoluciones(double a, double b, double c) {
        if (a == 0) {
            return "El valor de A no puede ser cero en una ecuación de segundo grado.";
        }

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double solucion1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double solucion2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            return "Las soluciones son: x1 = " + solucion1 + ", x2 = " + solucion2;
        } else if (discriminante == 0) {
            double solucionUnica = -b / (2 * a);
            return "La solución única es: x = " + solucionUnica;
        } else {
            return "La ecuación no tiene soluciones reales.";
        }
    }
}
