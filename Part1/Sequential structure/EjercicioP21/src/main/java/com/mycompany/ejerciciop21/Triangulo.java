/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciop21;
import java.lang.Math;

/**
 *
 * @author Wesly
 */
public class Triangulo {
    public static double obtener_perimetro(double la, double lb, double lc){
        return la + lb + lc;
    }
    
    public static double obtener_semiperimetro(double p){
        return p/2;
    }
    
    public static double obtener_area(double s, double la, double lb, double lc){
        return  Math.sqrt(s*(s-la)*(s-lb)*(s-lc));
    }
}
