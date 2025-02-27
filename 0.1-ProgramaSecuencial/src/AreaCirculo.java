//Calcular el área de un Circulo
import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {
        double PI = 3.1416;
        double a = 0;
        double r = 0;
        String salida;

        r = Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de r: "));
        a = PI * Math.pow(r,2);

        JOptionPane.showMessageDialog(null, "El area del circulo es: " + a);
    }
}
