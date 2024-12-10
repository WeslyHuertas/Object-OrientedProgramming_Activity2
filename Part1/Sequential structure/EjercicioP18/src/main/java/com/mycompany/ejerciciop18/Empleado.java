/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejerciciop18;

/**
 *
 * @author Wesly
 */
public class Empleado {
    
    int codigo_empleado;
    String nombre_empleado;
    int numero_horas_trabjadas_mes;
    double valor_hora_trabajada;
    int retencion_fuente;
    double porcentaje_retencion;
    double salario_bruto;
    double salario_neto;
    
    public static double calcular_porcentaje_retencion(double retencion_fuente){
        return retencion_fuente/100;
    }
    
    public static double calcular_salario_bruto(int numero_horas_trabjadas_mes, double valor_hora_trabajada){
        return numero_horas_trabjadas_mes * valor_hora_trabajada;
    }
    
    public static double calcular_salario_neto(double salario_bruto, double porcentaje_retencion){
        return salario_bruto - (1 - porcentaje_retencion);
    }
}
