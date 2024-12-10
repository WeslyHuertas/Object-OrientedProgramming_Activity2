/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop21;

import java.util.Scanner;

/**
 *
 * @author Wesly
 */
public class EjercicioP21 {

    public static void main(String[] args) {
        double la, lb, lc; // lado a, lado b, y lado c del triángulo
        double p,s; // perímetro y semiperimetro del triángulo
        
        double a; //área del triángulo
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del lado a");
        la = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado b");
        lb = entrada.nextDouble();
        
        System.out.println("Ingrese el valor del lado c");
        lc = entrada.nextDouble();
        
        p = Triangulo.obtener_perimetro(la, lb, lc);
        s = Triangulo.obtener_semiperimetro(p);
        a = Triangulo.obtener_area(s, la, lb, lc);
        
        System.out.println("Perimetro: " + p);
        System.out.println("Semiperimetro: " + s);
        System.out.println("Área: " + a);
    }
}
