//Realizar un programa que calcule e imprima el área de un triangulo
import javax.swing.*;

//Realizar un programa que calcule e imprima el área de un triangulo
public class AreaTriangulo {
    public static void main(String[] args) {
    double b=0;
    double h=0;
    double a=0;

    b= Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de la base: "));
    h= Double.parseDouble(JOptionPane.showInputDialog("Ingresar el valor de la base: "));

    a=(b*h)/2;

    JOptionPane.showMessageDialog(null, "El area del triangulo es: " + a);
    }
}
