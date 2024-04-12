
package Herencia;

/**
 *
 * @author Camilo Velasco
 */
public class Empleado extends Persona {
    
    private double salario ;

    public Empleado(double salario, String nombre, int edad) {
        super(nombre, edad);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
