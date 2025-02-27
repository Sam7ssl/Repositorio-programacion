//Calcular el resultado de la expresión N = X+Y / Y−1
// para los valores de X=5 y Y=3
import javax.swing.*;

public class Exprecion {
    public static void main(String[] args) {
    double x = 0, y=0, r=0;
    String salida;

        // Captura del valor de X
    x = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de x: "));
        // Captura del valor de y
    y = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de x: "));
    // Cálculo de la expresión (X + Y) / (Y - 1)
    r=(x+y)/(y-1);
        // Mostrar el resultado con 4 decimales
    JOptionPane.showMessageDialog(null, "El resultado es: " + String.format("%.4f", r));
    }
}
