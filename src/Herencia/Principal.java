
package Herencia;
import javax.swing.JOptionPane;

/**
 *
 * @author Camilo Velasco
 */

public class Principal {
    
  public static void main(String[] args) {
        if (true) {String opcion = JOptionPane.showInputDialog("Seleccione una opción:\n1."
                    + " Agregar Empleado\n2."
                    + " Agregar Cliente\n3."
                    + " Salir del programa");
          
            if (opcion.equals("1")) {
                
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del empleado:");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del empleado:"));
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el salario del empleado:"));
                
                Empleado emp = new Empleado(salario, nombre, edad);
                        
              JOptionPane.showInputDialog(null, " El empleado es: \n " + emp.getNombre()
                      + " Su edad es : \n " + emp.getEdad()
                      + " Su salario es : \n "+ emp.getSalario()); 
                      
            }
            
            else if (opcion.equals("2")) {
                
                String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del cliente:"));
                String direccion = JOptionPane.showInputDialog("Ingrese la dirección del cliente:");
                
                Cliente cli = new Cliente(direccion, edad, nombre, edad);
                
                JOptionPane.showInputDialog(null,"El cliente es:\n"
                        + cli.getNombre()
                        +"La edad es:\n"+ cli.getEdad()+"La direccion es:\n"+ cli.getDireccion());       
               } 
            
            else if (opcion.equals("3")){
            JOptionPane.showInputDialog("¡ Has salido del programa , vuelve pronto !");
            
          }
        }
       }        
     }

