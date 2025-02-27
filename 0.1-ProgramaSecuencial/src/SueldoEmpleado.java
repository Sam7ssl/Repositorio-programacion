//Realizar un programa que calcule e imprima el sueldo de un empleado, bajo las
//siguientes características
//a. Se debe almacenar el nombre del empleado
//b. Las horas trabajadas que deben ser horas sin parte fraccionaria
//c. Cuota por hora
//d. Se debe imprimir el nombre del Trabajador y el Sueldo que va a percibir
import javax.swing.*;
public class SueldoEmpleado {
    public static void main(String[] args) {
        double ht = 0;
        double ch = 0;
        double sue=0;

    // Solicitar el nombre del usuario
    String nombre = JOptionPane.showInputDialog("Ingresa el nombre");
    ht =Double.parseDouble(JOptionPane.showInputDialog("Ingresar las horas trabajadas: "));
    ch =Double.parseDouble(JOptionPane.showInputDialog("Ingresar cuota x hora: "));

    sue = (ht * ch);

    JOptionPane.showMessageDialog(null, "El nombre del trabajador es: " +
            nombre + "Su sueldo es: "+String.format("%.0f", sue));


    }
}
