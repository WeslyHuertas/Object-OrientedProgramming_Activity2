/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicior11;

/**
 *
 * @author Wesly
 */
public class MayorDeTres {
    
    // Método para encontrar el número mayor
    public static int encontrarMayor(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }
    
}
