/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

/**
 *
 * @author osori
 */
public abstract class Empleado {
    protected String nombre;
    protected String apellido;
    protected String numeroSeguroSocial;
    protected double salarioBase;

    public Empleado(String nombre, String apellido, String numeroSeguroSocial, double salarioBase) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularDevengado();
    public abstract double calcularDeducciones();
    public double calcularSalarioNeto() {
        return calcularDevengado() - calcularDeducciones();
    }

    public String getInformacion() {
        return nombre + " " + apellido + ", NSS: " + numeroSeguroSocial + ", Salario Base: " + salarioBase;
    }
}
