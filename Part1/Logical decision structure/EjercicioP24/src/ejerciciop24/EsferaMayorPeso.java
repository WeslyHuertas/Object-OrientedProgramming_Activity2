/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciop24;

/**
 *
 * @author Wesly
 */
public class EsferaMayorPeso {
    // Método para determinar la esfera de mayor peso
    public static String determinarMayorPeso(double pesoA, double pesoB, double pesoC) {
        if (pesoA > pesoB && pesoA > pesoC) {
            return "La esfera A es la de mayor peso.";
        } else if (pesoB > pesoC) {
            return "La esfera B es la de mayor peso.";
        } else {
            return "La esfera C es la de mayor peso.";
        }
    }
}
