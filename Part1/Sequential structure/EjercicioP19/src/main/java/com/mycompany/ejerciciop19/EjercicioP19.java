/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop19;

import java.util.Scanner;

/**
 *
 * @author Wesly
 */
public class EjercicioP19 {

    public static void main(String[] args) {
        double perimetro, altura, area;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el valor del lado");
        double lado = entrada.nextInt();
        
        perimetro = Triangulo_Equilatero.obtener_perimetro(lado);
        area = Triangulo_Equilatero.obtener_area(lado);
        altura = Triangulo_Equilatero.obtener_altura(lado);
        
        System.out.println("Perimetro: " + perimetro);
        System.out.println("Perimetro: " + area);
        System.out.println("Perimetro: " + altura);
    }
}
