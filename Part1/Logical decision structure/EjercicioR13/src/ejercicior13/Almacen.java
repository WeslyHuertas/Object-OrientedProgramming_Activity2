/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicior13;

/**
 *
 * @author Wesly
 */
public class Almacen {
    
    // Método para calcular el valor a pagar con descuento
    public static double calcularValorPagar(double valorCompra, String colorBolita) {
        double porcentajeDescuento;
        switch (colorBolita.toUpperCase()) {
            case "BLANCO":
                porcentajeDescuento = 0;
                break;
            case "VERDE":
                porcentajeDescuento = 10;
                break;
            case "AMARILLO":
                porcentajeDescuento = 25;
                break;
            case "AZUL":
                porcentajeDescuento = 50;
                break;
            default: // Se asume que es ROJA
                porcentajeDescuento = 100;
                break;
        }
        return valorCompra - (porcentajeDescuento * valorCompra / 100);
    }
    
}
