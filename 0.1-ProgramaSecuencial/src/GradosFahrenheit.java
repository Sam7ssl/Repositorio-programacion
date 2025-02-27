//Hacer un programa que dada la temperatura en grados centígrados (C) se pueda
//convertir a su equivalente Fahrenheit (F) con la fórmula:
import javax.swing.*;
public class GradosFahrenheit {
    public static void main(String[] args) {
        double c=0.0, f=0.0;

        c =Double.parseDouble(JOptionPane.showInputDialog("Ingresar la gtemperatuta celcius: "));

        f = (9/5.0)*c+32;

        JOptionPane.showMessageDialog(null, "La conversion a Fahrenheit es : " + String.format("%.4f", f));
    }
}
