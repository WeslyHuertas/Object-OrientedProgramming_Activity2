/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicior15;

/**
 *
 * @author Wesly
 */
public class EsferaDiferente {
    // Método para determinar la esfera diferente y si es de mayor o menor peso
    public static String determinarEsferaDiferente(double pesoA, double pesoB, double pesoC, double pesoD) {
        if (pesoA == pesoB && pesoA == pesoC) {
            if (pesoD > pesoA) {
                return "La esfera D es la diferente y es de mayor peso.";
            } else {
                return "La esfera D es la diferente y es de menor peso.";
            }
        } else if (pesoA == pesoB && pesoA == pesoD) {
            if (pesoC > pesoA) {
                return "La esfera C es la diferente y es de mayor peso.";
            } else {
                return "La esfera C es la diferente y es de menor peso.";
            }
        } else if (pesoA == pesoC && pesoA == pesoD) {
            if (pesoB > pesoA) {
                return "La esfera B es la diferente y es de mayor peso.";
            } else {
                return "La esfera B es la diferente y es de menor peso.";
            }
        } else {
            if (pesoA > pesoB) {
                return "La esfera A es la diferente y es de mayor peso.";
            } else {
                return "La esfera A es la diferente y es de menor peso.";
            }
        }
    }
}
