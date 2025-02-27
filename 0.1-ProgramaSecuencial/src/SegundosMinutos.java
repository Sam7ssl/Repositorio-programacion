//Hacer un programa que convierta un número dado en segundos a minutos y que
//imprima el resultado
import javax.swing.*;
public class SegundosMinutos {
    public static void main(String[] args) {
        double s=0, m=60, r=0;

        s =Double.parseDouble(JOptionPane.showInputDialog("Ingresar el tiempo en segundos: "));

        r = s/m;

        JOptionPane.showMessageDialog(null, "La conversion a minutos es: " + String.format("%.4f", r));
    }
}
