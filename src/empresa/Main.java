/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author osori
 */
public class Main {
    public static void main(String[] args) {
        // Crear la empresa
        Empresa empresa = new Empresa();

        // Crear empleados
        EmpleadoPorHoras empHoras = new EmpleadoPorHoras("Juan", "Perez", "123-45-6789", 0, 40, 15);
        EmpleadoPorSueldo empSueldo = new EmpleadoPorSueldo("Ana", "Gomez", "987-65-4321", 0, 2000, 150, 100);
        EmpleadoGerente empGerente = new EmpleadoGerente("Carlos", "Martinez", "555-55-5555", 0, 3000, 200, 150, 500, 100);

        // Agregar empleados a la empresa
        empresa.agregarEmpleado(empHoras);
        empresa.agregarEmpleado(empSueldo);
        empresa.agregarEmpleado(empGerente);

        // Imprimir detalles de cada empleado
        System.out.println(empHoras.getInformacion());
        System.out.println("Devengado: " + empHoras.calcularDevengado());
        System.out.println("Deducciones: " + empHoras.calcularDeducciones());
        System.out.println("Salario Neto: " + empHoras.calcularSalarioNeto());
        System.out.println();

        System.out.println(empSueldo.getInformacion());
        System.out.println("Devengado: " + empSueldo.calcularDevengado());
        System.out.println("Deducciones: " + empSueldo.calcularDeducciones());
        System.out.println("Salario Neto: " + empSueldo.calcularSalarioNeto());
        System.out.println();

        System.out.println(empGerente.getInformacion());
        System.out.println("Devengado: " + empGerente.calcularDevengado());
        System.out.println("Deducciones: " + empGerente.calcularDeducciones());
        System.out.println("Salario Neto: " + empGerente.calcularSalarioNeto());
        System.out.println();

        // Calcular y mostrar la nómina total
        System.out.println("La nomina total de la empresa es: " + empresa.calcularNominaEmpleado());
    }
}


