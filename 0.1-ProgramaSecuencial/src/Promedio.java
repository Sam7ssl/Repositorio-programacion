//Realizar un programa que calcule e imprima el promedio de cuatro calificaciones.
import javax.swing.*;
public class Promedio {
    public static void main(String[] args) {
        double cal1=0, cal2=0, cal3=0, cal4=0, r=0;

        cal1 =Double.parseDouble(JOptionPane.showInputDialog("Ingresar tu calificacion de programacion: "));
        cal2 =Double.parseDouble(JOptionPane.showInputDialog("Ingresar tu calificacion de redes: "));
        cal3 =Double.parseDouble(JOptionPane.showInputDialog("Ingresar tu calificacion de calculo: "));
        cal4 =Double.parseDouble(JOptionPane.showInputDialog("Ingresar tu calificacion de fisica: "));

        r=(cal1+cal2+cal3+cal4)/4;
        JOptionPane.showMessageDialog(null, "El resultado es: " + String.format("%.2f", r));
    }
}
