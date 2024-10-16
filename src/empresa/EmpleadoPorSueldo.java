/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author osori
 */
public class EmpleadoPorSueldo extends Empleado {
    private double sueldoMensual;
    private double retencionFuente;
    private double pension;

    public EmpleadoPorSueldo(String nombre, String apellido, String numeroSeguroSocial, double salarioBase, double sueldoMensual, double retencionFuente, double pension) {
        super(nombre, apellido, numeroSeguroSocial, salarioBase);
        this.sueldoMensual = sueldoMensual;
        this.retencionFuente = retencionFuente;
        this.pension = pension;
    }

    @Override
    public double calcularDevengado() {
        return sueldoMensual;
    }

    @Override
    public double calcularDeducciones() {
        return retencionFuente + pension;
    }
}
