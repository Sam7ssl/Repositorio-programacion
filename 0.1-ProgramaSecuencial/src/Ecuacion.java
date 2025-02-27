//Realizar un programa que obtenga el valor de X de la siguiente ecuación
//Y = 3X
//2 + 7X − 15
import javax.swing.*;
public class Ecuacion {
    public static void main(String[] args) {
        double x=0.0, r=0.0;

        x =Double.parseDouble(JOptionPane.showInputDialog("Ingresar tu calificacion de programacion: "));

        r = 3*(Math.pow(x, 2))+(7*x)-15;

        JOptionPane.showMessageDialog(null,
                "El resultado es: " + String.format("%.2f", r));
    }
}
