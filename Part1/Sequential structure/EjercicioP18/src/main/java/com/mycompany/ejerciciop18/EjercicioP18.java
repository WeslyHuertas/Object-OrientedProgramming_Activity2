/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejerciciop18;
import java.util.Scanner; 
/**
 *
 * @author Wesly
 */
public class EjercicioP18 {
    
    public static void main(String[] args) {
       
        double salario_bruto;
        double salario_neto;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese codigo del empleado");
        int codigo_empleado = entrada.nextInt();
        
        System.out.println("Ingrese nombre del empleado");
        String nombre_empleado = entrada.next();
        
        System.out.println("Ingrese valor de la retención");
        double porcentaje_retencion = entrada.nextDouble();
        
        System.out.println("Ingrese cantidad de horas trabajadas al mes");
        int horas_trabajadas_mes = entrada.nextInt();
        
        System.out.println("Ingrese el valor de la hora trabajada");
        double valor_hora_trabajada = entrada.nextDouble();
        
        Empleado empleado1 = new Empleado();
               
        porcentaje_retencion = empleado1.calcular_porcentaje_retencion(porcentaje_retencion);
        salario_bruto = empleado1.calcular_salario_neto(horas_trabajadas_mes, valor_hora_trabajada);
        salario_neto = empleado1.calcular_salario_neto(salario_bruto, porcentaje_retencion);
        
        System.out.println("Código: " + codigo_empleado);
        System.out.println("Nombre: " + nombre_empleado);
        System.out.println("Salario bruto: " + salario_bruto);
        System.out.println("Salario neto: " + salario_neto);
    }
}
