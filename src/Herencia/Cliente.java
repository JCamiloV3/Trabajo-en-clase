
package Herencia;

/**
 *
 * @author Camilo Velasco
 */
public class Cliente extends Empleado {
    
    private String direccion ;

    public Cliente(String direccion, double salario, String nombre, int edad) {
        super(salario, nombre, edad);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
