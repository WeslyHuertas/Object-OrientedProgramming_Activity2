/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicior10;

/**
 *
 * @author Wesly
 */
public class Estudiante {
    // Atributos de la clase
    private String numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estratoSocial;

    // Constructor
    public Estudiante(String numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    // Método para calcular el pago de matrícula
    public double calcularPagoMatricula() {
        double pagoMatricula = 50000; // Valor base de matrícula
        if (patrimonio > 2000000 && estratoSocial > 3) {
            pagoMatricula += 0.03 * patrimonio;
        }
        return pagoMatricula;
    }

    // Método para mostrar los datos del estudiante
    public void mostrarInformacion() {
        double pagoMatricula = calcularPagoMatricula();
        System.out.println("EL ESTUDIANTE CON NUMERO DE INSCRIPCION " + numeroInscripcion);
        System.out.println("Y NOMBRE " + nombres);
        System.out.println("DEBE PAGAR: $" + pagoMatricula);
    }
}
