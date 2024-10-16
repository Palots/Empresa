/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author osori
 */
// EmpleadoPorHoras.java
// EmpleadoPorHoras.java
public class EmpleadoPorHoras extends Empleado {
    private double horasTrabajadas;
    private double tarifaPorHora;

    public EmpleadoPorHoras(String nombre, String apellido, String numeroSeguroSocial, double salarioBase, double horasTrabajadas, double tarifaPorHora) {
        super(nombre, apellido, numeroSeguroSocial, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    @Override
    public double calcularDevengado() {
        return horasTrabajadas * tarifaPorHora;
    }

    @Override
    public double calcularDeducciones() {
        // Supongamos que se descuenta un 10% como deducción
        return calcularDevengado() * 0.10;
    }
}
