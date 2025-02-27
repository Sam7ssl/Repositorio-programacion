//Escribir un programa que convierte los 2, 5 y 10 pulgadas a milímetros (1 pulgada =25,4 mm).
import javax.swing.*;
public class PulgadasMilimetros {
    public static void main(String[] args) {
        double pulgada=0.0, milimetros=0.0;

        pulgada=Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de las pulgadas"));

        milimetros=pulgada*25.4;

        JOptionPane.showMessageDialog(null,
                "La convercion a milimetros es: " + milimetros);

    }
}
