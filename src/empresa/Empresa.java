/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author osori
 */
// Empresa.java
import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    // Método para agregar empleados
    public void agregarEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para calcular la nómina total de los empleados
    public double calcularNominaEmpleado() {
        double totalNomina = 0;
        for (Empleado emp : empleados) {
            totalNomina += emp.calcularSalarioNeto();
        }
        return totalNomina;
    }
}
